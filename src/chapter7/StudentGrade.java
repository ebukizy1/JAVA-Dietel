package chapter7;

public class StudentGrade {


    public int[] arraysNumbers() {
        int[] arrayNumber = {21, 34, 56, 78, 76, 80, 90, 60, 12, 40, 28, 77, 88};
        return arrayNumber;
    }

    public String setStudentGrade(int number) {
        int count;
        int grade = 0;
        int[] newValue = arraysNumbers();
        for (count = 0; count < newValue.length; count++) {
            if (newValue[count] == number) {
                if (number >= 90 && number <= 100){
                    return "A";
                } else if ( number>= 80 && number <= 89){
                    return "B";
                } else if (number >= 70 && number <= 79) {
                    return "C";
                } else if (number >= 60 && number <= 79) {
                    return "D";
                }  else if (number >= 50 && number <= 59) {
                    return "E";
                }else return "you failed the course";
            }
        }
        return "you failed badly";
    }

}

