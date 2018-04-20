import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by lm1 on 2018/4/18.
 */
public class LockTest {
    private Lock lock = new ReentrantLock();

    //需要同步的方法
    private void lockTest(Thread t){
        lock.lock();
        try {
            System.out.println("线程: " + t.getName() + "获得了锁");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("线程: " + t.getName() + "释放了锁");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        LockTest l = new LockTest();
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                l.lockTest(Thread.currentThread());
            }
        },"t1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                l.lockTest(Thread.currentThread());
            }
        },"t2");
        t1.start();
        t2.start();
    }
}
