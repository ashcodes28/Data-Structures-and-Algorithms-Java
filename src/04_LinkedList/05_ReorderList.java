// Problem: Reorder List
// Platform: LeetCode 143
// Difficulty: Medium
// Pattern: Fast-Slow Pointer + Reverse Linked List + Merge Two Lists
// Time Complexity: O(n)
// Space Complexity: O(1)
// Approach:
// 1. Use fast and slow pointers to find the middle of the list.
// 2. Reverse the second half of the list.
// 3. Merge the first half and reversed second half alternately.

class Solution {

    public void reorderList(ListNode head) {

        if (head == null || head.next == null) return;

        // Step 1: Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode secondHalf = reverseList(slow.next);
        slow.next = null;   // Break the list

        // Step 3: Merge two halves
        ListNode firstHalf = head;

        while (secondHalf != null) {

            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            firstHalf = temp1;
            secondHalf = temp2;
        }
    }

    private ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}