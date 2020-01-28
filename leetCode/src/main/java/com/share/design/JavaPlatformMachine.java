package com.share.design;

/**
 * 状态机
 *
 * @author Lgq create on 2020-01-20
 */
public class JavaPlatformMachine {


    ContextData data = new ContextData();

    JavaPlatformState state = JavaPlatformState.OPEN;

    //Action
    public void valid(){state.first(this);}
    public void businessLine(){state.businessLine(this);}
    public void district(){state.district(this);}

}
