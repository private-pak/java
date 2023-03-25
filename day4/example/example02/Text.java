package example.example02;

public class Text {
public static void main(String[] args) {   

        Ren renming  =  new Ren();
        renming.id=11;
        renming.name="张三";
        renming.age=12;
        renming.sex=false;

        Bieshu fangzi= new Bieshu();

        fangzi.mianJi  =  120;
        fangzi.zhuRen = renming;

        System.out.println(fangzi.zhuRen.name);//张三
        System.out.println(fangzi.zhuRen.age);//12
        /*
         * 房主换人
         * 创建一个新的房主 对象
         */
        Ren lisl  =  new Ren();
        lisl.name= "李四";
        lisl.age=22;
        //换人
        fangzi.zhuRen = lisl;
        
        System.out.println(fangzi.zhuRen.name);//李四
        System.out.println(fangzi.zhuRen.age);//22

    }
}
