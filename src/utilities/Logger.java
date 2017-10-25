package utilities;

/**
 * <p>
 Logger utility class.  This class can be used to log information to the
 screen while your programming is running in order to track the progress
 of your application.  It can be a very valuable debugging tool.
 <p>
 * You can categorize your messages using four different categories.  This
 * allows you to filter what messages actually get logged.  You can also
 * disable logging entirely.
 *
 * @author EKramer
 */
public class Logger  {

	// constants used to specify a detail level
	public static final int ERROR = 1;
	public static final int WARN = 2;
	public static final int INFO = 3;
	public static final int DEBUG = 4;

	/**
	 * <p>The current detail level.
	 */
	private static int DETAIL_LEVEL = ERROR;

	/**
	 * <p>Enables or disables the logger.
	 */
	private static boolean LOG_ENABLED = true;
	
        /**
	 * <p>
	 * Enables the logger.
	 */
	public static void enableLogging() {
		LOG_ENABLED = true;
	}

	/**
	 * <p>
	 * Disables the logger.
	 */
	public static void disableLogging() {
		LOG_ENABLED = false;
	}
        
       /**
        * <p>
        * Set the logging level of detail
        */
        public static void setLogLevel(int logLevel) {
            DETAIL_LEVEL = logLevel;
        }
	/**
	 * <p>
	 * This method will log a 'debug' message.  This message will only
	 * appear in the log if the logger is enabled.
	 *
	 * @param strMessage the message that you would like to log.
	 */
	public static void logDebug(String strMessage)	{
		if (DETAIL_LEVEL >= DEBUG) {
			logMessage("DEBUG: " + strMessage);
		}
	}

	/**
	 * <p>
	 * This method will log an 'information' message.  This message will only
	 * appear in the log if the logger is enabled and the current detail
	 * level is set to INFO, WARNING, or ERROR.
	 *
	 * @param strMessage the message that you would like to log.
	 */
	public static void logInfo(String strMessage)  {
		if (DETAIL_LEVEL >= INFO) {
			logMessage("INFO: " + strMessage);
		}
	}

	/**
	 * <p>
	 * This method will log a 'warning' message.  This message will only
	 * appear in the log if the logger is enabled and the current detail
	 * level is set to WARNING, or ERROR.
	 *
	 * @param strMessage the message that you would like to log.
	 */
	public static void logWarning(String strMessage) {
		if (DETAIL_LEVEL >= WARN) {
			logMessage("WARNING: " + strMessage);
		}
	}

	/**
	 * <p>
	 * This method will log an 'error' message.  This message will only
	 * appear in the log if the logger is enabled and the current detail
	 * level is set to ERROR.
	 *
	 * @param strMessage the message that you would like to log.
	 */
	public static void logError(String strMessage)	{
		if (DETAIL_LEVEL >= ERROR) {
			logMessage("ERROR: " + strMessage);
		}
	}
	
        /**
         * Logs a message to the standard output stream if logging is enabled.
         * @param message 
         */
        private static void logMessage(String message) {
            if (LOG_ENABLED) {
                System.out.println(message);
            }
        }
        
	/**
	 * <p>
	 * This constructor was hidden by marking it private.  Since all of the methods
	 * and data in the logger are static, there is no need for a constructor.  Therefore,
	 * we prevent the creation of a Logger class by marking this constructor private.
	 */
	private Logger() {}

}
