/**
 * CarFactory extends AbstractFactory 
 * It generates a type of car based on given input. 
 * It then constructs that car
 */


public class CarFactory extends AbstractFactory{

    /**
       * @param carType
     * @return an instance of Car representing the type, null otherwise
     */
    @Override	
    public Car getCar(String carType) {
        if(carType == null) {
            return null;
        }
        if(carType.equalsIgnoreCase("HONDA")) {
            return new Honda();
        } else if(carType.equalsIgnoreCase("TOYOTA")) {
            return new Toyota();
        } else if(carType.equalsIgnoreCase("AUDI")) {
            return new Audi();
        }
        return null;
    }

    @Override
    public Coffee getCoffee(String coffeeType) {
        return null;
    }
}
