package GfgExpetions;

public class E05 {
    public static void main(String[] args) {

        String arr1[]={"Ali","veli","sana"};
        getArray(arr1,2);


    }


    public static void getArray(String arr[],int idx){
      try {
          System.out.println(arr[idx]);
      }catch (ArrayIndexOutOfBoundsException ex){
          System.out.println("The size of array out of number :"+ex.getMessage());
      }
    }
}
