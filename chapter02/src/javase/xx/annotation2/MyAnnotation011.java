package javase.xx.annotation2;

public @interface MyAnnotation011 {
    /**
     * 我们通常在注解当中可以定义属性，以下这个是MyAnnotation的name属性
     * 看着像1个方法，但实际上我们称之为属性name。
     * @return
     */
    String  name();

    /**
     * 颜色属性
     * @return
     */
    String color();

    /**
     * 性别
     * @return
     */
    String sex() default "true"; //默认值

    /**
     * 年龄
     * @return
     */
    int age() default  18;
}
