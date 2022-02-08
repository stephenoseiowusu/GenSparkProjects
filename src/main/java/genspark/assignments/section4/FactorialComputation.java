package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.stream.LongStream;


public class FactorialComputation implements Assignment {
    public int solution(int n) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return (int)LongStream.rangeClosed(1, n).reduce((1),(long w, long y) -> w * y);
    }
}
