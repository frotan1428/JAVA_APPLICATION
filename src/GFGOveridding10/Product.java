package GFGOveridding10;

public class Product {

    public static void main(String[] args) {
        M m=new M();//super lass object
        M o=new O();// O class object use M Data Type
        M n=new N();// N class object use M Data Type
        O oo=new O();// o class object

        System.out.println(oo.product(12));

        System.out.println(n.product(12));

        System.out.println(m.product(12));





    }
}
