package Loggers;

import Interfaces.LoggerService;

public class FileLogger implements LoggerService {

    @Override
    public void log() {
        System.out.println("File loglandi");
    }
}
