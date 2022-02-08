package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class LesserNumber implements Assignment {
    public int solution(int x, int y) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int lesserNumber = x < y ? x : y;
        return lesserNumber;
    }
}
