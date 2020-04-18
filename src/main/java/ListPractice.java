import java.util.ArrayList;
import java.util.List;


public class ListPractice {
    public static void main(String[] args) {
        List<Integer>ilist= new ArrayList<>();
        //넣기(입력할 때는 add)
        for (int i = 1; i <= 10; i ++){
            ilist.add(i);
        }
        //가져오기(가져올 때는 get)

        for(int i = 0;i<ilist.size();i++){
            int m = ilist.get(i);
            System.out.printf("%d\t",m);
        }
        System.out.println();
    }
}
