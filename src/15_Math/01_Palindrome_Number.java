// Problem: Palindrome Number
// Platform: LeetCode 9
// Difficulty: Easy
// Pattern: Math / String Manipulation

// Approach 1: String Conversion
// Time Complexity: O(n)
// Space Complexity: O(n)

// String Approach:
//    - Convert integer to string.
//    - Use two pointers to compare characters from both ends.

class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        int left=0;int right=s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;right--;
        }
        return true;       
    }
}

// Approach 2: Mathematical Reversal
// Time Complexity: O(log n)
// Space Complexity: O(1)

//  Math Approach:
//    - Reverse the integer mathematically.
//    - Compare reversed number with original number.
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;int original=x;int rev=0;
        while(x>0){
            rev=(rev*10)+(x%10);
            x/=10;
        }
        if(original==rev)return true; 
        return false;     
    }
}