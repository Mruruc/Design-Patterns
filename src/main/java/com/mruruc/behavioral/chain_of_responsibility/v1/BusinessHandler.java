package com.mruruc.behavioral.chain_of_responsibility.v1;

import com.mruruc.behavioral.chain_of_responsibility.common.Request;
import com.mruruc.behavioral.chain_of_responsibility.common.Response;

public class BusinessHandler extends AbstractHandler {

    @Override
    public Response handleInternal(Request request) {
        System.out.println("Processing business for: " + request.payload());
        return new Response(true, "Business handled");
    }
}
