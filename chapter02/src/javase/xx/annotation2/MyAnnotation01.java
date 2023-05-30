package javase.xx.annotation2;

import javase.xx.annotation.MyAnnotation;

public class MyAnnotation01 {
    //报错的原因：如果一个注解当中有属性，那么必须给属性赋值。
/*@MyAnnotation011
public void dom(){
}
*/
//@MvAnnotation011（属赶名=属性值）

    @MyAnnotation011(name = "张三",color = "蓝色")
    public  void  dom(){
//839
    }
}
