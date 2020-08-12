package code.LeetCode.question447;

import java.util.HashMap;

public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int m = points.length;//行数，即代表点的个数
        int res = 0;
        for (int i = 0; i < m; i++) {
            HashMap<Integer, Integer> distance = new HashMap<>();
            for (int j = 0; j < m; j++) {
                if (j != i) {
                    int dist = ((points[j][0] - points[i][0]) * (points[j][0] - points[i][0]))
                            + ((points[j][1] - points[i][1]) * (points[j][1] - points[i][1]));
                    if (!distance.containsKey(dist)) {
                        distance.put(dist, 1);
                    } else {
                        int value = distance.get(dist);
                        distance.put(dist, value + 1);
                    }
                }
            }
            for (Integer value : distance.keySet()) {
                res += distance.get(value) * (distance.get(value) - 1);
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[][] nums = {{0,0},{1,0},{2,0}};
        System.out.println(new Solution().numberOfBoomerangs(nums));
    }
}
