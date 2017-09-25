package com.x_rotor.action.chain_of_responsibility;

/**
 * Created by eks5115 on 2017/9/20.
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
