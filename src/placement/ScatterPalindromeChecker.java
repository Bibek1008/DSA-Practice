package placement;

import java.util.HashMap;
import java.util.Scanner;

public class ScatterPalindromeChecker {

    public static boolean isScatterPalindrome(String str) {

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }


        int oddCount = 0;
        for (int count : freqMap.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }


        return oddCount <= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check for scatter palindrome: ");
        String s = sc.nextLine().toLowerCase();

        if (isScatterPalindrome(s)) {
            System.out.println("Yes, it's a scatter palindrome.");
        } else {
            System.out.println("No, it's not a scatter palindrome.");
        }


    }
}
