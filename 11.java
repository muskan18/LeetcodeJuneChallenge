//Question: Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, 
//with the colors in the order red, white and blue.Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue
//respectively.
//Note: You are not suppose to use the library's sort function for this problem.
//=====================================Code===========================================

class Solution {
    public void sortColors(int[] nums) {
        
        int j=0;
        int one=0;
        int zero = 0;
        int two=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {zero++;
            continue;
             }
            else if(nums[i] ==1)
            {
                one++;
                continue;
            }
            else 
            {
                two++;
                continue;
            }
    }
        
 //       System.out.print(one+"" +zero +""+two);

   
        while(zero>0)
        {
            nums[j++]=0;
            zero--;
           // continue;
        }
        
        while(one>0)
        {
            nums[j++]=1;
            one--;
           // continue;
        }
        
        while(two>0)
        {
            nums[j++]=2;
            two--;
          //  continue;
        }
        
    }
    
}
