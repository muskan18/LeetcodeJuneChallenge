/* Question: Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number
must exist. Assume that there is only one duplicate number, find the duplicate one.
*/
//====================================================Code==================================

class Solution {
    public int findDuplicate(int[] nums) {
        
        int slow = 0;
    int fast = 0;
 
    do{
        slow = nums[slow];
        fast = nums[nums[fast]];
    } while(slow != fast);
 
    int find = 0;
 
    while(find != slow){
        slow = nums[slow];
        find = nums[find];
    }
    return find;
    }
}
