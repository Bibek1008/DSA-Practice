package Greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Activities {


    public static class Act{
        int start_time;
        int end_time;
        int activity_num;
        public String toString(){
            return start_time +" "+ end_time;
        }
    }
    private static class ActivityComparator implements Comparator<Act> {

        public int compare(Act a1, Act a2){

            if(a1.end_time>a2.end_time){
                return 1;
            } else if (a1.end_time<a2.end_time) {
                return -1;

            }
            else return 0;
        }
    }


    public static void main(String[] args) {
        List<Integer> start=List.of(1,3,2,5);
        List<Integer>finish=List.of(2,4,3,6);

        List<Act> activity=new ArrayList<>();

        for(int i=0;i<start.size();i++){
            Act temp=new Act();
            temp.start_time=start.get(i);
            temp.end_time=finish.get(i);
            temp.activity_num=i+1;
            activity.add(temp);
        }
        activity.sort(new ActivityComparator());
        System.out.println(activity);

        List<Integer> result=new ArrayList<>();

        result.add(activity.get(0).activity_num);

        Act prev=activity.get(0);

        for(int i=1;i<activity.size();i++){
            Act curr=activity.get(i);
            if(curr.start_time>prev.end_time){
                result.add(curr.activity_num);
                prev=curr;
            }

        }
        System.out.println(result);

    }
}
