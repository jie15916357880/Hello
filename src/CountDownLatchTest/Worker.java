package CountDownLatchTest;

/**
 * Created by lm1 on 2018/4/13.
 */
public class Worker {
    private String name;//姓名
    private long workDuration;//工作时长

    /*
    构造器
     */
    public Worker(String name, long workDuration) {
        this.name = name;
        this.workDuration = workDuration;
    }

    /*
    完成工作
     */
    public void doWork(){
        System.out.println(name + " begin to work.......");
        try {
            Thread.sleep(workDuration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
