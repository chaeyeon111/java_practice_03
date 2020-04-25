package Methods;

import java.lang.reflect.Constructor;

import java.lang.reflect.Method;

public class UsingClass_Practice {

    public static void main(String[] args) {
        Object obj1 = new Object();
        //Getclass() method of Object callback Class
        Class classes = obj1.getClass();
        System.out.println(classes.getName());
        //Reflection: callback object's information(constructor and method)
        System.out.println("-------constructor----------");
        Constructor[]constructors = classes.getDeclaredConstructors();

        for (Constructor con: constructors){
            System.out.println(con.getName());
        }

        System.out.println("----------Method-----------");
        Method[]method = classes.getMethods();
        for(Method me:method){
            System.out.println(me.getName());
        }
    }
}
