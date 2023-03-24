

public class Continuetext01 {
    
    public static void main(String[] args) {
        /*
         * continue语句
         * 表示 为：/go on/下一个
         * continue关键字加 一个分号构成 一个单独的完整的java语句，主要出现循环  语句 当中用 来 控制循环的执行
         * break和continue的区别
         * break表示循环不执行
         * continue表示终止本次循环，直接进入下一次循环继续 执行
         */

         for(int i  = 0;  i  <  10;i++){
            if(i ==  5){
                break;
            }
            System.out.println("i---------"+i);//0  1 2  3  4
         }
         System.out.println("!!!!!!!!!!!!");

         for(int i  = 0;  i  <  10;i++){
            if(i ==  5){
                continue;//只要这个 continue，当前循环终止，直接进入下一个循环
            }
            System.out.println("i---------"+i);//0 1 2  3  4 6 7  8 9 没有5
         }
         System.out.println("!!!!!!!!!!!!");


    }
}
