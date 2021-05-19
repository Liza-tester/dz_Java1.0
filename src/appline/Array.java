package appline;

public class Array {
    public static void main(String[] args) {
        int[] MyArray = {1, 2, 3, 4, 5};
        System.out.println( "sum = " + (MyArray[(MyArray.length-1)/2] + MyArray[MyArray.length -1]) );
    }
}
