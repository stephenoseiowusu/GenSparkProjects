package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CheckForEven implements Assignment {
    public String solution(int number) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        number = Math.abs(number);
        String evenOdd = number % 2 == 0 ? "even" : "odd";
        return evenOdd;
    }
}
