package Type;

public class StringBuffer_Practice {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        sb1.append("Hello")
                .append("Nice to Meet you!")
                .append("My name is Chloe");
        System.out.println(sb1.toString()+sb1.hashCode());
     sb1.replace(0,2,"Hi");
        System.out.println(sb1.toString() + sb1.hashCode());
        sb1.reverse();
        System.out.println(sb1.toString());

        sb1.delete(10,15);
        System.out.println(sb1.toString());

    }
}
