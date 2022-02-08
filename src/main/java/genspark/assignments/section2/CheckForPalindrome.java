package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CheckForPalindrome implements Assignment {
    public boolean solution(String pally) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        boolean result = pally.equalsIgnoreCase(new StringBuilder(pally).reverse().toString());
        return result;
    }
}
