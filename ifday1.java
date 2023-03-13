public class ifday1 {
    public static void main(String[] args) {
        /* 
        //1.创建键盘 扫描对象
        java.util.Scanner  s  =  new   java.util.Scanner(System.in);//2.调用Scanner对象的next（）对象方法 开始 接受用户 键盘输入的数据
        String userInputContent = s.next();//当用户 输入的时候并且最终敲了回车输入的信息会自动赋值 个use..nt
        System.out.println("你输入了：" + userInputContent);
     */
        java.util.Scanner S = new java.util.Scanner(System.in);
        System.out.print("请输入你的年龄：" );
        int age  = S.nextInt();
        String str = "老人";
        if(age   <  0 || age  >  150){
            str = "输入数据 错误";
        }else if (age <= 5){
            str = "幼年";
        }else if (age <= 10){
            str  = "少年";
        }else  if (age <=50){
            str = "青年";
        }
        System.out.print(str);
        }
        
        
    
}
