package Overriding;

public class LatteMachine extends NormalMachine {

    public String make() {
        return makeEspresso() + " " + "Milk";
    }

    public static void main(String[] args) {

    }
}
