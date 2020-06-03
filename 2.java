// Question : Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
//Code ==========================

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
       ListNode tmp = null; 
        if(node == null)
        {
            
            return;
            
        }
        else{
            
        while(node.next!=null)
        {
            
            node.val = node.next.val;
            tmp = node;
            node = node.next;
        }
            
            tmp.next = null;
    }
    }
}
