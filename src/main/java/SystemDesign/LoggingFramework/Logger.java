package SystemDesign.LoggingFramework;

import java.io.Serializable;

import static SystemDesign.LoggingFramework.LogManager.addObservers;
import static SystemDesign.LoggingFramework.LogManager.doChaining;

public class Logger implements Cloneable, Serializable {
    private volatile static Logger logger;
    private volatile static AbstractLogger chainOfLogger;
    private volatile static LoggerSubject loggerSubject;

    private Logger() {
        if (logger != null)
            throw new IllegalStateException("Object already created");
    }

    public static Logger getLogger() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                    chainOfLogger = doChaining();
                    loggerSubject = addObservers();
                }
            }
        }
        return logger;
    }

    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve() {
        return logger;
    }

    public void info(String message) {
        createLog(1, message);
    }

    public void error(String message) {
        createLog(2, message);
    }

    public void debug(String message) {
        createLog(3, message);
    }

    private void createLog(int level, String message){
        chainOfLogger.logMessage(level, message, loggerSubject);
    }
}
