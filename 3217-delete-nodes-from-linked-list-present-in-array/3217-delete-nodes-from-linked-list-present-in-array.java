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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i]+1));
            }
            else{
                mp.put(nums[i],1);
            }
        }
        while(mp.containsKey(head.val) && mp.get(head.val)>0){
            //mp.put(head.val,mp.get(head.val)-1);
            head=head.next;
        }
        ListNode temp = head;
        ListNode prev = head ;
        while(temp!=null){
            if(mp.containsKey(temp.val) && mp.get(temp.val)>0){
                //mp.put(temp.val,mp.get(temp.val)-1);
                prev.next = temp.next;
                temp = temp.next;
            }
            else{
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}