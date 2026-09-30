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
        int cunt=0;
        while(temp!=null){
            temp=temp.next;
            cunt++;
        }
        temp=head;
        int[] arr=new int[cunt];
        for(int i=0;i<cunt;i++){
            arr[i]=temp.val;
            temp=temp.next;
        }

        int left=0;
        int right=arr.length-1;
        int max=0;
        while(left<right){
            max=Math.max(max,arr[left]+arr[right]);
            left++;
            right--;
        }
        return max;
    }
}