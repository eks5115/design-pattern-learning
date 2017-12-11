package com.xrotor.action.chain_of_responsibility;

/**
 * Created by eks5115 on 2017/9/20.
 */
public class HttpRequest implements Request {

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
