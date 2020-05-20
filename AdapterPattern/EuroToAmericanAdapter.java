/**
 * EuroToAmericanAdapter.java
 * This class converts European voltage to American voltage
 * so that equipments that require 110 volts can use
 * the european power source
 */

public class EuroToAmericanAdapter extends EuroPowerSource {
    private AmericanPowerSource americanPower; 

    public EuroToAmericanAdapter() {
        americanPower = new AmericanPowerSource();
    }

    @Override
    public int generatePower() {
        return americanPower.generatePower();
    }
}

