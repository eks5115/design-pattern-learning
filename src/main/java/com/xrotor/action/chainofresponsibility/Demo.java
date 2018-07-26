package com.xrotor.action.chainofresponsibility;

import com.xrotor.action.chainofresponsibility.filter.AgeFilter;
import com.xrotor.action.chainofresponsibility.filter.NameFilter;
import com.xrotor.action.chainofresponsibility.http.HttpRequest;
import com.xrotor.action.chainofresponsibility.http.HttpResponse;

/**
 *
 * @author eks5115
 */
public class Demo {
    public static void main(String[] args) {
        ApplicationFilterChain chain = new ApplicationFilterChain();
        chain.addFilter(new NameFilter()).addFilter(new AgeFilter());
        chain.doFilter(new HttpRequest(), new HttpResponse());
        chain.release();
    }
}
