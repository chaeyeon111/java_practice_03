package Overriding;

import org.junit.Test;

import static org.junit.Assert.*;

public class LatteMachineTest {

    @Test
    public void latte() {

        NormalMachine normalMachine = new NormalMachine();
        System.out.println(normalMachine.make());

        LatteMachine latteMachine = new LatteMachine();
        String coffee = latteMachine.make();
        System.out.println(coffee);
    }
}