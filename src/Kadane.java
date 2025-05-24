//Maximum Subarray Sum
//Given an array arr[], the task is to
// find the subarray that has the maximum sum
// and return its sum.

public class Kadane {
    public static int maxSubarraySum(int[] arr){
        int globalMax = arr[0];
        int currentMax = arr[0];
        for (int i=1; i<arr.length; i++){
            currentMax = Math.max(currentMax + arr[i], arr[i]);
            globalMax = Math.max(globalMax, currentMax);
        }
        return globalMax;
    }
}