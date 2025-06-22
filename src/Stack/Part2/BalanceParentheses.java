package Stack.Part2;

import java.util.Scanner;
import java.util.Stack;

public class BalanceParentheses {

    static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();

        // Optional: Check for odd length (if input is only brackets)
        if(n % 2 != 0){
            return false;
        }

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);

            // If it's an opening bracket, push it onto the stack
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            }
            // If it's a closing bracket, check for the corresponding opening bracket
            else if (c == ')') {
                if (st.isEmpty() || st.peek() != '(') {
                    return false;
                }
                st.pop();
            }
            else if (c == ']') {
                if (st.isEmpty() || st.peek() != '[') {
                    return false;
                }
                st.pop();
            }
            else if (c == '}') {
                if (st.isEmpty() || st.peek() != '{') {
                    return false;
                }
                st.pop();
            }
            // If the input might contain other characters, you can choose to ignore or handle them.
        }

        // If the stack is empty, then all brackets were properly closed
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
