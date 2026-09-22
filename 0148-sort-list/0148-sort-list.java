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
    public ListNode sortList(ListNode head) {
         if (head==null || head.next==null) {
            return head;
        }

        int counter=0;
        
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            counter++;
        }
        temp=head;
        
        int i=0;
        int[] arr=new int[counter];
        while(temp!=null){
            arr[i]=temp.val;
            temp=temp.next;
            i++;
        }
        Arrays.sort(arr);
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for (int val:arr) {
            curr.next=new ListNode(val);
            curr=curr.next;
        }

        return dummy.next;
    }
}