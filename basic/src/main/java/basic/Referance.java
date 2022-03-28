package basic;

/**
 * @author fangzhou
 * @date 2022-03-28 15:13
 */
public class Referance {

    public static void main(String[] args) {
        int a = 3;
        test(a);
        System.out.println("main方法a的值="+a);
    }


    public static void test(int a ) {
        a = 5;
        System.out.println("test1方法中的a=" + a);

    }
}
