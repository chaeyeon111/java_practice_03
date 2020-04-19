package Methods;//p.63

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Constructor_Geo_Practice {
    public double latitude = 0.0;
    public double longitude = 0.0;

    private double la = 0.0;
    private double lo = 0.0;

    public static void main(String[] args) {
        //Methods.Constructor_Geo_Practice 객체 생성 "new"키워드 이용
        //Methods.Constructor_Geo_Practice 클래스(아파트 설계도) 대로 아파트를 짓는다.
        Constructor_Geo_Practice constructorGeoPractice1 = new Constructor_Geo_Practice();

        constructorGeoPractice1.latitude = 37.521272;
        constructorGeoPractice1.longitude = 127.00744;
        System.out.printf("위도:%f, 경도:%f\n", constructorGeoPractice1.latitude, constructorGeoPractice1.longitude);
        Constructor_Geo_Practice constructorGeoPractice2 = constructorGeoPractice1;
        System.out.printf("위도:%f, 경도:%f\n", constructorGeoPractice2.latitude, constructorGeoPractice2.longitude);

        Constructor_Geo_Practice seoul = new Constructor_Geo_Practice(36.5, 126.3);
        Constructor_Geo_Practice austria = new Constructor_Geo_Practice(46.3, 10.2);
        Constructor_Geo_Practice newyork = new Constructor_Geo_Practice(40.5, 25.4);

        //showGeo(seoul, seoul);

        ArrayList<Constructor_Geo_Practice> geolist = new ArrayList<Constructor_Geo_Practice>();

        //내용 지우기
        geolist.clear();

        //저장하기
        geolist.add(new Constructor_Geo_Practice(37,126));

        System.out.println(geolist.size());

        Constructor_Geo_Practice gt = geolist.get(0);
        System.out.printf("위도:%f, 경도:%f\n",gt.getLatitude(),gt.getLongitude());

    }




    public Constructor_Geo_Practice(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    //기본 생성자 Methods.Constructor_Geo_Practice(37.5, 127.0) 호
    public Constructor_Geo_Practice(){
        this(37.5,127.0);
    }
    //멤버 변수는 la뿐임으로 this가 필요하지 않다.
    public double getLatitude(){
        return la;
    }

    //d인자가 la이다. 멤버 변수는 this.latitude이다.
    //멤버 이름과 메서드 인자를 구
    public void setLatitude(double la){
        this.la = la;
    }

    public double getLongitude(){
        return lo;
    }

    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    //메서드 오버로
    public static void showGeo(Constructor_Geo_Practice...goose){
        for(Constructor_Geo_Practice gg:goose){
            System.out.printf("위도:%f, 경도:%f\n",gg.getLongitude(),gg.getLatitude());
        }
    }

    public static void showGeo(ArrayList<Constructor_Geo_Practice> goose){
        for(Constructor_Geo_Practice gg:goose){
            System.out.printf("위도:%f, 경도:%f\n",gg.getLatitude(),gg.getLongitude());
        }
    }

    //제네릭스
    //geo 타입만 저장
    ArrayList<Constructor_Geo_Practice> geolist = new ArrayList<Constructor_Geo_Practice>();
    //index 0의 객체를 가져온다.
    Constructor_Geo_Practice gt = geolist.get(0);



    //날짜 관련 변환(Date Conversion)

    //1970년 1월 1일부터 며칠
    long millis = System.currentTimeMillis();
    int days = (int)(millis/1000/24/60/60);

    //오늘
    Date d = new Date();

    //하루 후 내일
    Date dd = new Date(d.getTime()+24*60*60*1000);


    //오늘
    Calendar cal1970 = Calendar.getInstance();

    //자바에서는 1월 ~ 12월을 0월 ~ 11월으로 사용. 따라서 (1970.1 -1,1)은 1970.1.1이다.

    Calendar today = Calendar.getInstance();

    //현재 - 1970.1.1
    long minus = today.getTimeInMillis()-cal1970.getTimeInMillis();

    //Date를 String으로
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String st = sdf.format(dd);





}
