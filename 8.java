//Question: Given an integer, write a function to determine if it is a power of two.
//=======================code=======================
class Solution {
    public boolean isPowerOfTwo(int n) {

        if (n == 0) 
            return false; 
          
        while (n != 1) 
        { 
            if (n % 2 != 0) 
                return false; 
            n = n / 2; 
        } 
        return true; 
    }
}
