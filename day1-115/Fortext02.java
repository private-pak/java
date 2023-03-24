public class Fortext02 {
    /*
     * 
     * for循环 嵌套for循环
     * 
     */
    public static void main(String[] args) {
        /*
         * 循环中  可以套用 if，if..else,switch,for,while,do..while
         * if(){
         *      for(){
         *         while(){
         *              if(){
         *                  for(){
         * 
         * }
         * }
         * }
         * }
         * }
         * 
         */
        for(int i  = 0; i  <= 10; i++){
            // 0  1  2 0 1  2 0 1  2
            for(int j=0;j<3;j++){
                // 0 1  2
                for(int k=0;k<3;k++){
                    System.out.println("k---->" + k);
                }
            }
        }
        System.out.println("-------------------");
        //99乘法表
        
        for(int i =1; i<=9; i++){//外层循环9次
            for(int j  =  1;j<=9;j++){
                System.out.println(i+"x"+j+"="+(i*j)+"");
                //i是行号
            }
        }
        System.out.println("---------------------------");

        for(int  a  = 1;a<=9;a++){
            for(int   b = 1;b<=a;b++){
                System.out.print(a+"x"+b+"="+a * b +  " ");
            }
            System.out.println();
        }

        

    }
    
}
