package Loggers;

import Interfaces.LoggerService;

public class SmsLogger implements LoggerService {

    @Override
    public void log() {
        System.out.println("SMS loglandi");
    }
}
