package LongestValidParentheses;

public class LongestValidParenthesesWithoutStack {
    public static int longestValid(String s) {
        int open = 0;
        int close = 0;
        int maxLength = 0;

        // Left to Right
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else { 
                close++;
            }
            if (open == close) {
                maxLength = Math.max(maxLength, open * 2);
            }
            if (close > open) {
                open = 0;
                close = 0;
            }
        }

        // Right to Left 
        open = 0;
        close = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
            if (open == close) {
                maxLength = Math.max(maxLength, open * 2);
            }
            if (open > close) {
                open = 0;
                close = 0;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = ")()())";
        System.out.println(longestValid(s));
    }
}