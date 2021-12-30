package com.irinabreza.hillel.Homework8;

public class Main {
    public static void main(String[] args) {

        Logger myLogger = new Logger(Level.INFO);
        myLogger.log(Level.WARN, "Test message");

        Logger onlyErrorLogger = new Logger(Level.ERROR);
        onlyErrorLogger.log(Level.DEBUG, "Some message");
        onlyErrorLogger.log(Level.ERROR, "Some error message");

    }
}
