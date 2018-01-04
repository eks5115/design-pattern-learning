package com.xrotor.action.chainofresponsibility;

/**
 *
 * @author eks5115
 */
public class HttpResponse implements Response {

    /**
     *
     * @param content
     */
    private String content;

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
