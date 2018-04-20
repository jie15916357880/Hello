/**
 * Created by lm1 on 2018/4/13.
 */
public class TryCatchTest {
    public static void main(String[] args) {

        System.out.println(a());
    }
    public static int a(){
        try {
            return 1;
        }finally {
            return 2;
        }
    }
}
