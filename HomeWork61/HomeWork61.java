package HomeWork61;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class HomeWork61 {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Dell XPS 13", 8, 512, "Windows 10"));
        laptops.add(new Laptop("MacBook Pro", 16, 256, "macOS"));
        laptops.add(new Laptop("Lenovo ThinkPad", 8, 256, "Windows 10"));
        laptops.add(new Laptop("HP Spectre x360", 16, 512, "Windows 10"));
        laptops.add(new Laptop("Asus ZenBook", 16, 1, "Windows 10"));
        laptops.add(new Laptop("Acer Swift 3", 8, 256, "Windows 10"));

        Map<String, Object> filterCriteria = new HashMap<>();

        System.out.println("Все ноутбуки:");
        for (Laptop laptop : laptops) {
        System.out.println("Модель ноутбука: " + laptop.getModel());
        System.out.println("ОЗУ: " + laptop.getRam());
        System.out.println("Объем ЖД: " + laptop.getStorage());
        System.out.println("Операционная система: " + laptop.getOs());
        System.out.println();
}

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите критерий фильтрации:");
        System.out.println("1 - Модель");
        System.out.println("2 - Объем ОЗУ");
        System.out.println("3 - Объем памяти");
        System.out.println("4 - Операционная система");
        int choice = scanner.nextInt();
        

        if (choice == 1) {
            System.out.println("Введите модель ноутбука: ");
            String model = scanner.next();
            filterCriteria.put("model", model);
        } else if (choice == 2) {
            System.out.println("Введите объем ОЗУ: ");
            int ram = scanner.nextInt();
            filterCriteria.put("ram", ram);
        } else if (choice == 3) {
            System.out.println("Введите объем памяти: ");
            int storage = scanner.nextInt();
            filterCriteria.put("storage", storage);
        } else if (choice == 4) {
            System.out.println("Введите Операционную Систему: ");
            int os = scanner.nextInt();
            filterCriteria.put("os", os);
        } else {
            System.out.println("Некорректный выбор. Программа завершается.");
            return;
        }
        
        // Фильтрация ноутбуков по критериям
        List<Laptop> filteredLaptops = filterLaptops(laptops, filterCriteria);

        // Вывод отфильтрованных ноутбуков
        System.out.println("Отфильтрованные ноутбуки:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println("Модель ноутбука: " + laptop.getModel());
            System.out.println("Объем ОЗУ: " + laptop.getRam());
            System.out.println("Объем памяти: " + laptop.getStorage());
            System.out.println("Операционная система: " + laptop.getOs());
            System.out.println();
        }
    }

    public static List<Laptop> filterLaptops(List<Laptop> laptops, Map<String, Object> filterCriteria) {
        List<Laptop> filteredLaptops = new ArrayList<>();

        for (Laptop laptop : laptops) {
            boolean meetsCriteria = true;

            for (Map.Entry<String, Object> entry : filterCriteria.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();

                if (key.equals("model")) {
                    if (!laptop.getModel().equals(value)) {
                        meetsCriteria = false;
                        break;
                    }
                } else if (key.equals("ram")) {
                    if (laptop.getRam() != (int) value) {
                        meetsCriteria = false;
                        break;
                }
                } else if (key.equals("storage")) {
                    if (laptop.getStorage() != (int) value) {
                        meetsCriteria = false;
                        break;
                    }
                } else if (key.equals("os")) {
                    if (laptop.getOs().equals(value)) {
                        meetsCriteria = false;
                        break;
                }
                }
            }

            if (meetsCriteria) {
                filteredLaptops.add(laptop);
            }
        }
        return filteredLaptops;

    }
}
