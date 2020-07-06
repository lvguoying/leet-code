package com.share.design;


/**
 * GOF 状态模式 可以是接口，也可以是抽象类
 *
 * @author Lgq create on 2020-01-20
 */
public interface State {
    /**
     * 通用动作执行
     *
     * @param context
     */
    public abstract void doAction(Context context);

    /**
     * user
     *
     * @param context
     */
    public abstract void doUse(Context context);

    /**
     * something
     *
     * @param context
     */
    public abstract void doSomething(Context context);


}
