package Methods;

public abstract class ParameterPractice {
    protected int [][] magic;
    protected int n;

    //반드시 int를 입력받아야 하는 생성자


    public ParameterPractice(int n){
        magic= new int[n][n];
        this.n = n;
    }

    //{}가 없다.
    public abstract void make();

    /*    public interface IMagicSquare {
        void.make();
        void.print();
    }

     */
}

