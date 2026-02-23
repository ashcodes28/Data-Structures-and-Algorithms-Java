// Problem: Climbing Stairs
// Platform: LeetCode 70
// Difficulty: Easy
// Pattern: Basic Recursion
// Time Complexity: O(2^n)
// Space Complexity: O(n) recursion stack
//This is not the optimised solution. It leads to TLE
class Solution {
    public int climbStairs(int n) {
        if(n<0) return 0;
        if(n==0)return 1;
        return climbStairs(n-1)+climbStairs(n-2); 
    }
}