package com.xrotor.action.chainofresponsibility.filter;

import com.xrotor.action.chainofresponsibility.servlet.FilterChain;
import com.xrotor.action.chainofresponsibility.http.Request;
import com.xrotor.action.chainofresponsibility.http.Response;
import com.xrotor.action.chainofresponsibility.servlet.Filter;

/**
 *
 * @author eks5115
 */
public class AgeFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        String content = request.getContent();
        request.setContent("age filter before:"+content);
        System.out.println("age before\n");
        chain.doFilter(request, response);
        System.out.println("age after\n");
    }
}
