package com.share.design;

/**
 * 开始状态
 *
 * @author Lgq create on 2020-01-20
 */
public class StartState implements State {

    private static StartState startState = new StartState();


    private static StartState getInstance() {
        return startState;
    }

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");

        context.changeState(StartState.getInstance());
    }

    @Override
    public void doUse(Context context) {

    }

    @Override
    public void doSomething(Context context) {

    }

    @Override
    public String toString() {
        return "Start State";
    }
}
