package thread;

/**
 * @author fangzhou
 * @date 2022-04-01 19:20
 */
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        Thread.sleep(1000L);

        new ThreadTest().wait();
    }
}
