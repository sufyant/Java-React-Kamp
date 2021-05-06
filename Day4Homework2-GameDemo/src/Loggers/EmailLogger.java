package Loggers;

import Interfaces.LoggerService;

public class EmailLogger implements LoggerService {

    @Override
    public void log() {
        System.out.println("Email loglandi");
    }
}
