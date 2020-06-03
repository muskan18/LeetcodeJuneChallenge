//Question: There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0], 
 // and the cost of flying the i-th person to city B is costs[i][1].Return the minimum cost to fly every person to a city such 
 //that exactly N people arrive in each city.
 
 //===================Code===============================
 
 class Solution {
    public int twoCitySchedCost(int[][] costs) {
        
         Comparator<int[]> comparator = (a, b) -> Math.abs(b[0] - b[1]) - Math.abs(a[0] - a[1]);
        Arrays.sort(costs, comparator);
        int N = costs.length / 2,
                c1 = 0,// counter for the station A
                c2 = 0,// counter for the station B
                ans = 0,
                i = 0;
        while (i < 2 * N) {
            if ((costs[i][0] <= costs[i][1] && c1 < N) || c2 == N) {
                ans += costs[i++][0];
                c1++;
            } else {
                ans += costs[i++][1];
                c2++;
            }
        }
        return ans;
        
    }
}
