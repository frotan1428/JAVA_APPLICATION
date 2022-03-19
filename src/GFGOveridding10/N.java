package GFGOveridding10;

public class N extends M{

    @Override
    int product(int i) {

        int result =i+i;
        System.out.println("["+i+ ","+result+"]~");

        return result;
    }
}
