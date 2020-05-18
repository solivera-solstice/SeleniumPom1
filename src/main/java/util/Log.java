package util;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Log {

    public static void info(String message){

        Logger logger = Logger.getLogger(
                Log.class.getName());
        logger.log(Level.INFO, message);

    }

    public static void warning(String message){

        Logger logger = Logger.getLogger(
                Log.class.getName());
        logger.log(Level.WARNING, message);
    }
}
