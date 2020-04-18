public class Print_Practice {
    public static void main(String[] args) {
        System.out.print("Hello");
        System.out.print("World");

        System.out.println("Hello");
        System.out.println("World");


    }

    public static void toNum(char c){
        int tot = 0;
        switch (c){
            case 'A': tot = 1;break;
            case 'T': tot = 10;break;
            case 'J': tot = 11;break;
            case 'Q': tot = 13;break;
            case 'K': tot = c-'0';break;
        }

        System.out.println(tot);

    }


}
