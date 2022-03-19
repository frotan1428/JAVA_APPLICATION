package Constructor;

public class addition {

    int a;
    int b;


    public static void main(String[] args) {

        addition add=new addition(5,3);
        int sum=add.a+ add.b;
        System.out.println(sum);

        System.out.println(add.a+ add.b);

    }

    public addition(int a, int b) {
        this.a = a;
        this.b = b;


    }
}
