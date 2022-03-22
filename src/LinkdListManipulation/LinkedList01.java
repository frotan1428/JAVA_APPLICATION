package LinkdListManipulation;

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {


        LinkedList<String> list=new LinkedList<>();
            //Adding Elements on the List
        list.add("Mojib");
        list.add("frotan");

        System.out.println(list);//[Mojib, frotan]
            //adding Elements with index at hte 3th position.
        list.add(2,"Musleh");
        System.out.println(list);// [Mojib, frotan, Musleh]

        //Adding Elements on the List at the first  position With addfirst() method.
        list.addFirst("Ozam");

        System.out.println(list);//[Ozam, Mojib, frotan, Musleh]

        //Adding Elements on the List at the Last position  With Add last() method.
        list.addLast("Bahar");

        System.out.println(list);//[Ozam, Mojib, frotan, Musleh, Bahar]

        System.out.println( list.contains("Nahar"));//flase
        System.out.println(list.contains("Mojib"));//true

        //print the size of LinkedList
        System.out.println(list.size());//5
        //print the first  elements
        System.out.println(list.getFirst());//Ozma

        //print the first  elements
        System.out.println(list.element());//Ozma

        System.out.println(list.peek());
        System.out.println(list);//[Ozam, Mojib, frotan, Musleh, Bahar]
        //print the first element with remove the First Elemnts.
        System.out.println(list.poll());
        System.out.println(list);//[Mojib, frotan, Musleh, Bahar]

        //Remove The First Elements From the ist
        System.out.println(list.removeFirst());//Mojib
        System.out.println(list);// after remving [frotan, Musleh, Bahar]
        //Remove The last  Elements From the ist

        System.out.println(list.removeLast());//Bahar
        System.out.println(list);//frotan, Musleh]


        //Remove The   Elements with index From the ist

        System.out.println(list.remove(0));//frotan

        System.out.println(list);//[Musleh]

        System.out.println(list.remove(0));//Musleh

        System.out.println(list);//[]

        list.add("Khan");
        list.add("Ali");
        list.add("Can");

        System.out.println(list);//[Khan, Ali, Can]




















    }

}
