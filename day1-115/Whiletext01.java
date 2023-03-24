public class Whiletext01 {
    public static void main(String[] args) {
        /*
         * while循环的语句结构：
         * while(布尔表达式){
         *  循环体；
         * }
         * 
         */

         /*while(true){
            System.out.println("1");
         }
         *///死循环

         /*//死循环 
         int i = 10;
         int  j = 2;
         while(i>j){        //编译器只能看到表面，i>j是要程序运行 的时候才 知道是死循环
            System.out.println("true");
         }
         System.out.println("null");
         */

         //用while循环输出1-10
         int i  = 1;
         while(i  <= 10){
            System.out.println(i);
            i++;
         }
         System.out.println("new的i：----》"+i);

         System.out.println("------------------------------");

         int j = 10;
         while(j > 0){
            System.out.println(j--);//10 9 8----1
         }
         System.out.println("new - j---->"+j);//0
         System.out.println("------------------------------");
         int  e = 10;
         while(e >= 0){
            System.out.println(--e);//9 8 7 --1 0 -1
         }

    }
    
}
