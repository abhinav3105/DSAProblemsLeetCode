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
    public int[][] spiralMatrix(int rows, int columns, ListNode head) {
        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            matrix[i] = new int [columns];
            Arrays.fill(matrix[i], -1);
        }

        int rs = 0, re = rows - 1, cs = 0, ce = columns - 1;
        while (head != null) {
        
            for (int col = cs; col <= ce && head != null; col++) {
                matrix[rs][col] = head.val;
                head = head.next;
            }
            rs++;

        
            for (int row = rs; row <= re && head != null; row++) {
                matrix[row][ce] = head.val;
                head = head.next;
            }
            ce--;

 
            for (int col = ce; col >= cs && head != null; col--) {
                matrix[re][col] = head.val;
                head = head.next;
            }
            re--;

       
            for (int row = re; row >= rs && head != null; row--) {
                matrix[row][cs] = head.val;
                head = head.next;
            }
            cs++;
        }

        return matrix;
    }
}