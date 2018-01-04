package com.xrotor.action.chainofresponsibility;

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
     * @return void
     */
    default void doFilter(Request request, Response response, FilterChain chain) {

    }
}
