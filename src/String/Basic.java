package String;

import java.util.Scanner;

public class Basic {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder s1=new StringBuilder("Hello");
        System.out.println(s1);

        s1.setCharAt(0,'d');
        System.out.println(s1);
        s1.append("xyz");
        System.out.println(s1);

        //inserting anythings in stringBuilder
        s1.deleteCharAt(2);
        System.out.println(s1);
        s1.insert(2,"by");
        System.out.println(s1);

        s1.reverse();
        System.out.println(s1);
        StringBuilder s2=new StringBuilder(sc.nextLine());
        System.out.println(s2
        );




    }

    
}
