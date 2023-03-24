public class Recursiontext02 {
    public static void main(String[] args) {

        /*
        int  n =  4;
        int retVlue =  sum(n);
        System.out.println(retVlue);
        */

        int n = 5;
        int retVlue  =  method(n);
        System.out.println(retVlue);//120
        

    }
    
    public  static  int sum(int n){

        if(n ==  1){
            return  1;
        }
        return +  sum(n-1);


    }
    public  static int method(int n){
        if(n == 1){
            return 1;
        }
        return n  * method(n-1);
    }
}
