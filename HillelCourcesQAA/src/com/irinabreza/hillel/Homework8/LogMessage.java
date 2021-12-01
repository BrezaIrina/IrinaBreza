package com.irinabreza.hillel.Homework8;

public class LogMessage {

    String message;
    Level level;

    LogMessage(String message, Level level) {
        this.message = message;
        this.level = level;
    }

    public String toString() {
        return level.toString() + " " + message;
     }
}
