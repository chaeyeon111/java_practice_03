public class AlgorithmPractice {
    public static void main(String[] args) {
        int makeOne = (int) (Math.random() * 10);
        System.out.println(makeOne);

        //v를 2로 나눈 나머지가 0인지 판단한다. 0이면 if 구문이 실행되어 짝수를 출력하고,
        //0이 아니면 홀수를 반환한다.

        int v = 100;
        if (v % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        int temp = 99;
        if (temp % 2 == 1) {
            temp = temp * 3 + 1;

        } else {
            temp = temp / 2;
        }

        int temp2 = (temp % 2 == 1) ? temp * 3 + 1 : temp / 2;

        System.out.println(temp);


        //100이하의 수 모두 더하기
        int s = 0;
        for (int i = 1; i <= 100; i++) {
            s = s + i;
        }
        System.out.println(s);

        //2345 각 자리 수의 합

        int n = 2345;
        int tot = 0;
        for (; n > 0; ) {
            tot = tot + n % 10;
            n = n / 10;
        }
        System.out.println(tot);

        System.out.print("[1,");
        for (int i = 2;i < n; i++){
            if(n%i==0){
                System.out.printf("%d",i);
            }
            System.out.println(n+"]");

        }



        //각자릿수의 합
        int a = 2345;
        int tot1 = 0;
        while (a>0){
            tot=tot+n%10;
            n = n/10;
        }
        System.out.println(tot);


    }

    public static int toNum(char c) {
        int tot = 0;
        switch (c) {
            case 'A':
                tot = 1;
                break;
            case 'T':
                tot = 10;
                break;
            case 'J':
                tot = 11;
                break;
            case 'Q':
                tot = 12;
                break;
            case 'K':
                tot = c - '0';
                break;
        }
        return tot;
    }
    //switch ~ case
    //주어진 값에 따라 분기할 때는 switch~case를 사용한다.
    //만약에 c = 'A'라면 tot에 1이 저장된다. '
    public static String generateTextInformation(int index, double value){
        String result ="";
        switch (index){
            case 23: result = "신체지수";break;
            case 28: result = "감정지수";break;
            case 33: result = "지성지수";break;

        }
        return result + (value*100);


        //반복문: 조건을 만족하는 한 계속 반복되고 조건을 만족하지 않으면 종료

        //for문: (초기 ; 조건 ; 스텝){반복}의 형태로 사용하며 초기1 (조건2 반복3 스텝4)

    }




}
