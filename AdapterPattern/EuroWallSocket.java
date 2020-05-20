/**
 * EuroWallSocket.java
 * This class implements a wall socket that 
 * includes a european power source
 */

public class EuroWallSocket {
    private EuroPowerSource source;

    public EuroWallSocket(EuroPowerSource source) {
        this.source = source;
    }

    public int getPower() {
        return source.generatePower();
    }
}
