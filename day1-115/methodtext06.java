public class methodtext06 {
    /*
     * 在返回值类型是 void的 方法当中 使用return语句
     * return语句出现在返回值为void的方法当中主要是为了终止方法的执行或者说是为了结束当前方法
     */
    public static void main(String[] args) {
        
        //return 10;

        //m();
        m();

    }
    /*public static void m(){//编译报错 对于结果类型为 空的方法 无法返回值
        return 10;
    }
    */
    /*public static  void m(){
        return;
    }
    */

        public  static void m(){
            for(int i = 0;i<10;i++){
                if(i == 5){
                return;//不是终止for循环，终止的  是m（）方法
                //break;//终止 的for循环
                //return 和 break 不同时出现
            }
            System.out.println("i----->"+ " " +i);
        }
        System.out.println("1111");
    }
}
