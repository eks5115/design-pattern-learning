package com.xrotor.design.pattern.action.chainofresponsibility.servlet;

import com.xrotor.design.pattern.action.chainofresponsibility.http.Request;
import com.xrotor.design.pattern.action.chainofresponsibility.http.Response;

/**
 *
 * @author eks5115
 */
public interface FilterChain {
    /**
     * doFilter
     * @param request request
     * @param response response
     */
    void doFilter(Request request, Response response);
}
