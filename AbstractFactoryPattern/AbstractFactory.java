/**
 * Abstract Factory class
 */

public abstract class AbstractFactory {
    abstract Car getCar(String carType);
    abstract Coffee getCoffee(String coffeeType);
}
