package com.xrotor.action.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eks5115
 */
public class ApplicationFilterChain extends ApplicationFilter implements FilterChain {


    private List<Filter> filters = new ArrayList<>();

    /**
     *
     */
    private int pos = 0;

    @Override
    public void doFilter(Request request, Response response) {
        if (pos == filters.size()) {
            return;
        }

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
