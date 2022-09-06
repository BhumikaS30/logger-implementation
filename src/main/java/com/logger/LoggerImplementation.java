package com.logger;

import static java.util.Objects.nonNull;

/**
 * This class defines an abstract class with an instance to itself to create a chain
 * for the chain of responsibility Design pattern. If the implemented class 1 can handle the
 * request the execution ends or else the responsibility is passed on to another implementation
 * of this class.
 */
abstract public class LoggerImplementation {

    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    LoggerImplementation nextLogger;

    public LoggerImplementation(LoggerImplementation nextLogger) {
        this.nextLogger =  nextLogger;
    }

    public void log (int logLevel, String message) {
        if (nonNull(nextLogger)) {
            nextLogger.log(logLevel, message);
        }
    }

}
