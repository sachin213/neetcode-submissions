class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
                return 0;
            }

            // Sort intervals by their end times
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

            int end = intervals[0][1];
            int nonOverlappingCount = 1;

            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i][0] >= end) {
                    // This interval does not overlap with the previous one
                    nonOverlappingCount++;
                    end = intervals[i][1];
                }
            }

            return intervals.length - nonOverlappingCount;
    }
}
