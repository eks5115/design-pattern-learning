package com.xrotor.action.chainofresponsibility.filter;

import com.xrotor.action.chainofresponsibility.servlet.FilterChain;
import com.xrotor.action.chainofresponsibility.http.Request;
import com.xrotor.action.chainofresponsibility.http.Response;
import com.xrotor.action.chainofresponsibility.servlet.Filter;

/**
 *
 * @author eks5115
 */
public class NameFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        String content = request.getContent();
        request.setContent("name filter before:"+content);
        System.out.println("name before\n");
        chain.doFilter(request, response);
        System.out.println("name after\n");
    }
}
