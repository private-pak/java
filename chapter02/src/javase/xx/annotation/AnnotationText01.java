package javase.xx.annotation;
/*
1、注解，或者叫做注释，英文单词是：Annotation
2、注解Annotation是一种引用数据类型。编译之后也是生成xxx.cLass文件。
3、怎么自定义注解呢？语法格式？
【修饰符列表】@interface注解类型名{

        }
//默认情况下，注解可以出现在任意位适。

 */
/*
java.lang包下的注释类型：
        掌握：
        Deprecated用eDeprecated注释的程序元素，
        不鼓励程序员使用这样的元素，通常是因为它很危险或存在更好的选择，

        掌握：
        override表示一个方法声明打算重写超类中的另一个方法声明。

        不用掌握：
        Suppresswarnings指示应该在注释元素（以及包含在该注释元素中的
        所有程序元素）中取消显示指定的编译器警告。

 */

public class AnnotationText01 {
  @MyAnnotation
  public static void main(@MyAnnotation String[] args) {

        @MyAnnotation
        int a = 10;

    }
}
