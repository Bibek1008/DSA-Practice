package Sorting_Algo;

public class lexicographical_ordxer {

    static void order(String s[]){
        int n=s.length;

        for(int i=0;i<n-1;i++){
            int min_index=i;

            for(int j=i+1;j<n;j++){

                //if <0 that is negative that i s[j] is small >0 positive s[minindex is high
                if(s[j].compareTo(s[min_index])<0){
                    min_index=j;
                }
            }
            //swap
            String temp=s[i];
            s[i]=s[min_index];
            s[min_index]=temp;
        }




    }



    public static void main(String[] args) {

        String fruits[]={"kiwi","apple","papaya","mango"};
        order(fruits);
        for (String i:fruits){
            System.out.println(i);
        }


    }
}
