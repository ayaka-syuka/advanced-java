package Sample;

public class ExceptionSample2 {
    public static void main(String[] args) {
        
        System.out.println("プログラム開始");
        try {
            Class.forName("java.lang.NotExistClass");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("例外が発生しました");

        System.out.println("プログラム終了");

    }

}
}