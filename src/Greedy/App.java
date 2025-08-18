package Greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

    private static class Item{

        Integer value;
        Integer weight;

        @Override
        public String toString() {
            return value +" "+ weight;
        }
    }
    private static class ItemComparator implements Comparator<Item>{

        public int compare(Item i1,Item i2){
            if((i1.value/i1.weight)<(i2.value/i2.weight)){
                return 1;
            } else if ((i1.value/i1.weight)>(i2.value/i2.weight)) {
                return -1;

            }
            else{
                return 0;
            }
        }
    }

    public static void main(String[] args) {

        List<Integer> value= List.of(60,100,150,120);
        List<Integer>weights=List.of(10,20,50,15);

        int w=30;

        List<Item> items=new ArrayList<>();

        for(int i=0;i<value.size();i++){

            Item item=new Item();
            item.value=value.get(i);
            item.weight=weights.get(i);

            items.add(item);
        }
        items.sort(new ItemComparator());

        System.out.println(items);

        int profit=0;

        while(w>0){
            for(int i=0;i<items.size() && w>0;i++){
                Item item=items.get(i);
                if(item.weight<=w){
                    profit+=item.value;
                    w-=item.weight;
                }
                else{
                    profit += (int)((double)item.value / item.weight * w);
                    w = 0; // full now
                    break;
                }
            }

        }
        System.out.println(profit);



    }
}
