package GFGOveridding7;

public class Sub extends Super{

    @Override
    public Integer getLength() {
      return  new Integer(5);
    }

    public static void main(String[] args) {

        Super aSuper=new Super();

        Sub sub=new Sub();
        System.out.println(aSuper.getLength().toString()+","+sub.getLength().toString());

    }
}
