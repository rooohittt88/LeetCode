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
import java.util.*;
import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;

        StringBuilder sb=new StringBuilder();

        while(temp1!=null){
            sb.append(temp1.val);
            temp1=temp1.next;
        }
        sb.reverse();
        BigInteger ans1=BigInteger.ZERO;
        if(sb.length()>0) ans1=new BigInteger(sb.toString());
        



        ListNode temp2=l2;

        StringBuilder sbb=new StringBuilder();

        while(temp2!=null){
            sbb.append(temp2.val);
            temp2=temp2.next;
        }
        sbb.reverse(); 
        BigInteger ans2=BigInteger.ZERO;
        if(sbb.length()>0) ans2 = new BigInteger(sbb.toString());

        BigInteger fin=ans1.add(ans2);
        if (fin.equals(BigInteger.ZERO)) return new ListNode(0);
        ListNode head=null;
        ListNode tail=null;


        while (fin.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] dr = fin.divideAndRemainder(BigInteger.TEN);
            int digit = dr[1].intValue();
            
            ListNode newNode = new ListNode(digit);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            fin = dr[0];
        }
        return head;
    }
}