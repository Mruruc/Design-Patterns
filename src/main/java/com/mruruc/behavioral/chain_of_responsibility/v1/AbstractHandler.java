package com.mruruc.behavioral.chain_of_responsibility.v1;

import com.mruruc.behavioral.chain_of_responsibility.common.Request;
import com.mruruc.behavioral.chain_of_responsibility.common.Response;

public abstract class AbstractHandler implements Handler {
    protected Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    protected Handler getNext() {
        return next;
    }

    @Override
    public Response handle(Request request) {
        Response response = handleInternal(request);

        if (response != null && response.isHandled()) {
            return response;
        }

        if (next != null) {
            return next.handle(request);
        }

        return new Response(false, "Request was not handled.");
    }

    public abstract Response handleInternal(Request request);
}
