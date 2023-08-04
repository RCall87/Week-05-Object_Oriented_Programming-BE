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
