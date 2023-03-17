public class methodtext01 {
    public static void main(String[] args) {
        //这里的程序是 一定要执行的
        //mian方法是jvm负责调用的是一个 入口
        //调用methodtext01的sum方法
        methodtext01.sum(10, 20);
        int  k = 90;
        int f = 10;
        methodtext01.sum(k, f);
        methodtext01.sum(30, 10);

    }
        /*public表示公开的
         * static表示静态的
         * void表示执行结束之后不返回任何数据
         * mian是方法名 主方法
         * （string【】args）形式参数列表其中string【】是一种引用数据类型，args是一个局部变量 的变量名 
         */


        //方法定义的语句

        /*[修饰符列表] 返回值类型 方法名 （形式参数列表）{
         *   方法 体；
              }
         * 定义一个方法
         * 调用这个方法
         * 返回值类型 可以是 byte short int long float double  boolean char string void......
         * 返回值类型诺不是 void，表示这个方法执行结束之后必须返回一个具体的数值。否则会报错
         */

       // public static int sumInt(int  a,int b) {



        //}

        //自定义方法不是程序入口:就是二个int的和，不要求返回结果，但要求将结果直接输出  到控制台
        //修饰符列表：public static
        //返回类型：void
        //方法名：sum
        //形式参数列表（int x， int 有）
        //方法体：主要任务是 求和之后的结果

            public  static Void sum(int x,int y){
                System.out.println(x +"+"+y+"="+(x+y));
                return null;
            }
        }


            

 