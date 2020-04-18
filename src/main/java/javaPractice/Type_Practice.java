public class Type_Practice {

    //psvm
    public static void main(String[] args) {
        //sout
        System.out.println("hello");

        boolean isL = false;
        char sult = 'H';
        int year = 2017;
        int month = 6;

        double latitude = 37.222;
        double longitude = 127.0003004;

        double yourLatitude = 37.5;
        int myLatitude=(int)latitude;
        System.out.println(myLatitude);

        double earthR = 6371;


        int makeOne = (int)(Math.random()*45);
        System.out.println(makeOne);
        System.out.println(Math.random());

        int num = '9'-'0';
        int a = Character.getNumericValue('9');
        int b = Character.digit('9',10);
        int alpha = 'A';
        System.out.println(alpha);
        char cAlpha = (char)97;
        System.out.println(cAlpha);

        int c = 90;
        int d = 95;
        int e = 98;
        int average = (a+b+c)/3;
        System.out.println(average);


        String card = "H8";
    }
}
