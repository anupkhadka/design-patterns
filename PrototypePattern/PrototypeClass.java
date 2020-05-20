/**
 * This class implements Cloneable. 
 * Prototypes for this object can be created by calling
 * its clone method
 */

public class PrototypeClass implements Cloneable {
    private int field;

    /**
     * @param set value
     */
    public void setField(int val) {
        this.field = val;
    }

    /**
       * @return field value of the class
     */
    public int getField() {
        return this.field;
    }

    @Override
    public PrototypeClass clone() throws CloneNotSupportedException {
        return (PrototypeClass) super.clone();
    }

    /**
     * @param args
     */
    public static void main(String [] args) {
        PrototypeClass prototype = new PrototypeClass();
    
        //now create clones of prototype classes
        for(int i = 0; i < 10; i++) {
            PrototypeClass tmp = new PrototypeClass();
            tmp.setField(i);
            System.out.println("Field: "+ tmp.getField());
        }	
    }
}
