package javase.xx.annotation;

//Deprecated这个注解标注的元素已过时。
//这个注解主要是向其它程序员传达一个信息，告知已过时，有更好的解决方案存在。

@Deprecated //表示这个类已过时

public class AnnotationText03 {
    public static void main(String[] args) {
        AnnotationText03 annotationText03 = new AnnotationText03();

        annotationText03.dom();

    }
    @Deprecated
    public  static  void dom(){
        System.out.println("sda");
    }

    @Deprecated
    public  static void dom2(){
        System.out.println("1111");
    }

    public  AnnotationText03(){

    }
}
class T{
    public static void main(String[] args) {
        AnnotationText03 annotationText04 = new AnnotationText03();
        annotationText04.dom2(); //'dom2()' 已弃用 


    }
}