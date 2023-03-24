

public class Overloadtext01 {
    public static void main(String[] args) {
        //前提 功能相似的时候  方法名可以相同
        //但 功能不同的时候，尽可能让二个或者加以区分
        //调用  方法的时候就像在 使用一个方法一样
        System.out.println(sum(1,2));//参数的  类型不同，对应调用的方法不同。对应的参考参数类型不依靠方法名
        System.out.println(sum(1.0,2.0));
        System.out.println(sum(1L,2L));
    }
    public static int sum(int a,int b){
        System.out.println("sum(int,int)");
        return a + b ;
    }
    public static long sum(Long a,Long b){
        System.out.println("sum(long,long)");
        return a + b;
    }
    public static double sum(Double a,Double b){
        System.out.println("sum(double,double)");
        return a + b;
    }

    



}
