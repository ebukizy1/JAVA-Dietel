package setQuestion;

import java.util.Scanner;

public class SetQuestion {

        public static void main(String[] args) {

                                setQuestions();

        }
                public static void setQuestions () {
                        String q1 = """           
                                Which is correct syntax to access an element of an ArrayList in Java?
                                a) list.get(index)
                                b) list[index]
                                c) list.getElement(index)
                                d) list.index""";

                        String q2 = """
                                How do you get the number of elements in an ArrayList called "list" in Java?
                                a) list.size();
                                b) list.count();
                                c) list.length();
                                d) list.getSize();              
                                """;

                        String q3 = """
                                What does it mean for a list to be "dynamic"?
                                a) You can easily add and remove elements
                                b) It has a set size once it has been created
                                c) It may contain multiple types of values
                                d) You can access it from anywhere in the program           
                                """;

                        String q4 = """
                                Which of these standard collection classes implements a dynamic array?
                                a) AbstractList
                                b) LinkedList
                                c) ArrayList
                                d) AbstractSet    
                                    """;

                        String q5 = """
                                 Which of these class can generate an array which can increase and decrease in size automatically?
                                a) ArrayList()
                                b) DynamicList()
                                c) LinkedList()
                                d) MallocList()                      
                                """;
                        String q6 = """
                                Which of these method can be used to increase the capacity of ArrayList object manually?
                                a) Capacity()
                                b) increaseCapacity()
                                c) increasecapacity()
                                d) ensureCapacity()       
                                """;

                        String q7 = """
                                  4. Which of these method of ArrayList class is used to obtain present size of an object?
                                  a) size()
                                  b) length()
                                  c) index()
                                  d) capacity()                              
                                """;
                        String q8 = """
                                5. Which of these methods can be used to obtain a static array from an ArrayList object?
                                a) Array()
                                b) covertArray()
                                c) toArray()
                                d) covertoArray() 
                                """;

                        String q9 = """
                                6. Which of these method is used to reduce the capacity of an ArrayList object?
                                a) trim()
                                b) trimSize()
                                c) trimTosize()
                                d) trimToSize()
                                """;

                        Questions[] questions = {new Questions(q1, "a"),
                                new Questions(q2, "a"),
                                new Questions(q3, "a"),
                                new Questions(q4, "c"),
                                new Questions(q5, "a"),
                                new Questions(q6, "d"),
                                new Questions(q7, "a"),
                                new Questions(q8, "c"),
                                new Questions(q9, "d"),
                        };

                        takeTest(questions);
                }





public static void takeTest(Questions [] questions){
        int score = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a yor name: ");
        String name = input.nextLine();
        for(int index = 0; index < questions.length; index++){
                System.out.println(questions[index].prompt);
                String answer = input.nextLine().toLowerCase();
                if(answer.equals(questions[index].answer)){
                        score++;
                }
        }
        System.out.println(name + " you got " + score + " / " + questions.length);


}
}
