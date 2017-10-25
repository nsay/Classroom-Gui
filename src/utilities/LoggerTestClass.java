package utilities;

/**
 *
 * @author Narith
 */
public class LoggerTestClass {

    /**
     * Sample test application to test logging logic
     */
    public static void main(String[] args) {
        // ----------------------------------------------------------------
        // Test #1 - Test disable/enable logging
        // Even though the log level is set, no logging should happen
        // because logging is disabled.
        System.out.println("Testing disable/enable logging");

        Logger.setLogLevel(Logger.DEBUG);
        Logger.disableLogging();
        Logger.logDebug("Test failed, this should not print!");
        Logger.logInfo("Test failed, this should not print!");
        Logger.logWarning("Test failed, this should not print!");
        Logger.logError("Test failed, this should not print!");

        // ----------------------------------------------------------------
        // Test #2 - Test debug Detail
        // Logging is enabled and the level is still set to debug
        Logger.enableLogging();
        System.out.println("Testing Debug Detail");
        System.out.println("You should see four messages:");
        Logger.logDebug("Message #1");
        Logger.logInfo("Message #2");
        Logger.logWarning("Message #3");
        Logger.logError("Message #4");
        // ----------------------------------------------------------------

        // ----------------------------------------------------------------
        // Test #3 - Test Info Detail
        System.out.println("Testing Info Detail");
        System.out.println("You should see three messages:");
        Logger.setLogLevel(Logger.INFO);
        Logger.enableLogging();
        Logger.logDebug("Test failed, this should not print!");
        Logger.logInfo("Message #1");
        Logger.logWarning("Message #2");
        Logger.logError("Message #3");
        // ----------------------------------------------------------------

        // ----------------------------------------------------------------
        // Test #4 - Test Warning Detail
        System.out.println("Testing Warning Detail");
        System.out.println("You should see two messages:");
        Logger.setLogLevel(Logger.WARN);
        Logger.enableLogging();
        Logger.logDebug("Test failed, this should not print!");
        Logger.logInfo("Test failed, this should not print!");
        Logger.logWarning("Message #1");
        Logger.logError("Message #2");
        // ----------------------------------------------------------------

        // ----------------------------------------------------------------
        // Test #5 - Test Error Detail
        System.out.println("Testing Error Detail");
        System.out.println("You should see one messages:");
        Logger.setLogLevel(Logger.ERROR);
        Logger.enableLogging();
        Logger.logDebug("Test failed, this should not print!");
        Logger.logInfo("Test failed, this should not print!");
        Logger.logWarning("Test failed, this should not print!");
        Logger.logError("Message #1");
        // ----------------------------------------------------------------

    }

}