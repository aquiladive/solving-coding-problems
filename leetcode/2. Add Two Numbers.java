//2. Add Two Numbers
//runtime beats only 11.31%, memory usage beats 40.67%
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
        ArrayList<Integer> l1num = new ArrayList<>();
        ArrayList<Integer> l2num = new ArrayList<>();
        ArrayList<Integer> sumOfNums = new ArrayList<>();
        ListNode l1Track = l1, l2Track = l2;
        while(l1Track!=null) {
            l1num.add(l1Track.val);
            l1Track = l1Track.next;
        }
        while(l2Track!=null) {
            l2num.add(l2Track.val);
            l2Track = l2Track.next;
        }
        int trackLarge = l1num.size() > l2num.size() ? l1num.size() : l2num.size();
        ListNode sum = new ListNode();
        ListNode sumTrack = sum;
        for (int i = 0; i < trackLarge; i++) {
            if((i < l1num.size()) && (i < l2num.size())) {
                sumOfNums.add(l1num.get(i)+l2num.get(i));
            }
            else if(i < l1num.size())
                sumOfNums.add(l1num.get(i));
            else if(i < l2num.size())
                sumOfNums.add(l2num.get(i));
        }
        for (int i = 0; i < trackLarge-1; i++) {
            if(sumOfNums.get(i)>9) {
                sumOfNums.set(i, sumOfNums.get(i)-10);
                sumOfNums.set(i+1, sumOfNums.get(i+1)+1);
            }
            sumTrack.val = sumOfNums.get(i);
            sumTrack.next = new ListNode();
            sumTrack = sumTrack.next;
        }
        if(sumOfNums.get(trackLarge-1)>9) {
            sumOfNums.set(trackLarge-1, sumOfNums.get(trackLarge-1)-10);
            sumOfNums.add(1);
        }
        sumTrack.val = sumOfNums.get(trackLarge-1);
        if(sumOfNums.size()>trackLarge) {
            sumTrack.next = new ListNode();
            sumTrack = sumTrack.next;
            sumTrack.val = 1;
        }
        return sum;
    }
}
