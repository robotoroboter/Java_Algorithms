// Find missing number in an Array
// Given array of length = n-1, storing distinct (=one after another) integers in range (1..n), missing one number,
// find the missing number

public class ArrayMissingNumber {
    public static int findMissingNumber(int[] arr){
        int n = arr.length + 1;
        int[] frequencyHashMap = new int[n+1];
        for (int number : arr){
            frequencyHashMap[number]++;
            //System.out.println("number: " + number + " exists in array and added to hashmap. Hashmap: ");
        }
        for (int i=1 ; i<frequencyHashMap.length; i++){
            if (frequencyHashMap[i] == 0){
                return i;
            }
        }
        return 0;   //should never happen but compiler requires
    }
}
