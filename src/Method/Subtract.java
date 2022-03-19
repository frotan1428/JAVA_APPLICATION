package Method;

public class Subtract {

    public static void main(String[] args) {

        Subtract subtract=new Subtract();
            int sub=subtract.sub(2,4);
        System.out.println(sub);
        System.out.println(subtract.sub(3,4));
    }

    public int sub(int a,int b){
        return a-b;
    }
}
