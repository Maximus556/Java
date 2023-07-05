package HomeWork5;

import java.util.*;

public class HomeWork5 {
    public static void main(String[] args) {
        // Задание
        // Реализуйте структуру телефонной книги с помощью HashMap.
        // Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, 
        // их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию 
        // числа телефонов
       
        Map<String, List<String>> phonebook = new HashMap<>();

        addContact(phonebook, "Иванов Иван Иванович", "8134134123");
        addContact(phonebook, "Люлькин Сергей Павлович", "85673829374");
        addContact(phonebook, "Сидоров Максим Николаевич", "859593259375");
        addContact(phonebook, "Сидоров Максим Николаевич", "836472758390");
        addContact(phonebook, "Чехов Антон Павлович", "847435843834");
        addContact(phonebook, "Люлькин Иван Павлович", "53745634753634");
        addContact(phonebook, "Иванов Иван Андреевич", "8134134123");

        List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(phonebook.entrySet());
        Collections.sort(sortedEntries, (a, b) -> b.getValue().size() - a.getValue().size());

        for (Map.Entry<String, List<String>> entry : sortedEntries) {
            String name = entry.getKey();
            List<String> phoneNumbers = entry.getValue();
            System.out.println(name + ": " + phoneNumbers.size() + " телефон(а/ов)");
            for (String phoneNumber : phoneNumbers) {
                System.out.println(phoneNumber);
            }
            System.out.println();
        }
    }

    private static void addContact(Map<String, List<String>> phonebook, String name, String phoneNumber) {
        if (phonebook.containsKey(name)) {
            List<String> phoneNumbers = phonebook.get(name);
            phoneNumbers.add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phonebook.put(name, phoneNumbers);
        }


    }
}

