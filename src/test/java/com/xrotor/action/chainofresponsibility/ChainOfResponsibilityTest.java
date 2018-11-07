package com.xrotor.action.chainofresponsibility;

import com.xrotor.action.chainofresponsibility.filter.AgeFilter;
import com.xrotor.action.chainofresponsibility.filter.NameFilter;
import com.xrotor.action.chainofresponsibility.http.HttpRequest;
import com.xrotor.action.chainofresponsibility.http.HttpResponse;
import org.junit.Test;

/**
 *
 * @author eks5115
 */
public class ChainOfResponsibilityTest {

    @Test
    public void test() {
        ApplicationFilterChain chain = new ApplicationFilterChain();
        chain.addFilter(new NameFilter()).addFilter(new AgeFilter());
        chain.doFilter(new HttpRequest(), new HttpResponse());
    }
}
