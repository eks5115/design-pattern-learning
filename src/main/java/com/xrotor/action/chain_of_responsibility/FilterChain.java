package com.xrotor.action.chain_of_responsibility;

/**
 * Created by eks5115 on 2017/9/20.
 */
public interface FilterChain {
    void doFilter(Request request, Response response);
}
