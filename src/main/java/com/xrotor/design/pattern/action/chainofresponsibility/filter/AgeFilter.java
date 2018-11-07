package com.xrotor.design.pattern.action.chainofresponsibility.filter;

import com.xrotor.design.pattern.action.chainofresponsibility.http.Request;
import com.xrotor.design.pattern.action.chainofresponsibility.http.Response;
import com.xrotor.design.pattern.action.chainofresponsibility.servlet.Filter;
import com.xrotor.design.pattern.action.chainofresponsibility.servlet.FilterChain;

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
