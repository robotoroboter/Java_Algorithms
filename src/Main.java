import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        //Kadane
        int[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Kadane's algorithm:\n Given array: " + Arrays.toString(arr1) + ", the subarray with max sum of elements, has sum = " + Kadane.maxSubarraySum(arr1));
        int[] arr2 = {8, 2, 4, 5, 3, 7, 1};
        System.out.println("Array Missing Number: Given array: " + Arrays.toString(arr2) + ", the missing element = " + ArrayMissingNumber.findMissingNumber(arr2));
    }
}