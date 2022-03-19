package GFGOveridding10;

public class O extends M{
    @Override
    int product(int i) {

        int result =i*2;
        System.out.println("("+i+ ","+result+")~");

        return result;
    }
}
