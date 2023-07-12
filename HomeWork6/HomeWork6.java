package HomeWork6;

import java.util.*;

public class HomeWork6 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Создание множества ноутбуков
        List<Computer> computers = initListComputers();
        Map<String, String> params = Map.of("1", "model", "2", "ram", "3", "storage", "4", "os", "5", "color", "6", "sizeDicplay", "7", "price");
        List<Computer> filteredComputer= filter(params, computers);
        System.out.println("Коллекция ноутбуков: " + filteredComputer);
    }
    public static List<Computer> initListComputers() {
        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer("Asus", 8, 512, "Windows", "Белый", 15, 1000));
        computers.add(new Computer("Apple", 16, 1024, "MacOS", "Серебрянный", 13, 1200));
        computers.add(new Computer("Lenovo", 12, 512, "Linux", "Черный", 14, 1500));
        computers.add(new Computer("Lenovo", 12, 256, "Windows", "Синий", 19, 500));
        return computers;
    }


    public static List<Computer> filter(Map<String, String> params, List<Computer> computers) {
        List<Computer> filteredComputer = new ArrayList<>();
        for (Computer computer : computers) {
            boolean isValid = true;
            for (Map.Entry<String, String> entry : params.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                switch (key) {
                    case "1":
                        if (!computer.getModel().equals(value)) {
                            isValid = false;
                        }
                        break;
                    case "2":
                        if (computer.getRam() != Integer.parseInt(value)) {
                            isValid = false;
                        }
                        break;
                    case "3":
                        if (computer.getStorage() != Integer.parseInt(value)) {
                            isValid = false;
                        }
                        break;
                    case "4":
                        if (!computer.getOs().equals(value)) {
                            isValid = false;
                        }
                        break;
                    case "5":
                        if (computer.getColor().equals(value)) {
                            isValid = false;
                        }
                        break;
                    case "6":
                        if (computer.getSizeDicplay() != Integer.parseInt(value)) {
                            isValid = false;
                        }
                        break;
                    case "7":
                        if (computer.getPrice() != Integer.parseInt(value)) {
                            isValid = false;
                        }
                }
            }
            if (isValid) {
                filteredComputer.add(computer);
            }
        }
        return filteredComputer;
    }
    
}






    

