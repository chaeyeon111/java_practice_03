package Overloading;

import java.util.ArrayList;
import java.util.List;

public class Overloading {

    private int age1 = 30;
    private int age2 = 20;
    private int age3;
    private int age4;
    private int age;


    // age를 출력하는 기능
    public void method(){

    }

    public void method(int age1, int age2){
        age = age1 + age2;
        System.out.println(age);

    }

    public List<Integer> list(){
        // recent post n
        return new ArrayList<>();
    }


    public List<Integer> list(int idxFrom, int idxTo) {
        //
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        // heap static
        // heap ---> class
        // static ---> static
        Overloading overloading = new Overloading();
        overloading.method();
        overloading.method(10, 20);

    }
}
