import java.util.Arrays;

public class ArrayManipulations {

    public static void main(String[] args) {

        double[] doubleArray = { 8.1, 9.2, 4.3, 0.7, 2.5 };
        Arrays.sort(doubleArray);

        System.out.printf("\ndoubleArray: ");

        for(double value : doubleArray)
            System.out.printf("%.1f", value);

        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray");

        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("\n\nintArray %s intArrayCopy\n", (b ? "==" : "!="));

        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray", (b ? "==" : "!="));

        int location = Arrays.binarySearch(intArray, 5);
        if(location >= 0)
            System.out.printf("\nFound 5 at the element %d in intArray\n", location);
        else
            System.out.println("5 not found in intArray");

        location = Arrays.binarySearch(intArray, 8763);
        if(location >= 0)
            System.out.printf("Found 8763 at element %d in intArray\n", location);
        else
            System.out.printf("8763 not found in intArray");
    }
    public static void displayArray(int[] array, String description){
        System.out.printf("\n%s: ", description);

        for(int value : array)
            System.out.printf("%d", value);
    }
}
