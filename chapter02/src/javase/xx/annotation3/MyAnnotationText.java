package javase.xx.annotation3;

public class MyAnnotationText {
    /* 报错原因 没有指定属性值
    @MyAnnotation012
    public  static  void dom(){
        
    }
    */

    @MyAnnotation012("1")//value 可以省略
   // @MyAnnotation012(value = "1")
    public  static  void dom(){

    }
}
