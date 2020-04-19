package Overriding;

public class AmericanoMachine extends NormalMachine {


    public String make(){
        return makeEspresso() + " " + "Water";

    }

    public static void main(String[] args) {
        AmericanoMachine americanoMachine = new AmericanoMachine();
        String coffee1 = americanoMachine.make();
        System.out.println(americanoMachine.makeEspresso());
        System.out.println(coffee1);
    }
}
