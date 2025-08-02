
    import java.util.Arrays;

public class ArraysCopyOf {
    
  public static void main(String[] args) 
  {
        int[] arr1 = {1, 2, 3, 4, 5};

        // copy the array to a new array with the same length
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);

        System.out.println("Original Array: " + Arrays.toString(arr1));
        System.out.println("Copied Array: " + Arrays.toString(arr2));
    }
}
    

