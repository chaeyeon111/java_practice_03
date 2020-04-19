package javaPractice;

public class String_Practice {
    public static void main(String[] args) {
        int s = 0;
        for(int i = 1; i <=100; i++){
            s = s + i;
        }

        String city1 = "Asia";
        String city2 = "Europe";
        city2 = city1;
        System.out.println(city1.length());
        String city4 = String.format("%s-%s",city1,city2);
        System.out.println(city4);

    }
}
