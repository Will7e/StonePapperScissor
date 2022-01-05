/**
 * This is the main class where I create for running the game.
 * I create the instance of GameLogic to call out the start metod of the game.
 * @author William
 */
public class GameRun {
    public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic();
        System.out.println(" [- Welcome to Stone Papper Scissor Game -] "); // Welcome message.
        gameLogic.gameStart();

    }

}
