// Problem: Find Greatest Common Divisor of Array
// Platform: LeetCode 1979
// Difficulty: Easy
// Pattern: Math - Euclidean Algorithm
// Time Complexity: O(n + log(min))
// Space Complexity: O(1)

class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int num: nums){
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        return gcd(max,min);
    }
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}