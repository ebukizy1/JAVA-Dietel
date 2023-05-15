package chapter5;

import java.util.Scanner;

public class GlobalWarmingQuestion {
    private Scanner input = new Scanner(System.in);
    private int count;

    public int getCount() {
        return count;
    }

    public int questionOne() {
        String answer = "a";
        String answer1;
        System.out.println("""
                ================================
                ==>>NUMBER_OF_QUESTIONS  5<<==
                ================================
                1-Global warming also refers to as
                      (a) Climate change
                      (a) Ecological change
                      (a) Atmosphere change
                       (a) None of the aboves
                       """);
        answer1 = input.nextLine();
        if (answer1.equalsIgnoreCase(answer)) {
            count++;
        }
        return count;
    }

    public int question2() {
        String answer = "d";
        String answer2;
        System.out.println("""
                2-Which of the following is not a greenhouse gas?
                      (a) Carbon di-oxide
                      (b) Methane
                      (c) Nitrous oxide
                      (d) Carbon monoxides     
                         """);
        answer2 = input.nextLine();
        if (answer2.equalsIgnoreCase(answer)) {
            ++count;
        }
        return count;
    }

    public int question3() {
        String answer = "a";
        String answer3;
        System.out.println("""
                3- UNFCCC stands fors
                      (a) United Nations Framework Convention on Climate Change
                      (b) United Nations Federation Convention on Climate Changes
                      (c) United Nations Framework Council on Climate Change
                      (d) United Nations Federation Council on Climate Change  
                 """);
        answer3 = input.nextLine();
        if (answer3.equalsIgnoreCase(answer)) {
            ++count;
        }
        return count;
    }

    public int question4() {
        String answer = "d";
        String answer4;
        System.out.println("""
                 4-Which of the following types of sources of energy do not produce carbon di-oxide?                  
                        (a) Wind energy              
                        (b) Geothermal energy           
                        (c) Hydroelectric energy             
                        (d) All of the above        
                """);
        answer4 = input.nextLine();
        if (answer4.equalsIgnoreCase(answer)) {
            ++count;
        }
        return count;
    }

    public int question5() {
        String answer = "b";
        String answer5;
        System.out.println("""
                5-The El-Nino Phenomenon occurs in                        
                      (a) Atlantic Ocean                           
                      (b) Pacific Ocean                          
                      (c) Indian Ocean                       
                      (d) Arctic Ocean      
                    """);
        answer5 = input.nextLine();
        if (answer5.equalsIgnoreCase(answer)) {
            ++count;
        }
        return count;
    }


}
