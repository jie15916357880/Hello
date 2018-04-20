package CountDownLatchTest;

import java.util.concurrent.CountDownLatch;

/**
 * Created by lm1 on 2018/4/13.
 */
public class WorkerTestThread implements Runnable {
    private Worker worker;
    private CountDownLatch cdLatch;

    public WorkerTestThread(Worker worker, CountDownLatch cdLatch) {
        this.worker = worker;
        this.cdLatch = cdLatch;
    }

    @Override
    public void run() {
        worker.doWork();//让人完成工作
        cdLatch.countDown();//工作完成后倒计时-1
    }
}
