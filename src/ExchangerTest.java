import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by lm1 on 2018/4/17.
 */
public class ExchangerTest {
    private static final Exchanger<String> exgr = new Exchanger<>();
    private static ExecutorService threadpool = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        threadpool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String A = "银行流水A";
                    exgr.exchange(A);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadpool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String B = "银行流水B";
                    String A = exgr.exchange(B);
                    System.out.println("A 和 B数据是否一致: " + A.equals(B) + ", A 录入的是: " + A + ",B录入的是:" + B);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadpool.shutdown();
    }
}
