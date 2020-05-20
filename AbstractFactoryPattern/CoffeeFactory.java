/**
 * CoffeeFactory extends AbstractFactory 
 * It generates a type of coffee based on given input. 
 * It then brews that coffee
 */


public class CoffeeFactory extends AbstractFactory {

    /**
       * @param coffeeType
     * @return an instance of Coffee representing the type, null otherwise
     */
    @Override	
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
    
    @Override	
    public Car getCar(String carType) {
        return null;
    }
}
