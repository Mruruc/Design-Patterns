package com.mruruc.behavioral.chain_of_responsibility.v1;

import com.mruruc.behavioral.chain_of_responsibility.common.Request;
import com.mruruc.behavioral.chain_of_responsibility.common.Response;

public interface Handler {

    void setNext(Handler handler);

    Response handle(Request request);
}
