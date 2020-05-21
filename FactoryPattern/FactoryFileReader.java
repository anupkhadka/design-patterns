/** 
 * This class implements Factory pattern
 * Depending on the file extension, appropriate file reader
 * is instantiated
 */

public class FactoryFileReader {

    public static FactoryFileReader createFactoryFileReader(String filename) {
        String [] result = filename.split("\\.");
        if(result.length == 2) {	
            if(result[1].equals("doc")) {
                return new FactoryDocReader();
            } else if(result[1].equals("pdf")) {
                return new FactoryPdfReader(); 
            }
        }
        System.out.println("This file extension cannot be opened");
        return null; 
    }

    public void readFileContents(String filename) {}

    /**
     * @param args
     */
    public static void main(String [] args) {
        FactoryFileReader reader; 
        if(args.length < 1) {
            System.out.println("Usage: FactoryFileReader <file_name_with_extension>");
        } else {
            if((reader = createFactoryFileReader(args[0])) != null) {
                reader.readFileContents(args[0]);
            }	
        }
    }	
} 
