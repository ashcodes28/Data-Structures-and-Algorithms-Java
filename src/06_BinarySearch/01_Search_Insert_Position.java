// Problem: Search Insert Position
// Platform: LeetCode 35
// Difficulty: Easy
// Pattern: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;int high=nums.length-1;int mid=0;
        while(high>=low){
            mid=low+(high-low)/2;
            if(target==nums[mid])return mid;
            else if(target>=nums[mid]) low=mid+1;
            else high=mid-1;
        }
        if(target>nums[mid])return mid+1;
        return mid;
    }
}