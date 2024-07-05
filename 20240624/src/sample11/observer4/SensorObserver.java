package sample11.observer4;

public class SensorObserver implements Observer {
    @Override
    public void update(SensorReader subject) {
        System.out.printf("Updated Sensor Values - Illuminance: %f, Humidity: %f, Airpressure: %f, Temperature: %f\n",
                subject.getIlluminance(), subject.getHumidity(), subject.getAirpressure(), subject.getTemperature());
    }
}
