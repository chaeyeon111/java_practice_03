package CoffeePractice;

import org.junit.Test;

import static org.junit.Assert.*;

public class AmericanoMachineTest {

    @Test
    public void americanoTest() {

        AmericanoMachine americanoMachine = new AmericanoMachine();
        String coffee1 = americanoMachine.make();
        //System.out.println(americanoMachine.espresso());
        System.out.println(coffee1);
    }



}