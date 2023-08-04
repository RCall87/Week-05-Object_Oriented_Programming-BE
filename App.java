public class App {
    public static void main(String[] args) {
        // Instantiate instances of the logger classes
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        // Test methods on both instances
        asteriskLogger.log("Hello");
        asteriskLogger.error("Something went wrong");

        spacedLogger.log("Hello");
        spacedLogger.error("Another error occurred");
    }
}