import java.util.Random;

/**
 * This is the Computer class where I create for randomize the choice of Computer
 * I create the instance of Random class to call its method.
 * @author William
 */

public class Computer {
    Random random;
    public Computer(){
        this.random = new Random(); // Initialize random.
    }
    /**
     *This method retrieves computer's choice after its randomization
     *If not STONE or SCISSOR then
     * @return computer's choice as PAPPER
     */
    public int computerChoice(){
        int randomNumber = random.nextInt(3)+1; // Randomize a number between 1 - 3.
        switch (randomNumber){
            case 1: return GameLogic.STONE;
            case 2: return GameLogic.SCISSOR;
        }
        return GameLogic.PAPPER;
    }
}

