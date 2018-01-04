package com.xrotor.action.chainofresponsibility;

/**
 *
 * @author eks5115
 */
public class Demo {
    public static void main(String[] args) {
        ApplicationFilterChain chain = new ApplicationFilterChain();
        chain.addFilter(new NameFilter()).addFilter(new AgeFilter());
        chain.doFilter(new HttpRequest(), new HttpResponse());
    }
}
