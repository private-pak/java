public class OOtext02 {
    public static void main(String[] args) {
        User u = new User();
        Address a = new  Address();
        u.addr =a;

        System.out.println(u.addr.city);//null
        a.city="天津";
        System.out.println(u.addr.city);//天津


    }
}
