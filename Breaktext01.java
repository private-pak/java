public class Breaktext01 {
    
    public static void main(String[] args) {
        /*
         * 关于java控制语句的break语句
         * break是java语言当中 的关键字 ：中断/折断
         * 在默认情况下break中断 是离它最近 的循环语句
         */

            for(int i =  0; i<10;i++){
               if(i == 5){
                break;//中断当前 的for循环
               } 
               System.out.println("i--------"+i); //  4 3 2 1 0
            }
            
            System.out.println("1222");//这里的程序和上面的for循环无关因为for循环里面的break中断了 

            for(int j = 0; j<5;j++){//-A
                for(int i = 0;i<10;i++){//-B
                    if(i  ==  5){
                        break;//当前 的 break语句中断的 是内层的for循环-B层
                    }
                    System.out.println("i--------"+i);
                }
            }

            System.out.println("----------------------");
            //给for循环起名for1  2 3 ..
            for1:for(int j = 0; j<3;j++){
                for2:for(int i = 0;i<10;i++){
                    if(i  ==  5){
                        break for1;//终止for1循环
                    }
                    System.out.println("i--------"+i);// 0 1 2 3 4
                }
            }

    }
}
