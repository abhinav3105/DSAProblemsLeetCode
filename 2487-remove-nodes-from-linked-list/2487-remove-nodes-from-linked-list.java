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
    public ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        head = rev(head);
        int maxVal = head.val;
        ListNode curr = head.next, prev= head;
        while(curr !=null ){
            if(curr.val >=maxVal){
                prev=curr;
                maxVal = curr.val;
            }
            else{
                prev.next = curr.next;
            }
            curr =curr.next;
        }
        return rev(head);
    }
}