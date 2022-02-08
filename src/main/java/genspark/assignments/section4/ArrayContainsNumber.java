package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayContainsNumber implements Assignment {
    public boolean solution(int[] nums, int num) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return Arrays.asList(nums).contains(num);
    }
}
