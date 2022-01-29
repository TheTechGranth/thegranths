package SystemDesign.LoggingFramework;

public class ErrorLogger extends AbstractLogger {

    ErrorLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void display(String msg, LoggerSubject loggerSubject) {

        loggerSubject.notifyAllObserver(2,"ERROR : "+msg);
    }
}
