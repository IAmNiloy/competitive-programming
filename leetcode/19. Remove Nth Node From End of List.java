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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode listNode = head;
        List<ListNode> list = new ArrayList<>();
        while(listNode.next != null){
            list.add(listNode);
            listNode = listNode.next;
        }
        list.add(listNode);
        
        if(list.size() == 1)
            return null;
        if(list.size() == n)
            return head.next;
        list.get(list.size()-n-1).next = list.get(list.size()-n).next;
        return head;
        
    }
}