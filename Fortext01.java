public class Fortext01 {
    public static void main(String[] args) {
        /*
         * for(初始化表达式；布尔值表达式；更新表达式){
         * 
         * }
         * 
         */
            for(int i = 1;  i <= 10; i++){
                System.out.println(i);

            }
            System.out.println("-------------------------------");
            /*for(;;){
                System.out.println("q");
            }//死循环
            */
            //输出  1-10的奇数
            for(int i= 1;i<=10;i+=2){
                System.out.println(i);
            }
            System.out.println("-------------------------------");
            //输出1-10的偶数 
            for(int i=2;i<=10;i+=2){
                System.out.println(i);
            }
            //输出 10-0的数
            System.out.println("-------------------------------");
            for(int i=10;i>0;i--){
                System.out.println(i);
            }
            //输出100到0的整数
            System.out.println("-------------------------------");
            for(int i = 100;  i>=0;i-=10){
                System.out.println(i);
            }
            System.out.println("-------------------------------");
            for(int i  = 0;  i<10;){
                i++;
                System.out.println(i);
            }
        }
}
