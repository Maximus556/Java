// package lessons6;

// import java.util.*;

// public class lessons6 {
//     public static void main(String[] args) {
        // Создать HashSet, заполнить числами и вывести {1,2,3,4,5,3}
        // Создать LinkedHashSet, заполнить числами и вывести {1,2,3,4,5,3}
        // // Создать TreeSet, заполнить числами и вывести {1,2,3,4,5,3}
        // Set <Integer> hashSet = new HashSet <>(List.of(1,2,3,4,5,3));
        // Set <Integer> linkedHashSet = new LinkedHashSet <>(List.of(1,2,3,4,5,3));
        // Set <Integer> treeSet = new TreeSet <>(List.of(1,2,3,4,5,3));
        // System.out.println(hashSet);
        // System.out.println(linkedHashSet);
        // System.out.println(treeSet);

        // 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24. 
        // 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений
        // в данном массиве и верните его в виде числа с плавающей запятой.
        // Для вычисления процента используйте формулу:
        // процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

    //     System.out.println(arr(1000, 24));
    //     System.out.println(uniqValues(arr(10, 24)));
    // }
    //     public static List <Integer> arr(int length, int r) { // метод рандома от 0 до 24 на 1000 элементов
    //         List <Integer> arr = new ArrayList<Integer>();
    //         Random rand = new Random();
    //         for (int i = 0; i < length; i++) {
    //             arr.add(rand.nextInt(r));
    //         }
    //         return arr;
    // }
    // public static double uniqValues (List <Integer> list) {
    //     double res; // создать res куда заложим результат с плавающей запятой
    //     Set <Integer> set = new HashSet<Integer>(list); // отбрасываем дубли
    //     res = set.size() * 100f / list.size(); // f дает возможность увеличить дабл
    //     return res;




    //     1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
    // а) информационной системой ветеринарной клиники (кличка, порода, окрас, вес прививки)
    // б) архивом выставки котов (порода, кличка, ФИО хозяин, родословная)
    // в) информационной системой Театра кошек Ю. Д. Куклачёва (навыки, фотогеничность, агрессивность, кол-во выступлений)
    // Можно записать в текстовом виде, не обязательно реализовывать в java.
//     Cat cat = new Cat();

//     }
// }
