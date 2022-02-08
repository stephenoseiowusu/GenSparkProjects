package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CheckingAGrade implements Assignment {
    public String solution(int grade) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String lettergrade = "N/A";
        if(grade >= 90){lettergrade = "A";}else if(grade >= 80){lettergrade = "B";}
        else if(grade >= 70){lettergrade = "C";}
        else if(grade >= 60){lettergrade = "D";}
        else {lettergrade = "F";}
        return lettergrade;
    }
}
