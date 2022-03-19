package JavaApplication;

public class lastIndex {
    public static void main(String[] args) {

        String str = "Cat, caterpillar";
        //int idx1 = str.lastIndexOf("a");
        //  int idx2 = str.lastIndexOf("at");
        // int idx3 = str.lastIndexOf("s");
        int idx4 = str.lastIndexOf("CAT");
        // int idx6 = str.lastIndexOf("pars");
        int idx7 = str.lastIndexOf("a" , 5 );
        int idx8 = str.lastIndexOf("a" , 5 );
        int idx9 = str.lastIndexOf("at", 2);
        int idx10 = str.lastIndexOf("at", 7);
//        System.out.println(idx7);
//        System.out.println(idx8);
//        System.out.println(idx9);
////        System.out.println(idx10);
//        String str1 = str.substring(15);
//        System.out.println(str1);


        String strA ="      Cat      ";
        String str2 = strA.trim();
        System.out.println(str2);
    }
}
