package thread;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author fangzhou
 * @date 2022-04-05 19:36
 */
public class ScheduledThreadPoolExecutorTest {

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(10);
//        System.out.println(System.currentTimeMillis());
//        scheduledThreadPoolExecutor.schedule(() -> {
//
//            System.out.println("尝试延迟");
//            System.out.println(System.currentTimeMillis());
//
//        }, 300, TimeUnit.MILLISECONDS);


        //固定频率调用  在线程池开始 initialDELAY 时间后  每period秒执行一次 执行的是每次任务应该开始的时间
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("固定频率延迟开始了  Thread.sleep");

            }
        },1000,2000,TimeUnit.MILLISECONDS);


        //固定频率调用  在线程池开始 initialDELAY 时间后  每period秒执行一次  时间是按照上一次运行完的算
        scheduledThreadPoolExecutor.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("固定频率延迟开始了");
            }
        },1000,2000,TimeUnit.MILLISECONDS);


        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(111);
            }
        },111,111);
//        timer.scheduleAtFixedRate();
    }
}
