// Problem: Bubble Sort
// Pattern: Sorting
// Platform: LeetCode 912
// Difficulty: Medium
// Time Complexity:
// Best Case: O(n)
// Average Case: O(n²)
// Worst Case: O(n²)
// Space Complexity: O(1)

//This code in this problem throws a "Time limit exceeded" exception as bubble sort is not optimised.


class Solution {
    public int[] sortArray(int[] nums) {
        int i,j;boolean swapped;
        swapped=false;
        for(i=0;i<nums.length-1;i++){
            swapped=false;
            for(j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false)break;
        }
        return nums;
    }
}