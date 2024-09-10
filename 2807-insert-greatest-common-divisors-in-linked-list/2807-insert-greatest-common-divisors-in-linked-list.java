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
    public int gcd(int a, int b)
    {
        int i;
        if (a < b)
            i = a;
        else
            i = b;
        for (i = i; i > 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr.next != null) {
            prev = curr;
            curr = curr.next;
            ListNode temp = new ListNode(gcd(prev.val, curr.val));
            temp.next = prev.next;
            prev.next = temp;
        }
        return head;
    }
}