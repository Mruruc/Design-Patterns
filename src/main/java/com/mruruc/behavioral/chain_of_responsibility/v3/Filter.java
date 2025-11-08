package com.mruruc.behavioral.chain_of_responsibility.v3;

import com.mruruc.behavioral.chain_of_responsibility.common.Request;
import com.mruruc.behavioral.chain_of_responsibility.common.Response;

@FunctionalInterface
public interface Filter {
    void doFilter(Request request, Response response, FilterChain chain) throws Exception;
}
