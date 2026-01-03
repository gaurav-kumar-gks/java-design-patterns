package creational.singleton.logger;

public class DoubleCheckedLockingLogger {
    
    // volatile ensures visibility across threads
    private static volatile DoubleCheckedLockingLogger instance;
    private int instanceId;
    
    private DoubleCheckedLockingLogger() {
        this.instanceId = (int) (System.currentTimeMillis() % 10000);
        System.out.println("[DoubleCheckedLogger] Instance created with ID: " + instanceId);
    }
    
    public static DoubleCheckedLockingLogger getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingLogger.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingLogger();
                }
            }
        }
        return instance;
    }
}
