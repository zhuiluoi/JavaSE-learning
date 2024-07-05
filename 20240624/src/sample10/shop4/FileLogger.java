package sample10.shop4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    private static final String LOG_FILE_NAME = "log.txt";
    private static FileLogger instance;
    private final File file;

    private FileLogger() {
        this.file = new File(LOG_FILE_NAME);
    }

    public static synchronized FileLogger getInstance() {
        if (instance == null) {
            instance = new FileLogger();
        }
        return instance;
    }

    @Override
    public void purchase(Customer customer, Item item) {
        String logMessage = String.format("[Purchase] %s: %s(%d yen).\n",
                customer.getName(),
                item.getName(),
                item.getPrice());
        writeLog(logMessage);
    }

    @Override
    public void balance(User user) {
        String logMessage = String.format("[Balance] %s: %d yen.\n",
                user.getName(),
                user.getBalance());
        writeLog(logMessage);
    }

    @Override
    public void error(User user, String error) {
        String logMessage = String.format("[Error] %s: %s.\n",
                user.getName(),
                error);
        writeLog(logMessage);
    }

    private void writeLog(String logMessage) {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(logMessage);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
