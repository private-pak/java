public class Recursiontext01 {
    public static void main(String[] args) {
        
        int n = 4;
        int retVlue =  sum(n);
        System.out.println(retVlue);

        n=10;
        retVlue =  sum(n);
        System.out.println(retVlue);


    }
    //单独定义一个方法，这是一个独立的方法，可以完成1-n的求和
    public static int sum(int n){
        int result =  0;
        for(int i =  1;i<=n;i++){
            result += i;
        }
        return result;
    }

}
