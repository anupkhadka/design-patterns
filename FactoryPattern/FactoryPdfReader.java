/** 
 * This is a dummy class to emulate Pdf reader
 * to be instantiated by factory class
 */

public class FactoryPdfReader extends FactoryFileReader {
    public void readFileContents(String filename) {
        System.out.println(filename + " is opened by FactoryPdfReader");
    }
}
