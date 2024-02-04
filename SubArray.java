import java.util.HashMap;
import java.util.Map;

public class SubArray {
    public static int subarraySum(int[] nums, int k) {
        // Map to store cumulative sum and its frequency
        Map<Integer, Integer> sumMap = new HashMap();
        sumMap.put(0, 1); // Initialize with sum = 0 and frequency = 1
        int count = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            // If cumulative sum - k exists in the map, then there exists a subarray with sum k
            if (sumMap.containsKey(sum - k)) {
                count += sumMap.get(sum - k);
            }
            // Update the frequency of current cumulative sum
            sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4};
        int k = 2;
        System.out.println("Total number of continuous subarrays whose sum equals " + k + ": " + subarraySum(nums, k));
    }
}

 
