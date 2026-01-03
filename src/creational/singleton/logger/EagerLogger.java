package creational.singleton.logger;

class EagerLogger {

    // Created immediately when class loads (thread-safe by default)
    private static final EagerLogger instance = new EagerLogger();
    private int instanceId;

    private EagerLogger() {
        this.instanceId = (int) (System.currentTimeMillis() % 10000);
        System.out.println("[EagerLogger] Instance created with ID: " + instanceId);
    }

    public static EagerLogger getInstance() {
        return instance;
    }
}
