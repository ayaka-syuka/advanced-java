package Sample;

public class ExceptionSample4 {
    public static void main(String[] args) {
        System.out.println("プログラム開始");

        try {
            method1();
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("例外が発生しました");
        }


        System.out.println("プログラム終了");
    }

    public static void method1() throws Throwable{
        Class.forName("java.lang.NotExistClass");
    }

}
