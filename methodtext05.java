public class methodtext05 {
    public static void main(String[] args) {
        /*
         * 输入 return语句 
         * 带return关键字的java语句只要执行，所在的方法执行结束
         * 在同一个作用域当中 ，return语句下面不能编写  任何代码，因为他们执行不到
         */
        int  retVm =  m();//这里的retV可以 随便起但 最好自己知道
        System.out.println(retVm);
        //System.out.println(m);//编译错误调用方法 方法名后面要加括号

        System.out.println(m());
        int retVn = n();
        System.out.println(retVn);

        //System.out.println(b());

    }
    //编译报错 缺少返回语句，因为 编译器认为无法保证return 1；会执行
    /*
    public static  int  m(){
        int a = 10;
        if (a > 3){
            return 1;
        }
        
    }
    */
    //下面的return 1或return  0；会执行编译通过
    public static  int  m(){
        int a = 10;
        if (a < 3){
            return 1;
        }else{
            return 0;
        }
        
    }

    public static  int  n(){
        int a = 10;
        if (a > 3){
            return 1;
            //这里不能 写 代码  编译错误，因为无法访问的语句
            //System.out.println("111");
        }
        System.out.println("hello");//这里的代码就可以执行到因为这里的代码不在return 1的作用域里

        return 0;
        
    }
    /*public static  int  b(){
        return 10  > 3 ? 1 :  0;
        //简写
        
    }
    */
}
