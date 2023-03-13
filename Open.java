public class Open {
    public static void  main(String[] agres){
        int  a = 10;
        int  b  = a ++;
        System.out.println(a);//11  //++ 出现在变后，先做赋值在对变量保存的值进行加1
        System.out.println(b);//10
        //++ 出现在变量前面，先进行自加1 然后在进行赋值操作
        int m = 20;
        int n =  ++ m;
        System.out.println(m);//21
        System.out.println(n);//21
        int  e  = 100;
        System.out.println(e ++);//100 ++后先赋值
        System.out.println(e);//101
        int s  = 200;
        System.out.println(++s);//201 ++前先自加1
        System.out.println(s);//201
        System.out.println(--s);//200
        System.out.println("--------------------------------------");
         int x =  10;
         int  y = 8;
         System.out.println(x < y & ++x < y);//Flase 逻辑与 
         System.out.println(x);//11
         System.out.println("--------------------------------------");
         int x1  = 20;
         int y1 =  18;
         System.out.println(x1 < y1 && ++x1 < y1);// 短路与 x<y 结果是false 所以整个表达式就是flash
         System.out.println(x1);

    }
}
