//83. Remove Duplicates from Sorted List
//runtime beats only 0.81%, memory beats only 5.76%

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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        List<Integer> intList = new ArrayList<>();
        ListNode dupClear = new ListNode();
        ListNode dupClearHead = dupClear;
        while(head != null) {
            if(intList.contains(head.val)) {
                head = head.next;
                continue;
            }
            intList.add(head.val);
            head = head.next;
        }
        for(int i = 0; i < intList.size()-1; i++) {
            dupClear.val = intList.get(i);
            dupClear.next = new ListNode();
            dupClear = dupClear.next;
        }
        dupClear.val = intList.get(intList.size()-1);
        return dupClearHead;
    }
}
