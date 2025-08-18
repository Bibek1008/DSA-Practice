package Greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Leet435 {



    static private class interval{

        int start_time;
        int end_time;
        interval(int start_time,int end_time){
            this.start_time=start_time;
            this.end_time=end_time;
        }

        public String toString(){
            return start_time+" "+end_time;
        }


    }
    private static  class IntervalComprator implements Comparator<interval>{


        public   int compare(interval i1,interval i2){
            if(i1.start_time>i2.start_time){
                return 1;
            }
            else if (i1.start_time<i2.start_time) {
                return -1;
            }
            else return 0;
        }

    }
    public static void main(String[] args) {


        List<interval> intervalList=new ArrayList<>();
        intervalList.add(new interval(1,2));
        intervalList.add(new interval(2,3));
        intervalList.add(new interval(3,4));
        intervalList.add(new interval(1,3));

        intervalList.sort(new IntervalComprator());


        int result=0;
        int previousEndTime=intervalList.get(0).end_time;
        for(int i=1;i<intervalList.size();i++){

            interval current=intervalList.get(i);



            if(current.start_time<previousEndTime){

                previousEndTime=Math.min(current.end_time,previousEndTime);
                result++;

            }
            else{
                previousEndTime= current.end_time;
            }

        }
        System.out.println(result);


    }
}
