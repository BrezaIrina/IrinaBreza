package com.irinabreza.hillel.Homework8;

public enum Level {
    INFO("Info"),
    DEBUG("Debug"),
    WARN("Warn"),
    ERROR("Error");

    private String level;

    public String getConsoleColor() {
        switch (this) {
            case INFO:
                return ColorRepresentation.ANSI_GREEN;
            case DEBUG:
                return  ColorRepresentation.ANSI_BLUE;
            case WARN:
                return ColorRepresentation.ANSI_YELLOW;
            case ERROR:
                return ColorRepresentation.ANSI_RED;
            default:
                return ColorRepresentation.ANSI_WHITE;
        }
    }

    Level(String level) {
        this.level = level;
    }

    public String toString() {
        return getConsoleColor() + level;
    }

    public boolean shouldBeLogged(Level level) {
        switch (this) {
            case INFO:
                return true;
            case DEBUG:
                return level != Level.INFO;
            case WARN:
                return (level == Level.WARN || level == Level.ERROR);
            default:
                return level == level.ERROR;
        }
    }
}

