package CreditCardNumber;

public class CreditCardNum {

    private  String CreditCardNum="0001111098123475";

    public String getCreditCardNum() {
        return CreditCardNum;
    }

    public void setCreditCardNum(String creditCardNum) {
        this.CreditCardNum = creditCardNum;
    }

    public static void main(String[] args) {


        CreditCardNum cardNumber=new CreditCardNum();

        System.out.println(cardNumber.getCreditCardNum());


        String Card=cardNumber.getCreditCardNum();


       cardNumber.setCreditCardNum("****"+Card.substring(Card.length()-10));
        System.out.println(cardNumber.getCreditCardNum());










    }
}
