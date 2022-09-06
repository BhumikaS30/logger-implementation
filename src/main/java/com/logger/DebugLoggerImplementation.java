package com.logger;

/**
 * This class is an extended implementation of the parent class, in case the request is
 * not handled by the previous implementation/class in the chain this class gets the responsibility
 * to either handle the request or pass on to the next implementation/class in the chain.
 */
public class DebugLoggerImplementation extends LoggerImplementation{

    public DebugLoggerImplementation(LoggerImplementation nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int logLevel, String message) {
        if (DEBUG == logLevel) {
            System.out.println("Log level is : " + logLevel + " with message : " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
