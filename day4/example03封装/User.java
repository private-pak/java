package example03封装;

/*
 * 用户类
 * 封装 private
 * 提供 外部操作入口 
 *  -  读取这个属性的值 读取 set
 *  -  修改这个属性的值 修改 get 
 *  set方法 的 命名规范  
 *          pubilc void set +  属性名（形参 ）{
 *          }
 *          pubilc void set +  setAge(int a ）{
 *              age = a;
 *          }
 * get方法的命名规范
 *          public int getAge(){
 *          return age;
 *          }
 *  注：
 *          setter and getter方法没有static关键字  
 *          有static关键字修饰符的方法调用 类名 .方法名（实参）;    
 *          没有static关键字 修饰符的方法调用 引用.方法名 （实参）; 
 * 
 */
public class User {
    private int age;// 私有化
    //setter    方法没有返回值 ，因为 set方法只负责修改数据
    public void setAge(int a){
        //编写控制 
        if(a<0 || a >  150){
            System.out.println("你 提供的数据有误");
            return;
        }
        age =  a;
    }
    //getter方法
    public int getAge(){
        return age;
    }

    String name;

}
