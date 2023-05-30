package javase.xx.annotation4;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//只运行该注解可以标注类、方法
@Target({ElementType.TYPE,ElementType.METHOD})

//希望这个注解可以被反射
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation014 {
    /**
     * value 属性
     * @return
     */
    String value() default "你好";

}
