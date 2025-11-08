package com.mruruc.behavioral.chain_of_responsibility.v2;

import java.util.ArrayList;
import java.util.List;

public class ContextHandlerChain {
    private final List<ContextHandler> handlers;

    public ContextHandlerChain(List<ContextHandler> handlers) {
        this.handlers = List.copyOf(handlers);
    }

    public void execute(Context context) {
        for (ContextHandler handler : handlers) {
            if (context.isAborted()) break;
            try {
                handler.handle(context);
            } catch (Exception exception) {
                context.abort("Exception: " + exception.getMessage());
                break;
            }
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final List<ContextHandler> list = new ArrayList<>();

        public Builder add(ContextHandler handler) {
            list.add(handler);
            return this;
        }

        public ContextHandlerChain build() {
            return new ContextHandlerChain(list);
        }
    }
}
