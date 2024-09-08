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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int[] size_of_elements = new int[k];
        ListNode curr = head;
        int count_nodes=0;
        while(curr!=null){

            count_nodes++;
            curr = curr.next;
        }
        int size = count_nodes/k;
        int remaining_size = count_nodes%k;
        Arrays.fill(size_of_elements,size);
        int ind=0;
        while(remaining_size!=0){
            size_of_elements[ind++]++;
            remaining_size--;
        }
        curr = head;
        // System.out.println(Arrays.toString(size_of_elements));
        ListNode[] answer = new ListNode[k];
        for(int i=0;i<k;i++){

            int curr_size =1;
            while(curr_size!=size_of_elements[i] && curr!=null){
                curr_size++;
                curr = curr.next;
            }
            ListNode new_head = null;
            if(curr!=null){
                 new_head = curr.next;
                 curr.next = null;
            }
            answer[i] = head;
            head = new_head;
            curr = new_head;
            if(curr==null) break; 
        }
        return answer;

        
    }
}