// Step 1: Create an interface named Logger.
interface Logger {
    void log(String message);
    void error(String message);
}

// Step 3a: Create a class that implements the Logger interface - AsteriskLogger.
class AsteriskLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    @Override
    public void error(String message) {
        String errorMessage = "ERROR: " + message;
        printAsteriskBox(errorMessage);
    }

    private void printAsteriskBox(String message) {
        int length = message.length() + 6;
        String asterisks = "*".repeat(length);
        System.out.println(asterisks);
        System.out.println("***" + message + "***");
        System.out.println(asterisks);
    }
}

// Step 3b: Create another class that implements the Logger interface - SpacedLogger.
class SpacedLogger implements Logger {
    @Override
    public void log(String message) {
        String spacedMessage = String.join(" ", message.split(""));
        System.out.println(spacedMessage);
    }

    @Override
    public void error(String message) {
        String spacedErrorMessage = "ERROR: " + String.join(" ", message.split(""));
        System.out.println(spacedErrorMessage);
    }
}

// Step 6: Create a class named App with a main method.
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
