import java.util.Date;
import java.util.HashMap;

public class SynThread implements Runnable {

    private volatile Integer count = 0;
    private Object lock = new Object();
    public void run() {
        while(count<1000){
            synchronized(lock){
                if(count<1000){
                    count++;
                    System.out.println("Thread "+Thread.currentThread().getName()+" operates " +
                            " the count,count now is"+count+","+new Date());
                }
                try{
                    lock.wait(5);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

}

class TestAtomic {

    public static void main(String args[]){

        Runnable r = new SynThread();
        for(int i=1;i<100;i++){
            Thread t =  new Thread(r);
            t.setName(String.valueOf(i));
            t.start();
        }
    }

}