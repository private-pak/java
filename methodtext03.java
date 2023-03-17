public class methodtext03 {
    public static void main(String[] args) {
        //调用方法
        methodtext03.m();
        //对于方法 的修饰符 列表当中有static关键字的：类名可以省略不写
        m();
        A.doOther();
        //编译报错 类名省略后在默认的当前类找不到doOther不存在
        //doOther();
    }
   public static void m(){
    System.out.println("m.----------");
    
    methodtext03.m2();//完整的方法 因为m上面调用了使用所以这里可以 写并且项目的m2方法也可以正常执行
    m2();//省略的方法
    /*m1（）{
        m2（）；
    }
     * m1方法和m2方法在一个同一个类体当中的时候，类名可以省略
     * 前提是 m1 要被调用
     */
   }
   public static  void m2(){
    System.out.println("m2--0---");
   }
    
}
class A
{
    public static void doOther(){
        System.out.println("do0000000");
    }
}
