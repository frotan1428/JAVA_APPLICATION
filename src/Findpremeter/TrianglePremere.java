package Findpremeter;

public class TrianglePremere {

    public static void main(String[] args) {

       // System.out.println(sum(3,5));
       // pre(4,5);
      //  System.out.println(convert(3));

      //  triArea(3,4);
      //  System.out.println(squaed(1));

        //System.out.println(power(5,3));
        System.out.println( convert(2,1));
    }

    public static  void  pre(int a,int b){

        System.out.println(2*(a+b));

    }

    public static int sum(int a, int b) {

        return a+b;

    }

    public static int convert(int minutes) {

        return minutes * 60;

    }

    public static int triArea(int base, int height) {

        return (base*height)/2;
    }

    public static double power(int voltage, int current) {
        return Math.pow(voltage,current);

    }

    public static double squaed(int b) {
        return Math.sqrt(2);
    }

    public static int convert(int hours, int minutes) {
        if (minutes>0){
           return minutes;
        }

        return hours*minutes*60;

    }
}
