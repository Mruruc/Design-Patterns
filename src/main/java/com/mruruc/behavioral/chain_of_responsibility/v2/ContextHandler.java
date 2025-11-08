package com.mruruc.behavioral.chain_of_responsibility.v2;

@FunctionalInterface
public interface ContextHandler {
    void handle(Context context);
}
