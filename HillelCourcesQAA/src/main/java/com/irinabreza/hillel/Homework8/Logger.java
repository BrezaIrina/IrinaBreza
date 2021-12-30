package com.irinabreza.hillel.Homework8;



public class Logger {

    Level level;
        LogMessage[] messages;
        int lastIndex = 0;

        Logger(Level level) {
            this.level = level;
            this.messages = new LogMessage[1000];
        }

        public void log(Level level, String message) {

            LogMessage logMessage = new LogMessage(message, level);
            messages[lastIndex] = logMessage;
            lastIndex = lastIndex + 1;

            if (this.level.shouldBeLogged(level)) {
                System.out.println(logMessage.toString());
            }
        }
}
