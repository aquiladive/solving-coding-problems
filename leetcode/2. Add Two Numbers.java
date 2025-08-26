//2. Add Two Numbers
//works for 1564/1569 test cases, the issue is that test case 1565 introduces a linked list with a number too long to be stored in a long.
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
        int l1num = 0, l2num = 0;
        String l1text = "", l2text = "";
        ListNode l1Track = l1, l2Track = l2;
        while(l1Track!=null) {
            l1text += l1Track.val;
            l1Track = l1Track.next;
        }
        while(l2Track!=null) {
            l2text += l2Track.val;
            l2Track = l2Track.next;
        }
        StringBuilder res1 = new StringBuilder();
        StringBuilder res2 = new StringBuilder();
        String resl1 = res1.append(l1text).reverse().toString();
        String resl2 = res2.append(l2text).reverse().toString();
        long sum = Long.parseLong(resl1) + Long.parseLong(resl2);
        String result = "";
        result += sum;
        ListNode listSum = new ListNode();
        ListNode listSumTrack = listSum;
        for (int i = result.length()-1; i >= 0; i--) {
            listSumTrack.val = result.charAt(i) - '0';
            if(i!=0) {
                listSumTrack.next = new ListNode();
                listSumTrack = listSumTrack.next;
            }
        }
        return listSum;
    }
}
