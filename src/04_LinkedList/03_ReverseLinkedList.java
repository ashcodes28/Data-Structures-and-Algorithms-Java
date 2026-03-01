// Problem: Reverse Linked List
// Platform: LeetCode 206
// Difficulty: Easy
// Pattern: Iterative Linked List Reversal (Three-Pointer Technique)
// Time Complexity: O(n)
// Space Complexity: O(1)
// Approach:
// 1. Use three pointers: prev, curr, next.
// 2. Reverse current node's pointer to previous.
// 3. Move all pointers one step forward.
// 4. Continue until curr becomes null.
// 5. Return prev as new head.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}