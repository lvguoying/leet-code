package com.share.design;

/**
 * 状态上下文
 *
 * @author Lgq create on 2020-01-20
 */
public interface Context {

    /**
     * 状态改变
     *
     * @param state state
     */
    void changeState(State state);


    void doSomething();

}
