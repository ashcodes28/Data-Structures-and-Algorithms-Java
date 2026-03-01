// Problem: Remove Outermost Parentheses
// Platform: LeetCode 1021
// Difficulty: Easy
// Pattern: Parentheses Depth Counting (Balance Counter)
// Time Complexity: O(n)
// Space Complexity: O(n)
// Approach:
// 1. Maintain a balance counter to track current parentheses depth.
// 2. For '(' increase count, for ')' decrease count.
// 3. Skip the first '(' of every primitive (when count becomes 1).
// 4. Skip the last ')' of every primitive (when count becomes 0).
// 5. Append all inner parentheses to result.
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(curr=='('){
                count++;
                if(count>1)sb.append(curr);
            }
            else{
                count--;
                if(count>0)sb.append(curr);
            }
        }
        return sb.toString();
    }
}