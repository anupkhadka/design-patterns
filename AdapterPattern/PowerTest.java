public class PowerTest {

    /**
     * @param args
     */
    public static void main(String [] args) {
        EuroWallSocket rawSocket = new EuroWallSocket(new EuroPowerSource());
        System.out.println("Power coming from raw socket: "+rawSocket.getPower());
        EuroWallSocket adapterSocket = new EuroWallSocket(new EuroToAmericanAdapter());
        System.out.println("Power coming from socket with adapter: "+adapterSocket.getPower());
    }
}
