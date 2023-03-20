public class Overloadtext02 {
    //什么时候考虑方法 重载
    /*
     * 功能相同，尽可能让方法名相同
     */
    //方法重载和什么有关系和什么又没有关系
    /*
     * 方法重载和方法名+参数列表有关
     * 方法 重载 和返回值类型无 关 
     * 方法 重载 和修饰符列表 无 关 
     */

    //什么条件满足了之后构成方法重载
    /*
     * 在同一个 类当中
     * 方法名相同
     * 参数列表不同:
     *          -数量 不同
     *          -顺序不同
     *          -类型不同
     */
    //

    public static void main(String[] args) {
        m1();
        m1(10);

        m2(1, 2.0);
        m2(2.0,1);

        m3(10);
        m3(3.0);
        /*
        m4(1, 2);
        m4(2, 1);
        */
    }

    //以下二个方法构成重载
    public static void m1(){    }
    public static void m1(int  A){    }

    //以下二个方法构成重载
    public static void m2(int a,double b){    }
    public static void m2(Double a,  int A){    }
    //以下二个方法构成重载
    public static void m3(int x){    }
    public static void m3(Double x){    }

    //以下二个方法不构成重载.方法重复 编译报错
    //public static void m4(int a,int b){    }
    //public static void m4(int b,  int a){    }





}
