/** 
 * LoggerSingletonTest.java
 * This class tests Logger singleton class
 */

public class LoggerSingletonTest {
  /**
   * @param args
   */
  public static void main(String [] args) {
    LoggerSingleton instance1 = LoggerSingleton.getInstance();
    instance1.addLog("First Log");
      //This is essentially the same logger
    LoggerSingleton instance2 = LoggerSingleton.getInstance();
    instance2.addLog("Second Log");
    instance1.printLog(); //This should print both "First Log" and "Second Log"
  }
}
