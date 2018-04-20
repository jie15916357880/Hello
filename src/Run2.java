public class Run2 {

    public static void main(String[] args) {

        Service service = new Service("xiaobaoge");

        ThreadA11 a = new ThreadA11(service);
        a.setName("A");
        a.start();

        ThreadB11 b = new ThreadB11(service);
        b.setName("B");
        b.start();

    }

}

class Service {

    String anyString = new String();

    public Service(String anyString){
        this.anyString = anyString;
    }

    public void setUsernamePassword(String username, String password) {
        try {
            synchronized (anyString) {
                System.out.println("线程名称为：" + Thread.currentThread().getName()
                        + "在" + System.currentTimeMillis() + "进入同步块");
                Thread.sleep(3000);
                System.out.println("线程名称为：" + Thread.currentThread().getName()
                        + "在" + System.currentTimeMillis() + "离开同步块");
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

class ThreadA11 extends Thread {
    private Service service;

    public ThreadA11(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("a", "aa");

    }

}


class ThreadB11 extends Thread {

    private Service service;

    public ThreadB11(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("b", "bb");

    }

}