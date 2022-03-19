package Inheritance4;



public class MyCalculation {

    public void Multiply(int x,int y){

        System.out.println(x*y);
    }

    public static void main(String[] args) {


        Calculation calculation=new Calculation();
      calculation.subtraction(13,4);
      calculation.addition(12,12);
      calculation.Multiply(12,12);

        System.out.println(calculation instanceof MyCalculation);


    }
}
