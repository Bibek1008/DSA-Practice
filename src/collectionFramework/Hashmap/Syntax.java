package collectionFramework.Hashmap;
import java.util.*;
public class Syntax {
    public static void main(String[] args) {



        Map<String,Integer> mp=new HashMap<>();

        mp.put("Bibek",21);
        mp.put("Adi",23);
        mp.put("James",24);
        mp.put("Anish",25);
        mp.put("Ram",26);

       int x= mp.get("Bibek");
       System.out.println(x);
       mp.remove("Adi");
       mp.putIfAbsent("Adi",23);
       System.out.println(mp);



       for(String key:mp.keySet()){

           System.out.printf("\nThe age of person %s is %d\n ",key,mp.get(key));
           System.out.println("\nThe age of person " + key + " is " + mp.get(key));

       }

       System.out.println("This is another loop");
        for(var e:mp.entrySet()){

            System.out.printf("\nThe age of person %s is %d\n ",e.getKey(),e.getValue());
            System.out.println("\nThe age of person " + e.getKey()+ " is " + e.getValue());

        }
    }
}
