package SystemDesign.LoggingFramework;

public class InfoLogger extends AbstractLogger {

    protected InfoLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void display(String msg, LoggerSubject loggerSubject) {

        loggerSubject.notifyAllObserver(1,"INFO : "+msg);
    }
}
