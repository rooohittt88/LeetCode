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
    public int getDecimalValue(ListNode head) {
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
        int ans=0;
        int k=0;
        for(int j=count-1;j>=0;j--){
            int m=(int)Math.pow(2,k);
            ans+=arr[j]*m;
            k++;

        }
        return ans;
    }
}