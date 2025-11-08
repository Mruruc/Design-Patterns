package com.mruruc.behavioral.chain_of_responsibility.v3;

import java.util.ArrayList;
import java.util.List;

public class FilterManager {
    private static final List<Filter> FILTERS = new ArrayList<>();

    public static void addFilter(Filter filter) {
        FILTERS.add(filter);
    }

    public static List<Filter> getFilters() {
        return List.copyOf(FILTERS);
    }

}
