public class Main{
    public static void main(String[] args) {

        //Kadane
        Kadane kadane = new Kadane();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(Kadane.maxSubarraySum(arr));
    }
}