package 实体引用;

public class OOText06 {
    public static void main(String[] args) {
        
        Product iD01  = new Product();

        iD01.productNo = 11;
        iD01.price  = 2.1;
        
        System.out.println("商品编号"+  iD01.productNo);
        System.out.println("商品单价 "+iD01.price);
    }
}
