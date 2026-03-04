import java.util.Map;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class LogLine {

    private LogLevel logLevel;
    private String message;
    private static final String LOG_LEVEL_REGEX = "\\[(TRC|DBG|INF|WRN|ERR|FTL)\\]";
    private static final Map<String, LogLevel> LOG_LEVEL_MAP = new HashMap<>() {
        {
            put("TRC", LogLevel.TRACE);
            put("DBG", LogLevel.DEBUG);
            put("INF", LogLevel.INFO);
            put("WRN", LogLevel.WARNING);
            put("ERR", LogLevel.ERROR);
            put("FTL", LogLevel.FATAL);
            put("UNKNOWN", LogLevel.UNKNOWN);
        }
    };
    private static final Map<LogLevel, Integer> LOG_LEVEL_SHORT_LOG = new HashMap<>() {
        {
            put(LogLevel.TRACE, 1);
            put(LogLevel.DEBUG, 2);
            put(LogLevel.INFO, 4);
            put(LogLevel.WARNING, 5);
            put(LogLevel.ERROR, 6);
            put(LogLevel.FATAL, 42);
            put(LogLevel.UNKNOWN, 0);
        }
    };

    public LogLine(String logLine) {
        if (logLine == null || logLine.isEmpty()) {
            throw new IllegalArgumentException("Log line cannot be null or empty");
        }
        Pattern pattern = Pattern.compile(LOG_LEVEL_REGEX);
        Matcher matcher = pattern.matcher(logLine);
        if (matcher.find()) {
            String logLevelStr = matcher.group(1);
            logLevel = LOG_LEVEL_MAP.getOrDefault(logLevelStr, LogLevel.UNKNOWN);
            message = logLine.substring(matcher.end()).substring(2).trim();
        } else {
            logLevel = LogLevel.UNKNOWN;
            String split[] = logLine.split(":");
            if (split.length < 2 || split[0].isEmpty() || split[1].isEmpty()) {
                throw new IllegalArgumentException(
                        "Log line must contain a log level and a message separated by a colon");
            }
            message = split[1].trim();
        }
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public String getOutputForShortLog() {
        return String.valueOf(LOG_LEVEL_SHORT_LOG.get(logLevel)) + ":" + message;
    }
}
