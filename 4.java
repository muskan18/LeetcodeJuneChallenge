//Question : Write a function that reverses a string. The input string is given as an array of characters char[].
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//You may assume all the characters consist of printable ascii characters.

//================================Code=================================================

class Solution {
    public void reverseString(char[] s) {
        
        String str="";
        
        for(int i=s.length-1;i>=0;i--)
        {
            str = str+s[i];
        }
        
       // System.out.print(str);
        
        for(int i=0;i<s.length;i++)
        {
            s[i] = str.charAt(i);
        }
    }
}
