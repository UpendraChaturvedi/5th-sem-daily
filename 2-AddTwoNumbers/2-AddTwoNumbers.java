// Last updated: 9/4/2025, 12:08:55 PM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0),curr=head;
        int carry=0;
        while(l1!=null || l2!=null){
            int x=(l1!=null)?l1.val:0,y=(l2!=null)?l2.val:0;
            int s=x+y+carry;
            carry=s/10;
            curr.next=new ListNode(s%10);
            curr=curr.next;
            if(l1!=null){
                l1=l1.next;

            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        if(carry>0){
            curr.next=new ListNode(carry);
        }
        return head.next;
        
    }
}