/**
 * CoffeeFactory uses Factory Pattern to generate 
 * a type of coffee based on given input. 
 * It then brews that coffee
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeFactory {

    /**
       * @param coffeeType
     * @return an instance of Coffee representing the type, null otherwise
     */	
    public Coffee getCoffee(String coffeeType) {
        if(coffeeType == null) {
            return null;
        }
        if(coffeeType.equalsIgnoreCase("CAPPUCCINO")) {
            return new Cappuccino();
        } else if(coffeeType.equalsIgnoreCase("LATTE")) {
            return new Latte();
        } else if(coffeeType.equalsIgnoreCase("MOCHA")) {
            return new Mocha();
        }
        return null;
    }

    /**
     * @param args
     */
    public static void main(String [] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        
        System.out.println("Enter the type of coffee to brew\n"+
            "Options:\n"+"Cappuccino\n"+"Latte\n"+"Mocha\n");
        System.out.print("?>");
        try {
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
            String coffeeType = br.readLine();
            Coffee coffee = coffeeFactory.getCoffee(coffeeType);
            if(coffee == null) {
                System.out.println("Invalid coffee choice");
            } else {
                coffee.brew();
            }
        } catch(IOException e) {
            System.err.println("IO error trying to read coffee type!");
            System.exit(1);
        }
    }
}
