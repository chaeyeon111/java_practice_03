public class PrimitiveTypeAndReferenceType {
    public static void main(String[] args) {
        int num = 1;
        Integer num2 = 2;

        int age = 0;
        double d_age = (double)age;
        Integer age2;

        // . int(x) Integer(o)
        int iAge = (int)d_age;

        System.out.println("Age:" + iAge);

        // primitive type은 casting이 안되고, reference type은 casting이 된다.
        //둘다됨.

        //primitive type: null이 올 수 없고, reference type은 null이 올 수 있다.


        Person p = new Person();
//        p.setAge(20);
        System.out.println("Age is " + p.getAge());

//        p.setAge2(25);
        System.out.println("Age is " + p.getAge2());
        PrimitiveTypeAndReferenceType pt = new PrimitiveTypeAndReferenceType();

    }
}


class Person{
    private int age;

    public Integer getAge2() {
        return age2;
    }

    public void setAge2(Integer age2) {
        this.age2 = age2;
    }

    private Integer age2;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
