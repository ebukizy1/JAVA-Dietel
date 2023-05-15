package myExamplesTutorial;

public class StudentScores {
    public static void main(String[] args) {
        Students students1 = new Students("emmanuel chukwuma", 94.24);
        Students students2 = new Students("chukwuma david", 68.34);
        System.out.println( students1.getName() + ": the letter grade for mathematics " + students1.getGradeLetter());
        System.out.println(students2.getName() + ": the letter grade for mathemathics "+ students2.getGradeLetter());
    }



}
