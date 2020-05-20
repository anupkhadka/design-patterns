/**
 * CarBuilder.java
 * This car uses Builder pattern to generate 
 * different kinds of cars 
 */

public class CarBuilder {

    /**
      * Builds a basic car
       * @return basic car
     */
    public Car buildBasicCar() {
        Car car = new Car();
        car.addPart(new AirConditioner());
        return car;
    }

    /**
     * Builds an awesome car
     * @return basic car
     */	
    public Car buildAwesomeCar() {
        Car car = new Car();
        car.addPart(new AirConditioner());
        car.addPart(new SunRoof());
        car.addPart(new StereoSystem());
        return car;
    }

    /**
     * @param args
     */
    public static void main(String [] args) {
        CarBuilder carBuilder = new CarBuilder();

        Car basicCar = carBuilder.buildBasicCar();
        System.out.println("Basic car features:\n"+basicCar);	

        Car awesomeCar = carBuilder.buildAwesomeCar();
        System.out.println("Awesome car features:\n"+awesomeCar);	
    }
}
