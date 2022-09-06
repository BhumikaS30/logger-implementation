package com.logger;

import static com.logger.LoggerImplementation.DEBUG;
import static com.logger.LoggerImplementation.ERROR;
import static com.logger.LoggerImplementation.INFO;

public class MainLoggerClass {

    public static void main(String[] args) {
        // Here we are creating a chain of responsibility where even null is a valid case
        // if none of them are able to handle the request the execution stops/exists.
        LoggerImplementation loggerImplementation =
            new InfoLoggerImplementation(new DebugLoggerImplementation(new ErrorLoggerImplementation(null)));

        loggerImplementation.log(INFO, "This is a info level message!");
        loggerImplementation.log(DEBUG, "This is a debug level message!");
        loggerImplementation.log(ERROR, "This is a error level message!");
    }

}
