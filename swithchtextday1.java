public class swithchtextday1 {
    /*一个完整的switch语句：
     switch （int或string 类型 的字面值或变量){
        case int或string 类型 的字面值或变量;
        java 语句；
        java 语句 ；
        。。。。
        break；
        case int或string 类型 的字面值或变量;
        java 语句；
        java 语句 ；
        。。。。
        break；
        case int或string 类型 的字面值或变量;
        java 语句；
        java 语句 ；
        。。。。
        break；
        default；
        java 语句 ；
        ...

    }

    */  
    public static void main(String[] args) {
        java.util.Scanner   s  = new  java.util.Scanner(System.in);
        System.out.println("请输入  1-7：");
        int num = s.nextInt();
        switch(num){
            case  1 :
                System.out.println("星期一");
                break;
            case  2:
                System.out.println("星期二");
                break;
            case  3 :
                System.out.println("星期三");
                break;
            case  4 :
                System.out.println("星期四 ");
                break;
            case  5 :
                System.out.println("星期五");
                break;
            case  6 :
                System.out.println("星期六");
                break;
            case  7 :
                System.out.println("星期七");
                break;
            default:
            System.out.println("叫你 输入 1-7");
        }

      System.out.println("欢迎 使用本计算机 ");
      System.out.println("请输入第一个数字 ：");
      int num1 = s.nextInt();
      System.out.println("请输入运算符:");
      String  operator = s.next();
      System.out.println("请输入第二 个数字");
      int num2  =  s.nextInt();
      int  result  = 0;
      switch(operator){
        case  "+":
        result = num1 + num2;
        break;
        case "-":
        result  =  num1   - num2;
        break;
        case "*":
        result =  num1 *  num2;
        break;
        case "/":
        result = num1 /num2;
        break;
        case "%":
        result  = num1 % num2;
        break;
        default:
        System.out.println("错误");
      }
      System.out.println("运算结果 为：" + num1 + operator +num2  +  "=" +result);
        
    }
}
