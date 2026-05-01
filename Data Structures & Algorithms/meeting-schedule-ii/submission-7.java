/**
 * Definition of Interval: 
  public class Interval {
      public int start, end;
      public Interval(int start, int end) {
          this.start = start;
          this.end = end;
      }
  }
 **/

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        List<Integer> startList = intervals.stream().map(interval -> interval.start).sorted().toList();
       List<Integer> endList = intervals.stream().map(interval -> interval.end).sorted().toList();
       int numberOfDays = 0;
       int startPointer = 0;
       int endPointer = 0;
       int result = 0;
       while(startPointer < intervals.size())
       {
          if(startList.get(startPointer) < endList.get(endPointer)){
              startPointer++;
              numberOfDays++;
          } else{
              endPointer++;
              numberOfDays--;
          }
          result = Math.max(result,numberOfDays);
       }
        return result;

    }
}
