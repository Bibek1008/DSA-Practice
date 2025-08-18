package Greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Meeting {

    public static class meet{
        int start_time;
        int end_time;
        int meeting_num;
        public String toString(){
            return start_time +" "+ end_time;
        }
    }
    private static class MeetingComparator implements Comparator<meet>{

        public int compare(meet m1,meet m2){

            if(m1.end_time>m2.end_time){
                return 1;
            } else if (m1.end_time<m2.end_time) {
                return -1;

            }
            else return 0;
        }
    }

    public static void main(String[] args) {


        List<Integer> start=List.of(1,3,0,5,8,5);
        List<Integer>finish=List.of(2,4,6,7,9,9);

        List <meet> meetings=new ArrayList<>();

        for(int i=0;i<start.size();i++){
            meet obj=new meet();
            obj.start_time=start.get(i);
            obj.end_time=finish.get(i);
            obj.meeting_num=i+1;
            meetings.add(obj);
        }
        meetings.sort(new MeetingComparator());


        List<Integer> result=new ArrayList<>();
        result.add(meetings.get(0).meeting_num);
        meet prev=meetings.get(0);
        for(int i=1;i<meetings.size();i++){
            meet curr=meetings.get(i);
            if(curr.start_time>prev.end_time){
                result.add(curr.meeting_num);
                prev=curr;
            }
        }

        System.out.println(meetings);
        System.out.println("This is meeting number");

        System.out.println(result);



    }
}
