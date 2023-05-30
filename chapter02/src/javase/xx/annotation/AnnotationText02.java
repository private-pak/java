package javase.xx.annotation;

/*
关于jdk lang包下的override注解
        public @interface Override {

        标识性注解，给编译器做参考的。
        编译器看到方法上有这个注解的时候，编译器会自动检查该方法是否重写了父类的方法
        如果没有重写，报错。

}

//@override这个注解只能注解方法。
//@Override这个注解是给编译器参考的，和运行阶段没有关系。
//凡是java中的方法带有这个注解的，编译器都会进行编译检查，如果这个方法不是重写父类的方法，编译器报错

 */
public class AnnotationText02 {
    @Override
    public String toString() {
        return "toString";
    }
}
