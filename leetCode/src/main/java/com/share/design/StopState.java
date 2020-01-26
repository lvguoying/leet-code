package com.share.design;

/**
 * 终止状态
 *
 * @author Lgq create on 2020-01-20
 */
public class StopState implements State {

    private static StopState stopState = new StopState();


    public static State getInstance() {
        return stopState;
    }

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.changeState(StopState.getInstance());
    }

    @Override
    public void doUse(Context context) {

    }

    @Override
    public void doSomething(Context context) {

    }

    @Override
    public String toString() {
        return "Stop State";
    }

}
