//Question: Given a sorted array and a target value, return the index if the target is found. If not, 
//return the index where it would be if it were inserted in order.

//=====================================Code=================================

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        if(nums.length < 1) {
            return 0;
        }
        
        int low = 0;
        int high = nums.length-1;
        int mid;
        int pos=0;
        while(low <= high) {
            mid = low + (high-low)/2;
            
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                high = mid - 1;
                pos = mid;
            } else {
                low = mid + 1;
                pos = mid + 1;
            }
        }
        
        return pos;
    }
}
