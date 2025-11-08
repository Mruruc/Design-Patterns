package com.mruruc.behavioral.chain_of_responsibility.v3;

import com.mruruc.behavioral.chain_of_responsibility.common.Request;
import com.mruruc.behavioral.chain_of_responsibility.common.Response;

import java.util.List;

public class FilterChain {
    private final List<Filter> filters;
    private int currentPosition = 0;

    public FilterChain(List<Filter> filters) {
        this.filters = List.copyOf(filters);
    }

    public void executeFilterChain(Request request, Response response) throws Exception{
        if(currentPosition < filters.size()){
            Filter filter = filters.get(currentPosition);
            currentPosition++;
            filter.doFilter(request,response,this);
        }
    }

}
