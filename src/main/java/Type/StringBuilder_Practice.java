package Type;

public class StringBuilder_Practice {
    public static void main(String[] args) {
        StringBuilder sbu = new StringBuilder();
        sbu.append("I")
                .append("Go")
                .append("To school.");
        System.out.println(sbu);

        sbu.replace(7,11,"");
        System.out.println(sbu);
        sbu.reverse();

        sbu.delete(1,3);
        System.out.println(sbu);

        String ss = sbu.substring(0);
        System.out.println(ss);
    }
}
