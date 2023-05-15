package myExamplesTutorial;

public class Students {
    private String name;
    private double average;


    public Students(String name, double average) {
        this.name = name;
        if (average > 0.0) {
            if (average <= 100) {
                this.average = average;
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAverage(double average) {
        if (average > 0.0) {
            if (average <= 100) {
                this.average = average;
            }
        }
    }

    public double getAverage() {
        return average;
    }

    public String getGradeLetter() {
        String gradeLetter = "";
        if (average >= 90) {
            gradeLetter = "A";
        } else if (average >= 80) {
            gradeLetter = "B";
        } else if (average >= 70) {
            gradeLetter = "C";
        } else if (average >= 60) {
            gradeLetter = "D";
        } else {
            gradeLetter = "you failed the course, try next year";
        }
        return gradeLetter;
    }
}





