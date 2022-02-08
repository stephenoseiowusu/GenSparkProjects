package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.Arrays;

public class SumTheArray implements Assignment {
    public int solution(int[] numbers) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return Arrays.stream(numbers).sum();
    }
}
