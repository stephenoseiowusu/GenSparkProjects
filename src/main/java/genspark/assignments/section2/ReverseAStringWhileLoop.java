package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAStringWhileLoop implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String result = "";
        int length = str.length();
        while(new StringBuilder(result).reverse().compareTo(new StringBuilder(str)) != 0){
            result += str.charAt(length);
            length -= 1;
        }
        return null;
    }
}
