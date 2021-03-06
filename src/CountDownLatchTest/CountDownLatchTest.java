package CountDownLatchTest;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * Created by lm1 on 2018/4/13.
 */
public class CountDownLatchTest {
    private static final int MAX_WORK_DURATION = 5000;  // 最大工作时间
    private static final int MIN_WORK_DURATION = 1000;  // 最小工作时间

    //产生随机的工作时间
    private static long getRandomWorkDuration(long min,long max){
        return (long) (Math.random() * (max - min) + min);
    }

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(2);//创建倒计时
        Worker w1 = new Worker("卢",getRandomWorkDuration(MIN_WORK_DURATION,MAX_WORK_DURATION));
        Worker w2 = new Worker("家",getRandomWorkDuration(MIN_WORK_DURATION,MAX_WORK_DURATION));

        new Thread(new WorkerTestThread(w1,latch)).start();
        new Thread(new WorkerTestThread(w2,latch)).start();
        try {
            latch.await();
            System.out.println("All jobs have been finished!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
