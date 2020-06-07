//Question: You are given coins of different denominations and a total amount of money. Write a function to compute the number of combinations that make up that amount. 
//You may assume that you have infinite number of each kind of coin.
//================================Code============================
class Solution {
    public int change(int amount, int[] coins) {
        
        int m = coins.length;
        int r = (int)count(coins,m,amount);
        return r;
    }
    
    long count(int s[],int m,int n)
    {
        
        long[] table = new long[n+1];
        Arrays.fill(table,0);
        
        table[0]=1;
        
        for(int i=0;i<m;i++)
            for(int j=s[i];j<=n;j++)
                table[j]+=table[j-s[i]];
        
        return table[n];
        
    }
}
