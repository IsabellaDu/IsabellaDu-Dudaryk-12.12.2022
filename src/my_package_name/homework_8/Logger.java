package my_package_name.homework_8;


import java.util.logging.Level;

public class Logger {

    java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Logger.class.getName());

    public void infoMessage(String message) {
        logger.info(Colors.YELLOW.getColorCode() + message);
    }

    public void warnMessage(String message) {
        logger.log(Level.WARNING, Colors.BLUE.getColorCode() + message);
    }

    public void errorMessage(String message) {
        logger.log(Level.SEVERE, Colors.PURPLE.getColorCode() + message);
    }

    public void debugMessage(String message) {
        logger.log(Level.FINE, Colors.CYAN.getColorCode() + message);
    }
}
