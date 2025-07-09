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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer>ans=new ArrayList<>();
        ListNode temp=list1;
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
        }
        ListNode temp1=list2;
        while(temp1!=null){
            ans.add(temp1.val);
            temp1=temp1.next;
        }
        Collections.sort(ans);
        ListNode dummy=new ListNode(-1);
        ListNode result=dummy;
        for(int i=0;i<ans.size();i++){
            result.next=new ListNode(ans.get(i));
            result=result.next;
        }
        return dummy.next;
    }
}