// Problem: Remove Linked List Elements
// Platform: LeetCode 203
// Difficulty: Easy
// Pattern: Linked List Traversal with Dummy Node
// Time Complexity: O(n)
// Space Complexity: O(1)
// Approach:
// 1. Use a dummy node pointing to head to handle edge cases (like removing head).
// 2. Traverse the list using a pointer.
// 3. If current.next.val == target value, skip the node.
// 4. Otherwise, move forward.
// 5. Return dummy.next.
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
public ListNode removeElements(ListNode head, int val) {
    
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prev = dummy;
    ListNode curr = head;

    while(curr != null){
        if(curr.val == val){
            prev.next = curr.next;
        } else {
            prev = curr;
        }
        curr = curr.next;
    }

    return dummy.next;
}