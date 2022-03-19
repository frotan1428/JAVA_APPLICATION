package Method;

public class M1 {


    public static void main(String[] args) {
        M1 m1=new M1();
        int s=  m1.add(3,5);
        m1.product(3,3);
        System.out.println(m1.product(3,5));
        System.out.println(s);
    }

    public int add(int a,int b){
        int sum=0;
        sum=a+b;
        return sum;
    }

    public int product(int a,int b){
        int product=0;
        product=a*b;
        return product;
    }
}
