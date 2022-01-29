package SystemDesign.LoggingFramework;

public class DebugLogger extends AbstractLogger {

    DebugLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void display(String msg, LoggerSubject loggerSubject) {

        loggerSubject.notifyAllObserver(1,"DEBUG : "+msg);
    }
}
