package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger loggerSingleInstance = null;
    private String lastLog = "";

    private Logger(){
    }

    static Logger getInstance(){
        if(loggerSingleInstance == null){
            loggerSingleInstance = new Logger();
        }
        return loggerSingleInstance;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}