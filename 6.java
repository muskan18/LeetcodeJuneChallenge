//Question : Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k),
//where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. 
//Write an algorithm to reconstruct the queue.
//=========================Code=======================

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) return b[0] - a[0];
                else return a[1] - b[1];
            }
        });
        ArrayList<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            tmp.add(people[i][1], people[i]);
        }
        int[][] res = new int[people.length][2];
        for (int i = 0; i < tmp.size(); i++) {
            res[i][0] = tmp.get(i)[0];
            res[i][1] = tmp.get(i)[1];
        }
        return res;
    }
}
