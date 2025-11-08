package com.mruruc.behavioral.chain_of_responsibility.v1;

import com.mruruc.behavioral.chain_of_responsibility.common.Request;
import com.mruruc.behavioral.chain_of_responsibility.common.Response;

public class LoggingHandler extends AbstractHandler {
    @Override
    public Response handleInternal(Request request) {
        System.out.println("Logging request: " + request.payload());
        return new Response(false, "Request logged successfully.");
    }
}
