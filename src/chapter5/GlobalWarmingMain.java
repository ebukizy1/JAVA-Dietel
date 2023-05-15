package chapter5;

public class GlobalWarmingMain {
    public static void main(String[] args) {
        GlobalWarmingQuestion question = new GlobalWarmingQuestion();


        question.questionOne();
        question.question2();
        question.question3();
        question.question4();
        question.question5();

        int count = question.getCount();
        switch (count) {
            case 5:
                System.out.println("Excellent!!!");
                break;
            case 4:
                System.out.println("Very good!!!");
                break;
            case 3:
            case 2:
            case 1:
                System.out.println("""
                        \"Time to brush up on your knowledge of global warming,\",
                        -> Intergovernmental Panel on Climate Change. ...
                        ->  United Nations Climate Action. ...
                        -> National Center for Atmospheric Research (National Science Foundation) ...
                        ->  National Centers for Environmental Information (NOAA) ...""");
                break;
            case 0:
                System.out.println("failed all");
                break;
        }


    }
}



