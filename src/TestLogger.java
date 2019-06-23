import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogger {

    final static Logger logger = Logger.getLogger(TestLogger.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("Log4j.properties");
        logger.debug("This is a Debugger");
        logger.info("This is Info");
        logger.warn("This is a Warning");
        logger.error("This is an Error");
        logger.fatal("This is Fatal");

    }
}
