public class OOtext03 {
    public static void main(String[] args) {
        //创建一个丈夫或妻子对象
        /*
         * 可以 通过丈夫找到妻子相反妻子可以找到丈夫
         * 
         */
        Husband huangxiaoming = new Husband();//创建  一个 丈夫对象
        huangxiaoming.name="黄晓明";

        Wife baby = new Wife();//创建 一个妻子对象
        baby.name  = "小八嘎";
        

        huangxiaoming.w = baby;
        baby.h=  huangxiaoming;
        //得到以上黄晓明的妻子的 名字
        System.out.println(huangxiaoming.name+"的妻子名字 ："+ baby.name);
        System.out.println(huangxiaoming.name+"的妻子名字 ："+ huangxiaoming.w.name);


    }
}
