package com.xrotor.action.chain_of_responsibility;

/**
 * @author eks5115
 * @date 2017/9/20
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
