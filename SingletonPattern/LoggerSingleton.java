/** 
 * LoggerSingleton.java 
 * This class implements a Logger object that uses
 * Singleton pattern. A singleton pattern ensures that a class has
 * only one instance and ensures access to the instance through 
 * application. Why is this important? 
 * Because sometimes, you just need the same instance all across 
 * application. For example: Both Class A and Class B will log
 * to same logger instance.
 */

public class LoggerSingleton  {
  private static LoggerSingleton loggerInstance = null;
  private String log;

  /* Private constructor, because we don't invoke it*/
  private LoggerSingleton() {
    log = new String();
  }

  public void addLog(String log) {
    if(!this.log.equals("")) {
      this.log += "\n";
    }
    this.log += log;
  }

  public void printLog() {
    System.out.println(log);
  }

  /**
   * @return existing instance of logger, new logger if no instance
   */
  public static LoggerSingleton getInstance() {
    if(loggerInstance == null) {
      loggerInstance = new LoggerSingleton();
    }
    return loggerInstance;
  }
}
