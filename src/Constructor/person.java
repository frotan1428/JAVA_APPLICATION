package Constructor;

public class person {


    public static void main(String[] args) {

        person p1=new person("ali");
        person p2=new person("ali",2);
        person p3=new person(1427);

    }
    public person(String name){

        System.out.println(name);

    }

    public person(String name, int age){

        System.out.println(name+age);
    }

    private  person(long id ){
        System.out.println(id);
    }

}
