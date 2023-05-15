package DanielyangAssessment;

public class Weather{
    public static void main(String[] args) {
        System.out.println(checkWeatherCondition("snowy"));
    }

    public static String checkWeatherCondition(String weatherCondition){
        switch (weatherCondition){
            case "sunnyDay" : return "wear sunglasses";
            case "windy": return " take your jacket";
            case " rainy": return "Take umbrella";
            case "snowy": return " Stay at home";
            default: return " Check your condition";

        }


    }









}









