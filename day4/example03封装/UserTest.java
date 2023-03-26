package example03封装;

/*
 * 用户 测试 类 
 */
public class UserTest {
    public static void main(String[] args) {
        // 创建 User对象
        // 访问年龄age
        User user = new User();

        //修改
        user.setAge(110);
        //读取
        System.out.println(user.getAge());



        /*
        System.out.println("该用户的年龄是：" + user.age);
        // 修改年龄 set
        user.age = 20;
        System.out.println("该用户 的 年龄是：" + user.age);

        //修改iD
        user.name =  "张三 ";
        System.out.println("该用户的名字是："+user.name);
        */

    }

}
