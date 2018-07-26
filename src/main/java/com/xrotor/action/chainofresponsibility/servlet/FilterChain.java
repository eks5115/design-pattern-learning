package com.xrotor.action.chainofresponsibility.servlet;

import com.xrotor.action.chainofresponsibility.http.Request;
import com.xrotor.action.chainofresponsibility.http.Response;

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
