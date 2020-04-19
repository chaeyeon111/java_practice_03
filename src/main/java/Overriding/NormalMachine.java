package Overriding;

public class NormalMachine {
    public String makeEspresso() {
        return "Espresso";
    }

    public String make() {
        return makeEspresso() + " Cup";
    }
}
