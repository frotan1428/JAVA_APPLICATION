package GetterAndSetter;

public class B {

    public static void main(String[] args) {

        A a=new A();
        System.out.println(a.getName());
        System.out.println(a.getId());
        System.out.println(a.isMother());

        String name2=a.getName();

        a.setName("14 "+name2.substring(name2.length()-12));
        System.out.println(a.getName());

    }
}
