/*Question: The set [1,2,3,...,n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence
*/
//==================================Code========================
class Solution {
    public String getPermutation(int n, int k) {
        
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
        numberList.add(i);
        }
        k--;
        int mod = 1;
        for (int i = 1; i <= n; i++) {
        mod = mod * i;
        }
        String result = "";
        for (int i = 0; i < n; i++) {
        mod = mod / (n - i);
        int curIndex = k / mod;
        k = k % mod;
        result += numberList.get(curIndex);
        numberList.remove(curIndex);
        }
        return result.toString();

    }
}
