package JavaApplication;

public class ternaryOperation {
    public static void main(String[] args) {


        int studentGrade=90;
        System.out.println(studentGrade >= 90  ? "passed" : "falied") ;

        int YY=200;
        System.out.println(YY>7? 21 :"Zebra");

        System.out.println((YY < 91) ? 9 : "Horse");

        int y = 11;
        int z = 11;
        int result = y<10 ? y++ : z++;
        System.out.println(result + "," + y +"," + z);

    }
}
