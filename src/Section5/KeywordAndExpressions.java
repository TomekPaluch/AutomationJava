package Section5;

public class KeywordAndExpressions {

    public static void main (String[] args) {
        double kilometers = (100 * 1.60);

        int highscore = 50;

        if (highscore > 25){
            highscore = 1000 + highscore;
            System.out.println(highscore);

        }
        int health = 100;
        if ((health <25) && (highscore > 1000)){
            highscore = highscore -1000 ;
        }
    }
}
