public class methodtext02 {

    public static  void sum(int a , int b){

        /*方法的调用不一定在mian方法这可以在其他地方调用
         * 当然了调用 的方法要 可以执行到要不然也白费
         */
        System.out.println(a+"+"+b+"="+(a+b));
        //调用dosome方法
        methodtext02.doSome();
        methodtext02.sum(10L,20L);
    }
    //主方法 
    public static void main(String[] args) {
        //调用sum方法
        methodtext02.sum(1, 2);
    }
    public static void  doSome(){
        System.out.println("do some");


    }
    
    public static void sum(long a, long b){
        System.out.println(a+"+"+b+"="+(a+b));
    }
    
}
