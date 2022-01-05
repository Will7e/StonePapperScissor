import java.util.ArrayList;
import java.util.Scanner;
/**
 * This is the GameLogic class where I create for the game play.
 * Where it's the game : display, choices, logic, history list, exit.
 * @author William
 */
public class GameLogic {
    Scanner console = new Scanner(System.in);
    public final static int STONE = 1;// Initialize game's choice to an int value as final
    public final static int SCISSOR = 2;
    public final static int PAPPER = 3;
    private ArrayList<String> historyList;// Stores the game stats in this list.
    private Player player; // Import player class
    private Computer computer;// Import computer class
    public static int choice; // Store the player's input.

    /**
     * Initialize player, computer to call for their methods
     * Initialize empty list to store game's stats
     */
    public GameLogic() {
        this.player = new Player();
        this.computer = new Computer();
        this.historyList = new ArrayList<>();
    }
    /**
     * Main menu display
     */
    private void printMenu() {
        System.out.println(" 1.New game    2.History    3.Quit game ");
    }
    /**
     * It displays menu choice. Have player choice between 1 - 3. Else print out error message.
     * this method loop until player choice to exit the game.
     */
    public void gameStart() {
        do {
            printMenu();
            int input = console.nextInt();
            switch (input) {
                case 1:
                    playerMenuChoice();
                    gameStart();
                case 2:
                    printHistorik();
                    gameStart();
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect input. Try again.");
            }
        } while (true);
    }
    /**
     * (Game logic) Check comparison of choices between player and computer
     * Check if player and computer choices are same then it's a Tie.
     * Stone > Scissor, Scissor > Papper and Papper > Stone =  Win. Else Lose.
     * Display the result of Win, Lose or Tie. Add the result to history list.
     */
    private void gamePlay() {
        String win = "Win";
        if (player.playerChoice() == computer.computerChoice()) {
            String tie = "Tie";
            System.out.println("Result: Match is a : " + tie+"!");
            historyList.add(tie);
        } else if (player.playerChoice() == STONE && computer.computerChoice() == SCISSOR) {
            System.out.print("Result: Congrats! You " + win+" :)");
            historyList.add(win);
        } else if (player.playerChoice() == SCISSOR && computer.computerChoice() == PAPPER) {
            System.out.print("Result: Congrats! You " + win+" :)");
            historyList.add(win);
        } else if (player.playerChoice() == PAPPER && computer.computerChoice() == STONE) {
            System.out.print("Result: Congrats! You " + win+" :)");
            historyList.add(win);
        } else {
            String lose = "Lose";
            System.out.print("Result: You " + lose + ":(");
            historyList.add(lose);
        }
        System.out.println();
    }
    /**
     * Check if the list is not empty, loop through the list and print out all the result
     * Else print out empty message
     */
    private void printHistorik() {
        System.out.println("Game history : ");
        if (!historyList.isEmpty()) {
            for (String str : historyList) {
                System.out.println(str);
            }
        } else {
            System.out.println("No history saved.");
        }
    }
    /**
     * It prints out menu choice for player
     * If choice less than 1 or bigger than 3 then run menu choice again (recursion), else run gamePlay.
     * Ask if player neither want to return main menu, play again or quit.
     */
    private void playerMenuChoice() {
        System.out.println(" What is your choice? ");
        System.out.println("1.Stone    2.Scissor    3.Papper");
        choice = console.nextInt();
        if (choice < 1 || choice > 3) {
            playerMenuChoice();
        } else {
            gamePlay();
        }
        System.out.println("1. Menu    2.Play again    3.Quit game");
        int input2 = console.nextInt();
        switch (input2) {
            case 1:
                gameStart();
                break;
            case 2:
                playerMenuChoice();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Incorrect input. Try again.");
                break;
        }
        System.out.println();
    }
}


