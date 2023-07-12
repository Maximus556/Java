package Homework612;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Homework612 {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();

        Laptop laptop1 = new Laptop("Dell XPS 13", 16, 512, "Windows 10");
        Laptop laptop2 = new Laptop("MacBook Pro", 8, 256, "macOS");
        Laptop laptop3 = new Laptop("HP Pavilion", 12, 1_000, "Windows 10");
        Laptop laptop4 = new Laptop("Lenovo ThinkPad", 16, 1_000, "Windows 10");

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        
        System.out.println("Все ноутбуки:");
        for (Laptop laptop : laptops) {
        System.out.println("Модель ноутбука: " + laptop.getModel());
        System.out.println("ОЗУ: " + laptop.getRam());
        System.out.println("Объем ЖД: " + laptop.getStorage());
        System.out.println("Операционная система: " + laptop.getOs());
        System.out.println();
}
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите модель:");
        System.out.println("1 - Dell XPS 13");
        System.out.println("2 - MacBook Pro");
        System.out.println("3 - HP Pavilion");
        System.out.println("4 - Lenovo ThinkPad");

        int filter = scanner.nextInt();

        Map<String, Object> filterCriteria = new HashMap<>();
        switch (filter) {
            case 1:
                filterCriteria.put("model", "Dell XPS 13");
                break;
            case 2:
                filterCriteria.put("model", "MacBook Pro");
                break;
            case 3:
                filterCriteria.put("model", "HP Pavilion");
                break;
            case 4:
                filterCriteria.put("model", "Lenovo ThinkPad");
                break;
            default:
                System.out.println("Неверный фильтр");
        }

        System.out.println("Введите минимальный объем оперативной памяти:");
        int minRam = scanner.nextInt();
        filterCriteria.put("ram", minRam);

        printLaptops(laptops, filterCriteria);
    }

    public static void printLaptops(List<Laptop> laptops, Map<String, Object> filterCriteria) {
        for (Laptop laptop : laptops) {
            boolean matchesFilter = true;
            for (Map.Entry<String, Object> entry : filterCriteria.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();

                switch (key) {
                    case "model":
                        if (!laptop.getModel().equals(value)) {
                            matchesFilter = false;
                        }
                        break;
                    case "ram":
                        if (laptop.getRam() < (int) value) {
                            matchesFilter = false;
                        }
                        break;
                    default:
                        System.out.println("Неверный фильтр");
                        return;
                }
            }

            if (matchesFilter) {
                System.out.println("Модель: " + laptop.getModel());
                System.out.println("ОЗУ: " + laptop.getRam());
                System.out.println("Объем ЖД: " + laptop.getStorage());
                System.out.println("Операционная система: " + laptop.getOs());
                System.out.println();
            }
        }
    }
}
