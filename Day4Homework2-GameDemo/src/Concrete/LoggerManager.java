package Concrete;

import Interfaces.LoggerService;

public class LoggerManager {

    LoggerService loggerService;

    public LoggerManager(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    public void log() {
        loggerService.log();
    }

}
