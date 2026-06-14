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
    public int pairSum(ListNode head) {
        ListNode temp=head;
        int n=1;
        while(temp.next!=null){
            temp=temp.next;
            n++;
        }
        ListNode p2=head;
        int i=1;
        while(i<=(n/2)){
            p2=p2.next;
            i++;
        }
        temp=p2;
        ListNode prev=null;
        while(temp!=null){
            temp=temp.next;
            p2.next=prev;
            prev=p2;
            p2=temp;
        }

    
        i=1;
        ListNode p1=head;
        p2=prev;
        int max=Integer.MIN_VALUE;
        while(i<=(n/2)){
            {
                max=Math.max(max,p1.val+p2.val);
                p1=p1.next;
                p2=p2.next;

            }

      
            i++;
        }





        return max;
        
        
    }
}
