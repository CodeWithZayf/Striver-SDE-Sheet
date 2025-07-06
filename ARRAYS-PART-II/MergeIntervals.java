import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        int rows = intervals.length;

        if (rows <= 1) return intervals;

        // Properly sort using Arrays.sort with comparator
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Use ArrayList<int[]> instead of ArrayList<ArrayList<int>>
        List<int[]> arrlist = new ArrayList<>();

        // Start with the first interval
        int[] current = intervals[0];

        for (int i = 1; i < rows; i++) {
            // If they overlap → merge
            if (current[1] >= intervals[i][0]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                arrlist.add(current);
                current = intervals[i];
            }
        }
        // Don’t forget to add the last merged interval
        arrlist.add(current);

        // Convert ArrayList<int[]> to int[][]
        return arrlist.toArray(new int[arrlist.size()][]);
    }
}
