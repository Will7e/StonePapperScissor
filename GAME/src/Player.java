/**
 * This is the Player class where I create for initialize the player's choice.
 * @author William
 */
public class Player {
    /**
     * This method retrieves player's input as choice.
     * Each case(input) return to the static field variable which create in GameLogic class.
     * @return the choice of player.
     */
    public int playerChoice() {
        switch (GameLogic.choice) {
            case 1:
                return GameLogic.STONE;
            case 2:
                return GameLogic.SCISSOR;
            case 3:
                return GameLogic.PAPPER;
        }
        return playerChoice();
    }
}




