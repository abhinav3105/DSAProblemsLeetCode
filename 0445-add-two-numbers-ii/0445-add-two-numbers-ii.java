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
    ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode num1, ListNode num2) {
        ListNode sumHead = new ListNode(0);
        ListNode sum = sumHead;
        // ListNode revNum1 = reverse(num1);
        // ListNode revNum2 = reverse(num2);
        int sz1 = 0;
        int sz2 = 0;
    
        ListNode temp1 = num1;
        ListNode temp2 = num2;
        while(temp1 != null){
            sz1++;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            sz2++;
            temp2 = temp2.next;
        }
        temp1 = reverse(num1);
        temp2 = reverse(num2);
        int c = 0;
        for(int i = 0;i<Math.min(sz1,sz2);i++){
            int x = temp1.val + temp2.val + c;
            c = 0;
            if(x<10){
                sum.next = new ListNode(x);
            }
            else{
                sum.next = new ListNode(x%10);
                c = x/10;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
            sum = sum.next;
        }
        while(temp1 != null){
            int x = temp1.val +c;
            c =0;
             if(x<10){
                sum.next = new ListNode(x);
            }
            else{
                sum.next = new ListNode(x%10);
                c = x/10;
            }
            temp1 = temp1.next;
            sum = sum.next;
        }
        while(temp2 != null){
            int x = temp2.val +c;
            c =0;
             if(x<10){
                sum.next = new ListNode(x);
            }
            else{
                sum.next = new ListNode(x%10);
                c = x/10;
            }
            temp2 = temp2.next;
            sum = sum.next;
        }
        if(c>0) sum.next = new ListNode(c);
        return reverse(sumHead.next);
        
    }
}