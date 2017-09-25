package com.x_rotor.action.chain_of_responsibility;

/**
 * Created by eks5115 on 2017/9/20.
 */
public class Demo {
    public static void main(String[] args) {
        ApplicationFilterChain chain = new ApplicationFilterChain();
        chain.addFilter(new NameFilter()).addFilter(new AgeFilter());
        chain.doFilter(new HttpRequest(), new HttpResponse());
    }
}
