public class Run3 {

    public static void main(String[] args) {
        Service1 service1 = new Service1();
        ThreadA111 a = new ThreadA111();
        a.setName("A");
        a.start();

        ThreadB111 b = new ThreadB111(service1);
        b.setName("B");
        b.start();

    }

}

class Service1 {

    synchronized public static void printA() {
        try {
            System.out.println("线程名称为：" + Thread.currentThread().getName()
                    + "在" + System.currentTimeMillis() + "进入printA");
            Thread.sleep(3000);
            System.out.println("线程名称为：" + Thread.currentThread().getName()
                    + "在" + System.currentTimeMillis() + "离开printA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public  void printB() {
        System.out.println("线程名称为：" + Thread.currentThread().getName() + "在"
                + System.currentTimeMillis() + "进入printB");
        System.out.println("线程名称为：" + Thread.currentThread().getName() + "在"
                + System.currentTimeMillis() + "离开printB");
    }

}


class ThreadA111 extends Thread {
    @Override
    public void run() {
        Service1.printA();
    }

}


class ThreadB111 extends Thread {
    Service1 service1;
    public ThreadB111(Service1 service1) {
        super();
        this.service1 = service1;
    }
    @Override
    public void run() {
        service1.printB();
    }
}
