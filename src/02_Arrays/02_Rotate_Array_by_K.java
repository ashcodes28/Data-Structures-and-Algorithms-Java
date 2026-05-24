// Problem: Rotate Array
// Platform: LeetCode 189
// Difficulty: Medium
// Pattern: Array Reversal Technique
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        rotatearr(0,n-1,nums);
        rotatearr(0,k-1,nums);
        rotatearr(k,n-1,nums);
    }
    static int[] rotatearr(int start,int end,int[] arr){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
        return arr;
    }
}