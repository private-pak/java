package example.example01;
//计算机 类
class  Computer{
    String brand;
    String style;
    String  clolor;
}
//学生类
class Student{
    int no;
    String name;
    Computer notepad;
}
public class OOText06 {
    public static void main(String[] args) {

        Computer bijiben =  new Computer();

        bijiben.brand="联想";
        bijiben.style="L110";
        bijiben.clolor="白色";

        Student xueshenID = new Student();
        xueshenID.no=120012;
        xueshenID.name="张三 ";
        xueshenID.notepad=bijiben;

        System.out.println(xueshenID.notepad.brand);//联想
        System.out.println(xueshenID.notepad.style);//L110
        System.out.println(xueshenID.notepad.clolor);//白色

        xueshenID.notepad.brand="苹果 ";

        System.out.println(xueshenID.notepad.brand);//苹果

        
    }
    
}
