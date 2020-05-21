/** 
 * This is a dummy class to emulate doc reader to be instantiated 
 * by factory class
 */

public class FactoryDocReader extends FactoryFileReader {
    public void readFileContents(String filename) {
        System.out.println(filename + " is opened by FactoryDocReader");
    }
}
