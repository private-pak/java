public class Studenttext02 {
    //private String no;

    public static void main(String[] args) {
        //int是基本数据类型  
        //i是一个变量 名
        //20是一个int类型 的字面值
        //Studenttext01是一个引用类
         //new Studenttext01();
         //s是一个 变量名
         // new studenttext02()是一个学生对象
         /*
        int i = 20;
        Studenttext02 s = new Studenttext02();
        */
        
        /*
        int  stuNo  = s.no;
        String stuName = s.name;
        int stuAge =  s.age;
        boolean stuSex  = s.sex;
        String stuAddr  = s.addr;
        */
        //System.out.println("学号 = "+  s.no);

       
        Studenttext01 tre = new Studenttext01();
        tre.no =12001522;
        tre.name="张三";
        tre.sex=true;
        tre.age=20;
        tre.addr="北京";
        System.out.println(tre.no);
        System.out.println(tre.name);
        System.out.println(tre.sex);
        System.out.println(tre.age);
        System.out.println(tre.addr);

    }
}
