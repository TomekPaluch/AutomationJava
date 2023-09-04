package Section5;

public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver, score,levelCompleted,bonus);
        System.out.println("HighScore is " + highScore);
        score = 10000;
        levelCompleted = 9;
        bonus = 200;

        System.out.println(calculateScore(gameOver, score, levelCompleted, bonus));


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted *bonus) ;
            finalScore +=1000;
        }
        return finalScore;
    }
}

