package annotation;

import java.lang.annotation.*;

/**
 * Created by lm1 on 2018/4/16.
 */
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default "Pankaj";
    String date();
    int revision() default 1;
    String comments();
}
