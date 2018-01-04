package com.xrotor.action.chainofresponsibility;

/**
 *
 * @author eks5115
 */
public interface Request {
    /**
     * setContent
     * @param content
     */
    void setContent(String content);

    /**
     * getContent
     * @return
     */
    String getContent();
}
