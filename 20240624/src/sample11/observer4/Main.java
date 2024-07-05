package sample11.observer4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        SensorReader sensorReader = new SensorReader("s1f102200255", "zl159456");
        SensorObserver sensorObserver = new SensorObserver();

        sensorReader.addObserver(sensorObserver);

        sensorReader.execute("3205");
    }
}

