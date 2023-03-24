public class stacktext01 {
    public static void main(String[] args) {
        /*
         * 关于栈 数据结构
         * 栈 stack 一种数据结构
         * 数据结构反应的 是数据 的存储形态
         */


    
    /*public static void m(){//方法可以定义之后 不调用  它不会在内存开辟空间 stack

    }
    */
    int a  = 10;
    int b = 20;
    int retValue  =  sumInt(a,b);
    System.out.println("retValue"+" ->   "+retValue);
    //System.out.println(a);
    //System.out.println(b);

}
public static int sumInt(int  i,int j){
    int result  =  i +  j;
    int  num = 6;
    int retValue   = divide(result,num);
    return retValue;
}
  public   static int  divide(int  x,int y){
    int z =x/y;
    return z;
  }
}
    
