//import java.util.Scanner;
public class FindSumPair {

    public static int[] findSumPair(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {}; // Return an empty array if no pair is found
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int targetSum = 9;
        int[] result = findSumPair(numbers, targetSum);

        if (result.length == 2) {
            System.out.println("Pair found at indices: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No pair found for the target sum.");
        }
    }
}
