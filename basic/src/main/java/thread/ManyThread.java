package thread;

import fanxing.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * @author fangzhou
 * @date 2023-02-09 17:28
 */

public class ManyThread {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executor = Executors.newFixedThreadPool(8);
        ArrayList<Dog> objects = new ArrayList<>();
        Dog dog = new Dog();
        dog.setSmell("1");
        for (int i = 0; i <10 ; i++) {
            objects.add(dog);
        }
        long time = System.currentTimeMillis();
        ArrayList< Future<Dog>> dogsFuture = new ArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(objects.size());
        for (Dog dog1 : objects) {
            Future<Dog> submit = executor.submit(() -> {
                dog1.setSmell("2"+System.currentTimeMillis());
                long min = Math.min(220L, 2000L);
                Thread.sleep(min);
                countDownLatch.countDown();
                return dog1;
            });
            dogsFuture.add(submit);
        }
        countDownLatch.await(300,TimeUnit.MILLISECONDS);
         objects = new ArrayList<>();
        for (Future<Dog> dogFuture : dogsFuture) {
            try {
                if (dogFuture.isDone()){
                    objects.add(dogFuture.get());
                }
            }catch (Exception e){
                System.out.println("超时了");
            }
        }
        List<String> collect = objects.stream().map(Dog::getSmell).collect(Collectors.toList());

        System.out.println(System.currentTimeMillis() - time);
        System.out.println("个数为"+objects.size() );



//        // 创建异步执行任务:
//        CompletableFuture<Double> cf = CompletableFuture.supplyAsync(()->{
//            System.out.println(Thread.currentThread()+"job1 start,time->"+System.currentTimeMillis());
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//            }
//            if(false){
//                throw new RuntimeException("test");
//            }else{
//                System.out.println(Thread.currentThread()+"job1 exit,time->"+System.currentTimeMillis());
//                return 1.2;
//            }
//        });
//        //cf执行完成后会将执行结果和执行过程中抛出的异常传入回调方法，如果是正常执行的则传入的异常为null
//        CompletableFuture<Double> cf2=cf.whenComplete((a,b)->{
//            System.out.println(Thread.currentThread()+"job2 start,time->"+System.currentTimeMillis());
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//            }
//            if(b!=null){
//                System.out.println("error stack trace->");
//                b.printStackTrace();
//            }else{
//                System.out.println("run succ,result->"+a);
//            }
//            System.out.println(Thread.currentThread()+"job2 exit,time->"+System.currentTimeMillis());
//        });
//        //等待子任务执行完成
//        System.out.println("main thread start wait,time->"+System.currentTimeMillis());
//        //如果cf是正常执行的，cf2.get的结果就是cf执行的结果
//        //如果cf是执行异常，则cf2.get会抛出异常
//        System.out.println("run result->"+cf2.get());
//        System.out.println("main thread exit,time->"+System.currentTimeMillis());

    }
}
