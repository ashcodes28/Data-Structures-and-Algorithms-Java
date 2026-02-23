// Problem: Climbing Stairs
// Platform: LeetCode 70
// Difficulty: Easy
// Pattern: Recursion with Memoization (Top-Down DP)
// Time Complexity: O(n)
// Space Complexity: O(n) for dp array + O(n) recursion stack
class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        return helper(n,dp);
    }
    public int helper(int n,int[] dp){
        if(n<0) return 0;
        if(n==0) return 1;
        if(dp[n]!=0) return dp[n];
        dp[n]=helper(n-1,dp)+helper(n-2,dp);
        return dp[n];
    }
}