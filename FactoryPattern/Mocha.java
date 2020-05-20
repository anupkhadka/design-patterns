/**
 * This class implements a Mocha class. 
 * It implements Coffee interface 
 */

public class Mocha implements Coffee {
    @Override
    public void brew() {
        System.out.println("Brewing mocha!");
    }
}
