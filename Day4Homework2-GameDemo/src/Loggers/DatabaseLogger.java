package Loggers;

import Interfaces.LoggerService;

public class DatabaseLogger implements LoggerService {

    @Override
    public void log() {
        System.out.println("DB loglandi");
    }
}
