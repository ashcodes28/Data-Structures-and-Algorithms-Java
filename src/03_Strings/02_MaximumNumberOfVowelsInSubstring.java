// Problem: Maximum Number of Vowels in a Substring of Given Length
// Platform: LeetCode 1456
// Difficulty: Medium
// Pattern: Sliding Window
// Time Complexity: O(n)
// Space Complexity: O(1)

// Approach:
// 1. Count vowels in the first window of size k.
// 2. Slide the window one character at a time.
// 3. Remove left character contribution and add right character contribution.
// 4. Track the maximum vowel count seen in any window.
class Solution {
    public boolean isVowel(char c){
    return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int maxVowels(String s, int k) {
        int maxvow=0,vow=0;
        int n=s.length();
        char[] str=s.toCharArray();
        //first window
        for(int i=0;i<k;i++){
            if(isVowel(str[i])){
                vow++;
            }
        }
        maxvow=vow;
        for(int i=k;i<n;i++){
            if(isVowel(str[i-k]))vow--;
            if(isVowel(str[i]))vow++;
            if(vow>maxvow)maxvow=vow;
        }
        return maxvow;
    }
}