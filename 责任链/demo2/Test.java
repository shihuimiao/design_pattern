package demo.zerenlian;

/**
 * @author: huimiao.shi  <huimiao.shi@beibei.com>
 * @Date: 2019-08-30 09:36
 */
public class Test {
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        consoleLogger.setNextLogger(errorLogger);

        return consoleLogger;
    }

}
