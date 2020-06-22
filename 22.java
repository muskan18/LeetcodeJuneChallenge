//Question: Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.

//============================Code===================

class Solution {
    public int singleNumber(int[] nums) {
        
        int n = nums.length;
        int ones = 0, twos = 0; 
        int common_bit_mask; 
          
        for(int i=0; i<n; i++ ) 
        { 
            
            twos = twos | (ones & nums[i]); 
  
            ones = ones ^ nums[i]; 
  
            common_bit_mask = ~(ones & twos); 
                          
            ones &= common_bit_mask; 
            
            twos &= common_bit_mask; 
        } 
        return ones; 
    }
}
