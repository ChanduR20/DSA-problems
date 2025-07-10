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
        ListNode temp=head;
        ArrayList<Integer> ans= new ArrayList<>();
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(ans);
        temp=head;
        int i=0;
        while(temp!=null){
            temp.val=ans.get(i);
            i++;
            temp=temp.next;
        }
        return head;
    }
}