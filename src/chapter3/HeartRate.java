package chapter3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class HeartRate {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public HeartRate(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        String yearOfBirth = "";
        for (int index = dateOfBirth.length() - 4; index < dateOfBirth.length(); index++) {
            //     char numericCharacter = dateOfBirth.charAt(index);
            yearOfBirth = getYear(yearOfBirth, index);
            //      yearOfBirth = yearOfBirth+ numericCharacter;
        }
        int userYearOfBirth = Integer.parseInt(yearOfBirth);
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - userYearOfBirth;
    }

    private String getYear(String yearOFBirth, int index) {
        yearOFBirth += dateOfBirth.charAt(index);
        return yearOFBirth;
    }

    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    public String getTargetHeartRate() {
        String targetHeartRate = "";
        double targetHeartRateLowerBound = ((double) 50 / 100) * getMaximumHeartRate();
        double targetHeartRateUpperBound = ((double) 85 / 100) * getMaximumHeartRate();
        return targetHeartRate + targetHeartRateLowerBound + "-" + targetHeartRateUpperBound;
    }
}
