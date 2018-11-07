package com.xrotor.design.pattern.action.chainofresponsibility;

import com.xrotor.design.pattern.action.chainofresponsibility.http.Request;
import com.xrotor.design.pattern.action.chainofresponsibility.http.Response;
import com.xrotor.design.pattern.action.chainofresponsibility.servlet.Filter;
import com.xrotor.design.pattern.action.chainofresponsibility.servlet.FilterChain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eks5115
 */
public class ApplicationFilterChain implements FilterChain {

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

    void release() {
        pos = 0;
    }
}
