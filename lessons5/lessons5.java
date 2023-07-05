package lessons5;

// import java.nio.charset.Charset;
import java.util.*;

public class lessons5 {
    public static void main(String[] args) {
            // Создать структуру для хранения номеров паспортов и фамилии сотрудников организации
            // вывести данные по фамилии Иванов
            // 123456 Иванов
            // 321564 Васильев
            // 2341561 Петоров
            // 234442 Иванов
            // 345678 Иванов
            // 873872 Петоров
            Map<String, String> passportData = new HashMap<String, String>(); // Создаем коллекцию Map куда будем сохранять ключи и значения
            passportData.put("123456", "Иванов"); // Загружаем даннеы
            passportData.put("321564", "Васильев");
            passportData.put("2341561", "Иванов");
            passportData.put("234442", "Емельяненько");
            passportData.put("345678", "Иванов");
            passportData.put("873872", "Петров");
            String serchLastName = "Иванов";
            for (Map.Entry<String, String>  entry: passportData.entrySet()) { //Пробегаем по Map указывая типы и достаем все значения
                String passportNumaber = entry.getKey(); // вытащить ключи
                String lastName = entry.getValue(); // вытащить значения
                if (lastName.equals(serchLastName)) {
                    System.out.println(passportNumaber + " " + lastName); // вывести
                }
            }
    }
}

            // даны 2 строки, написать метод который вернет true если 
            //строки изоморфны (количество букв одинаковы и структура (гласные и согласные)) и false если нет

    //         String str1 = "tittle";
    //         String str2 = "paper";
    //         System.out.println(isomorf(str1, str2));
    //     public static boolean isomorf(String str1, String str2) {
    //     boolean f1 = true;
    //         Map<Charset, Charset> mp1 = new HashMap<Charset, Charset>();
    //         Map<Charset, Charset> mp2 = new HashMap<Charset, Charset>();
            
    //         if (str1.length() != str2.length()) {
    //             f1 = false;
    //         else {
    //             for (int i = 0; i < str1.length(); i++) {
    //                 mp1.put(str1.CharAt(i), str2.CharAt(i));
    //                 mp2.put(str2.CharAt(i), str1.CharAt(i));
    //         }
    //     HashSet<Charset> str1 = new HashSet<Charset>(mp1.keySet());
    //     HashSet<Charset> str2 = new HashSet<Charset>(mp1.keySet());
    //     if (str1.size() != str2.size()) {
    //         f1 = false;
    //     }
    //     return f1;



//     }


// }


