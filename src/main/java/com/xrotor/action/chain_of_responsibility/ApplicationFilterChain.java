package com.xrotor.action.chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eks5115 on 2017/9/20.
 */
public class ApplicationFilterChain implements FilterChain {


    List<Filter> filters = new ArrayList<>();

    /**
     *
     */
    private int pos = 0;

    @Override
    public void doFilter(Request request, Response response) {
        if (pos == filters.size())
            return;
        filters.get(pos++).doFilter(request, response, this);
    }

    /**
     *
     * @param filter
     */
    public ApplicationFilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }
}
