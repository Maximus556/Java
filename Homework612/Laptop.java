package Homework612;

public class Laptop {
    private String model;
    private int ram;
    private int storage;
    private String os;

    public Laptop(String model, int ram, int storage, String os) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}


