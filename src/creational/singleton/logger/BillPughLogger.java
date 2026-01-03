package creational.singleton.logger;

public class BillPughLogger {
    
    private int instanceId;
    
    private BillPughLogger() {
        this.instanceId = (int) (System.currentTimeMillis() % 10000);
        System.out.println("[BillPughLogger] Instance created with ID: " + instanceId);
    }
    
    /**
     * Static inner class holds the instance
     * JVM ensures this class is loaded only once, thread-safely
     */
    private static class LoggerHolder {
        private static final BillPughLogger instance = new BillPughLogger();
    }
    
    /**
     * When getInstance() is called, LoggerHolder class is loaded
     * JVM handles the synchronization of class loading
     * Instance is created only on first access
     */
    public static BillPughLogger getInstance() {
        return LoggerHolder.instance;
    }

    public int getInstanceId() {
        return instanceId;
    }

    public void log(String message) {
        long timestamp = System.currentTimeMillis();
        System.out.println(String.format("[%d] [BillPughLoggerInstance-%d] %s",
                timestamp, instanceId, message));
    }
}

