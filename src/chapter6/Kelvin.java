package chapter6;

public class Kelvin {
    public static void main(String[] args) {


        calculateScore("emmanuel", 345);
        calculateScore(34);
    }

    public static  int calculateScore(String playerName, int score){
        System.out.println("player " + playerName + " scored " +score + " point");
        return score * 1000;
    }

    public static  int calculateScore(int score){
        System.out.println(" Unnamed player scored " +score + " point");
        return score * 1000;
    }
}
