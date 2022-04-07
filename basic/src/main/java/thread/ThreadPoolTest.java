package thread;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author fangzhou
 * @date 2022-03-30 23:57
 */
public class ThreadPoolTest {

    private static ThreadFactory namedThreadFactory = new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            return null;
        }
    };
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,
                10,100, TimeUnit.MINUTES,
                new SynchronousQueue<Runnable>(), namedThreadFactory);

        threadPoolExecutor.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(1111);
            }
        });

    }
}
