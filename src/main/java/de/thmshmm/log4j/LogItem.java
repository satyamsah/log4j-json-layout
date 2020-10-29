package de.thmshmm.log4j;

/**
 * Created by Thomas Hamm on 27.07.17.
 */
public class LogItem {
    private final Long ts;
    private final String level;
    private final String logger;
    private final String thread;
    private final String msg;
    private final String sparklineOcid;
    private final String stacktrace;

    public LogItem( String sparklineOcid, Long ts, String level, String logger, String thread, String msg, String stacktrace) {
        this.sparklineOcid=sparklineOcid;
        this.ts = ts;
        this.level = level;
        this.logger = logger;
        this.thread = thread;
        this.msg = msg;
        this.stacktrace = stacktrace;

    }

    public Long getTs() {
        return ts;
    }

    public String getLevel() {
        return level;
    }

    public String getLogger() {
        return logger;
    }

    public String getThread() {
        return thread;
    }

    public String getMsg() {
        return msg;
    }

    public String getStacktrace() {
        return stacktrace;
    }

    public String getsparklineOcid() {
        return sparklineOcid;
    }
}
