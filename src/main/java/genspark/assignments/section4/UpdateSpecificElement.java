package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UpdateSpecificElement implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list, int val, int index) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        List<Integer> result = IntStream.range(0,list.size()).map(i -> i == index ? val : list.get(i) ).boxed().collect(Collectors.toList());
        ArrayList<Integer> results = new ArrayList<>(result);
        return results;
    }
}
