package javase.xx.annotation4;

public class ReflectAnnotation {
    public static void main(String[] args) throws Exception{
        //获取类
        Class c= Class.forName("javase.xx.annotation4.MyAnnotationText014");
//判断类上面是否有@myAnnotation
       // System.out.println(c.isAnnotationPresent(MyAnnotation014.class)); //true
        if (c.isAnnotationPresent(MyAnnotation014.class) ){
           MyAnnotation014 myAnnotation014=(MyAnnotation014) c.getAnnotation(MyAnnotation014.class);
        //    System.out.println("类上面的注解"+myAnnotation014);
            //获取注解对象的属性怎么办？和调接口没区别。
           String value =  myAnnotation014.value();
            System.out.println(value);//你好
        }


        //判断String上面是否存在这个注解
        Class stringClass = Class.forName("java.lang.String");
        System.out.println(stringClass.isAnnotationPresent(MyAnnotation014.class)); //false

    }
}
