package StringBuilder;

public class StringBuilder {


    public static void main(String[] args) {

       StringBuffer sb=new StringBuffer("FROTAN");

       String sub1=sb.substring(2);//OTAN
        System.out.println(sub1);

        String sub2=sb.substring(2,5);//OTA
        System.out.println(sub2);

        System.out.println(sb.indexOf("N"));//5

        System.out.println(sb.length());//6

        System.out.println(sb.charAt(5));//N
        System.out.println(sb.charAt(0));//F

        StringBuffer sb1=new StringBuffer();

        sb1.append("A").append("B").append(1427).append("@gmail.com");
        System.out.println(sb1);

        java.lang.StringBuilder sb2=new java.lang.StringBuilder("Animal");

        sb2.delete(2,4);
        System.out.println(sb2);
        System.out.println(sb2.deleteCharAt(2));
        System.out.println(sb2.reverse());

        System.out.println(sb.toString());

        java.lang.StringBuilder sb3=new java.lang.StringBuilder();

        sb3.append("aaa").insert(1,"bb").insert(4,"ccc");
        System.out.println(sb3);//abbaccca












    }
}
