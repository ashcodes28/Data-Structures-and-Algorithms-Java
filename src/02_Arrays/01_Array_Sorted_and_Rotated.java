// Problem: Check if Array Is Sorted and Rotated
// Platform: LeetCode 1752
// Difficulty: Easy
// Pattern: Array Traversal / Circular Array Observation
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length])count++;
        }
        return count<=1;
    }
}