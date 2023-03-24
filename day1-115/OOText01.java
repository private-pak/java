public class OOText01 {
    public static void main(String[] args) {

        //创建User对象
        /*
         * u是 局部变量
         * u是一个 引用
         * u保存内存地址指向堆内存的user对象
         */
        User  u = new User();
        //输出user对象内部实例变量的值
        System.out.println(u.no);//0
        System.out.println(u.name);//null
        System.out.println(u.addr);//null

        //修改user对象内部实例变量的值
        u.no = 10;
        u.name = "李四";
        u.addr=new Address();
        /*
         * 在main方法当中目前只能看到一个引用对象 u
         * 一切 都是只能 通过u来进行访问
         */
                
        System.out.println(u.name+"居住在哪个城市："+u.addr.city);
        System.out.println(u.name+"居住在哪个街道："+u.addr.street);
        System.out.println(u.name+"的邮箱："+u.addr.zipcode);

        u.addr.city = "上海";
        u.addr.street = "上海街 ";
        u.addr.zipcode = "1111111111111111";

        System.out.println("----------------------");

        System.out.println(u.name+"居住在哪个城市："+u.addr.city);
        System.out.println(u.name+"居住在哪个街道："+u.addr.street);
        System.out.println(u.name+"的邮箱："+u.addr.zipcode);
    }
    
}
