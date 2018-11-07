package com.xrotor.action.chainofresponsibility.servlet;

import com.xrotor.action.chainofresponsibility.http.Request;
import com.xrotor.action.chainofresponsibility.http.Response;

/**
 * @author eks5115
 */
public interface Filter {

    /**
     * fetch data by rule id
     *
     * @param request  rule id
     * @param response page number
     * @param chain    json format context
     */
    void doFilter(Request request, Response response, FilterChain chain);
}
