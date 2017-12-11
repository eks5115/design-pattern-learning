package com.xrotor.action.chain_of_responsibility;

/**
 * Created by eks5115 on 2017/9/20.
 */
public interface Request {
    void setContent(String content);
    String getContent();
}
