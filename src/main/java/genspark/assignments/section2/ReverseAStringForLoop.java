package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAStringForLoop implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String result =  "";
        for(int x = str.length() -1; x > -1; x--){ result += str.charAt(x); }
        return result;
    }
}
