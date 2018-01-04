package com.xrotor.action.chainofresponsibility;

/**
 *
 * @author eks5115
 */
public class NameFilter implements Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        String content = request.getContent();
        request.setContent("name filter before:"+content);
        System.out.println("name before\n");
        chain.doFilter(request, response);
        System.out.println("name after\n");
    }
}
