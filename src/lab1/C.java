package lab1;

import java.util.Scanner;
import java.util.Stack;

public class C {
    public static String processString(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = processString(sc.next());
        String s2 = processString(sc.next());

        if (s1.equals(s2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
