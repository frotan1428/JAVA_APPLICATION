package GetemailAdress;

import java.util.Currency;

public class MailRunner {

    public static void main(String[] args) {

        Mail mail=new Mail();
        System.out.println("My email: "+mail.getEmail());
        String MyEmail= mail.getEmail();

        mail.setEmail("************" + MyEmail.substring((MyEmail.length()-10)));
        System.out.println(mail.getEmail());

        mail.setEmail("************" + MyEmail.substring((MyEmail.length()-6)));
        System.out.println(mail.getEmail());

        Mail MyID=new Mail();

        System.out.println("MyID "+MyID.getSchoolId());

        String  MyUpdateID=MyID.getSchoolId();

        MyID.setSchoolId("***"+MyUpdateID.substring(MyUpdateID.length()-1));
        System.out.println(MyID.getSchoolId());

        MyID.setSchoolId("Not visible");
        System.out.println(MyID.getSchoolId());







    }


}
