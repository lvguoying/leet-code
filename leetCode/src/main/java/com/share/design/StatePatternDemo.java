package com.share.design;

/**
 * @author Lgq create on 2020-01-20
 */
public class StatePatternDemo {

    public static void main(String[] args) {

        StartState startState = new StartState();
        startState.doAction(new Context() {
            @Override
            public void changeState(State state) {
                System.out.println(state.toString());
            }

            @Override
            public void doSomething() {
                System.out.println("do something");
            }
        });


        StopState stopState = new StopState();
        stopState.doAction(new Context() {
            @Override
            public void changeState(State state) {
                System.out.println(state.toString());
            }

            @Override
            public void doSomething() {
                System.out.println("do something");
            }
        });

    }


}
