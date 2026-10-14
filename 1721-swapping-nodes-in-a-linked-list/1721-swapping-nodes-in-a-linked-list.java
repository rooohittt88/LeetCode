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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int count=0;

        while(temp!=null){
            temp=temp.next;
            count++;
        }

        int[] arr=new int[count];
        int i=0;
        
        temp=head;
        
        while(temp!=null){
            arr[i]=temp.val;
            temp=temp.next;
            i++;
        }
        
        int temp1=arr[k-1];
        int temp2=arr[count-k];
        int temp3=temp1;
        arr[k-1]=temp2;
        arr[count-k]=temp1;
        
        ListNode newHead=new ListNode(arr[0]);
        ListNode current=newHead;
        
        for(int j=1;j<arr.length;j++) {
            current.next=new ListNode(arr[j]);
            current=current.next;
        }
        
        return newHead;

    }
}