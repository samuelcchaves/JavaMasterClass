public class Main {
    public static void main(String[] args) {
        System.out.println("Method Challenge");
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Samuel", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("João", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Vitor", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Miguel", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Ivo", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int scorePosition){
        System.out.println("The player " + playerName + " managed to get into position " + scorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if(playerScore >= 1000) {
            position = 1;
        }else if (playerScore >= 500){
            position = 2;
        }else if (playerScore >= 100){
            position = 3;
        }
        return position;

    }


}