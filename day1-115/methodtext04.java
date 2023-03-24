public class methodtext04 {
    public static void main(String[] args) {
            //调用方法 
            divite(10, 10);//这里的 调用divite但没有接收这个方法 的返回 数据
            //这里接受一下方法  执行结束之后的返回值
            //采用变量接受
            //赋值运算符的右边先执行 ，将 执行结果  赋值左边的 变量
            int i = divite(10, 10);
            System.out.println(i);
            //
            long x = divite(10, 10);
            System.out.println(x);

            System.out.println(divite(10, 10));

    }
    /*
     *  public static int divite(int a,int b){
     * }//报错因为缺少 返回语句 
     * 
     */
    /*  public static int divite(int a,int b){
        return ;//编译错误 缺少返回值
        }
     */

    /*public static int divite(int a,int b){
        int c = a  / b;
        return c;
    }
    */
    public static int divite(int a,int b){
        
        return a+b;//这里的a+b 可以是+ -  * / 等等 数值运算符
        
    }
    
}
