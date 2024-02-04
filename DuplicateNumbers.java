public class DuplicateNumbers {
    public static int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];
        
        // Phase 1: Finding the intersection point of the two pointers
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);
        
        // Phase 2: Finding the entrance of the cycle
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        
        return hare;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 4, 2, 2};
        System.out.println("Duplicate number: " + findDuplicate(nums));
    }
}


