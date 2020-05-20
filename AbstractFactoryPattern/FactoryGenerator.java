/** 
 * Generates different kind of factories
 */

public class FactoryGenerator {

    /**
     * @param string representing factoryType
     * @return AbstractFactory representing the factoryType
      */
    public AbstractFactory getFactory(String factoryType) {
        if(factoryType.equalsIgnoreCase("COFFEE")) {
            return new CoffeeFactory();
        } else if(factoryType.equalsIgnoreCase("CAR")) {
            return new CarFactory();
        }
        return null;
    }

    /**
     * @param args
     */
    public static void main(String [] args) {
        FactoryGenerator factoryGenerator = new FactoryGenerator();

        Coffee cappuccino = 
            factoryGenerator.getFactory("COFFEE").getCoffee("CAPPUCCINO");
        if(cappuccino != null) {
            cappuccino.brew();
        }

        Car toyota = 
            factoryGenerator.getFactory("CAR").getCar("TOYOTA");
        if(toyota != null) {
            toyota.construct();
        }
    }
}
