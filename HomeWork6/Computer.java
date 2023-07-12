package HomeWork6;
// 1. Модель 2. ОЗУ 3. Объем ЖД 4. Операционная система 5. Цвет 6. Размер дисплея 7.Цена
public class Computer {

    private String model;
    private Integer ram;
    private Integer storage;
    private String os;
    private String color;
    private double sizeDicplay;
    private double price;
    

    public Computer(String model, int ram, int storage, String os, String color, int sizeDicplay, int price) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
        this.sizeDicplay = sizeDicplay;
        this.price = price;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSizeDicplay() {
        return sizeDicplay;
    }

    public void getSizeDicplay(double sizeDicplay) {
        this.sizeDicplay = sizeDicplay;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

