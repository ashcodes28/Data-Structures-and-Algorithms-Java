// Problem: Palindrome Linked List
// Platform: LeetCode 234
// Difficulty: Easy
// Pattern: Fast and Slow Pointer + Linked List Reversal
// Time Complexity: O(n)
// Space Complexity: O(1)
// Approach:
// 1. Use fast and slow pointers to find the middle of the linked list.
// 2. Reverse the second half of the list.
// 3. Compare the first half and reversed second half node by node.
// 4. If all values match, the list is a palindrome.
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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        //find middle of linkedlist
        ListNode fast=head;ListNode slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //now slow is at the mid so reverse list from slow.next
        temp=reverseList(slow.next);
        slow.next=null;
        while(head!=null&&temp!=null){
            if(head.val!=temp.val)return false;
            head=head.next;temp=temp.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;//prev will be the head (at the end curr will be null)
    }
}