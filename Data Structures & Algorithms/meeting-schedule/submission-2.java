/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution {
    public boolean canAttendMeetings(List<Interval> intervalList) {
        Collections.sort(intervalList, Comparator.comparingInt(i -> i.start));
        intervalList.stream().forEach(System.out::println);
        boolean canAttendAllMeeting1  = true;
        for(int i =0 ; i< intervalList.size()-1 ;i++){
            if(intervalList.get(i).end > intervalList.get(i+1).start){
                canAttendAllMeeting1 = false;
                break;
            }
        }
        if(canAttendAllMeeting1) System.out.println("list Person can attend all meeting");
        else System.out.println("list person can not able to attend all meetings");
        return canAttendAllMeeting1;
    }
}