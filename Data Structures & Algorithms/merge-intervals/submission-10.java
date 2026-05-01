class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort intervals by their start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] lastMerged = merged.get(merged.size() - 1);
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            if (currentStart <= lastMerged[1]) {
                // Overlap: Merge by updating the end point
                lastMerged[1] = Math.max(lastMerged[1], currentEnd);
            } else {
                // No overlap: Add the new interval
                merged.add(intervals[i]);
            }
        }
        
        // Convert the list back to a 2D array
        return merged.toArray(new int[merged.size()][]);
    
        }
}