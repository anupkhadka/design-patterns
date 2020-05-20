/**
 * Implements a car
 */

import java.util.List;
import java.util.ArrayList;

public class Car {
    private List<CarPart> parts = new ArrayList<CarPart>();

    /**
     * @param car part to add to the car
     */
    public void addPart(CarPart part) {
        parts.add(part);
    }

    /**
      * @return string representation of Car
     */
    public String toString() {
        StringBuilder strbuilder = new StringBuilder();
        for(CarPart part : parts) {
            strbuilder.append(part.getName());
            strbuilder.append("\n");
        }
        return strbuilder.toString();
    } 
}
