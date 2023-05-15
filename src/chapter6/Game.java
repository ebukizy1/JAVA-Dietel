package chapter6;

public class Game {
    public static void main(String[] args) {
calculateScore(true, 800, 5, 100);
    calculateScore(true, 800,8, 10000);

   int playerPosition = calculateHighScorePosition(1000);
        displayHighScore("emmanuel", playerPosition);
        playerPosition = calculateHighScorePosition(500);
        displayHighScore("micheal", playerPosition);
        playerPosition = calculateHighScorePosition(100);
        displayHighScore("esther", playerPosition);
        playerPosition = calculateHighScorePosition(50);
        displayHighScore("david", playerPosition);






    }





        public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
            int finalScore;
            if (gameOver) {
                finalScore = score + (levelCompleted * bonus);
                finalScore += 1000;
                System.out.println("your final score was " + finalScore);
                return finalScore;
                }
            return -1;
            }

    public static void displayHighScore(String playerName, int playerPosition){
        System.out.println(playerName + " Manage to get in position "
                + playerPosition  + " On the high score table");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >=1000){
            return 1;}
            else if(playerScore >=500){
                return 2;}
                else if(playerScore >= 100 ){
                    return 3;}
                 return 4;
    }
}
