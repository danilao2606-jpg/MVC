package web.model;

public class Car {
    private String model;
    private String engine;
    private int serial;

    public Car (String model, String engine, int serial) {
        this.model = model;
        this.engine = engine;
        this.serial = serial;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }
}
