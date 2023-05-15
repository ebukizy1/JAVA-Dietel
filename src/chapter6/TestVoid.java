package chapter6;

public class TestVoid {


    public void testVoidMethodWithStudentGrade() {
    }

    public String checkStudentGrade(double score) {
        //todo:
        /*
        test grade , check if score is greater than 90 printA
        score is greater than  80 print b
        score is greater than 70 print c
        score is greater than 60 print d
        score is greater than 50 print f else
         */

        if(score >=90)return "A";
        if(score >=80)return "B";
        if(score >=70)return "C";
        if(score >=60)return "D";
        else return "F";



    }
}
