public class Overloadtext03 {
    //方法重载的具体应用
    public static void main(String[] args) {
        U.p(10);
        U.p(11);
        U.p(1);
        U.p(1);
        U.p("s");
        
    }
    
}
//自定义的类
class U
{
    public  static void p(String b){
        System.out.println(b);
    }
    public  static void p(Short b){
        System.out.println(b);
    }
    public  static void p(int b){
        System.out.println(b);
    }
    public  static void p(Long b){
        System.out.println(b);
    }
}
