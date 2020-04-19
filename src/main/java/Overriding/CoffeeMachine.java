package Overriding;/*
* Americano = Espresso + Water
*Latte = Espresso + Milk
* Americano, Latte: 자식 method
* Espresso: 부모 class에 ok
* Water, Coffee: 자식 variable
* */




public class CoffeeMachine {

        void Espresso(){
            System.out.println("Espresso + ");
        }

    public class Over extends CoffeeMachine {
        private String water = "Water";
        private String coffee = "Coffee";


        public void Americano(String ingredient,String coffeetype){
                System.out.println(ingredient + coffeetype);
        }

        public void Latte(String ingredient,String coffeetype){
            System.out.println(ingredient + coffeetype);
        }




    }

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.Espresso();


    }
}

