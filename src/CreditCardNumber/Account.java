package CreditCardNumber;

public class Account {


    private int Acc=1428;

    public void setAcc(int acc) {
        this.Acc = acc;
    }

    public int getAcc() {
        return Acc;
    }

    public static void main(String[] args) {

        Account account=new Account();
        System.out.println(account.getAcc());

    }
}
