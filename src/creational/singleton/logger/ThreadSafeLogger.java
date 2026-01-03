package creational.singleton.logger;

public class ThreadSafeLogger {

    private static ThreadSafeLogger instance;
    private int instanceId;
    private int logCount;

    private ThreadSafeLogger() {
        this.instanceId = (int) (System.currentTimeMillis() % 10000);
        this.logCount = 0;
        System.out.println("[ThreadSafeLogger] Instance created with ID: " + instanceId);
    }

    /**
     * - synchronized keyword ensures only one thread can execute this method at a
     * time
     * - slower because every call is synchronized
     */
    public static synchronized ThreadSafeLogger getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLogger();
        }
        return instance;
    }

    public void log(String message) {
        logCount++;
        long timestamp = System.currentTimeMillis();
        System.out.println(String.format("[%d] [Instance-%d] [Log-%d] %s",
                timestamp, instanceId, logCount, message));
    }

    public int getInstanceId() {
        return instanceId;
    }

    public static void reset() {
        instance = null;
    }
}
