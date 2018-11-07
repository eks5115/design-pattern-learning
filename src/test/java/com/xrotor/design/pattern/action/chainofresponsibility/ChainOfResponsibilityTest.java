package com.xrotor.design.pattern.action.chainofresponsibility;

import com.xrotor.design.pattern.action.chainofresponsibility.filter.AgeFilter;
import com.xrotor.design.pattern.action.chainofresponsibility.filter.NameFilter;
import com.xrotor.design.pattern.action.chainofresponsibility.http.HttpRequest;
import com.xrotor.design.pattern.action.chainofresponsibility.http.HttpResponse;
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
