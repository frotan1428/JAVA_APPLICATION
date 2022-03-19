package Method;

public class product {

    int a=12;
    int b=3;

    public static void main(String[] args) {
        product p1=new product();
        System.out.println(p1.a);
        System.out.println(p1.b);
        System.out.println(p1.a * p1.b);

    }

    public product() {
        this.a = a;
        this.b = b;
        System.out.println(a*b);
    }
}
