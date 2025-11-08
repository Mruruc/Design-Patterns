package com.mruruc.behavioral.chain_of_responsibility.v1;

import com.mruruc.behavioral.chain_of_responsibility.common.Request;
import com.mruruc.behavioral.chain_of_responsibility.common.Response;

public class AuthHandler extends AbstractHandler {

    @Override
    public Response handleInternal(Request request) {
        System.out.println("Authenticating request: " + request.payload());
        if (request.payload().contains("AUTH")) {
            return new Response(false, "Authenticated"); // continue
        }
        return new Response(true, "Authentication failed"); // handled -> stop chain
    }
}
