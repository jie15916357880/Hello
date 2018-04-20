/**
 * Created by lm1 on 2018/4/19.
 */
public class Test1 {
   public static int index;


    public static void main(String[] args) {
        A a = new A();
        for (int i = 0; i < 100 ;i++){
            new Thread(a).start();
        }
    }
    static class A implements Runnable{
        final int id = ++index;
        @Override
        public void run() {
            System.out.println(id);
        }
    }
}

