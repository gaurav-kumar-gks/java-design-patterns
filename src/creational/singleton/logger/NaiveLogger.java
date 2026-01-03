package creational.singleton.logger;

public class NaiveLogger {

    private static NaiveLogger instance;

    private int instanceId;

    private NaiveLogger() {
        this.instanceId = (int) (System.currentTimeMillis() % 10000);
        System.out.println("[NaiveLogger] Instance created with ID: " + instanceId);
    }

    public static NaiveLogger getInstance() {
        // not thread safe
        if (instance == null) {
            instance = new NaiveLogger();
        }
        return instance;
    }

    public void log(String message) {
        long timestamp = System.currentTimeMillis();
        System.out.println(String.format("[%d] [NaiveLoggerInstance-%d] %s",
                timestamp, instanceId, message));
    }

    public int getInstanceId() {
        return instanceId;
    }

    public static void reset() {
        instance = null;
    }
}
