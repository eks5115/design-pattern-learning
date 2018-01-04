package com.xrotor.action.chainofresponsibility;

/**
 *
 * @author eks5115
 */
public interface FilterChain {
    /**
     * doFilter
     * @param request
     * @param response
     */
    void doFilter(Request request, Response response);
}
