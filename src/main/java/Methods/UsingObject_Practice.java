package Methods;

public class UsingObject_Practice {

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();


        System.out.println(obj1.hashCode());
        System.out.println(Integer.toHexString(obj1.hashCode()));
        //객체는 고유하다.
        System.out.println(obj1 == obj2);

        //객체는 고유하다.
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1);
        System.out.println(obj2.toString());

        System.out.println(obj1.getClass().getName());
        String str = obj1.getClass().getName()+"@"
        +Integer.toHexString(obj1.hashCode());
        System.out.println(str);

        Object objstr = new String("Good");
        System.out.println(objstr.toString());
        System.out.println(objstr instanceof Object);
        System.out.println(objstr instanceof String);

        String hello = "hello";
        System.out.println(hello.getClass());





    }



}
