package HomeWork3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Iterator;


public class homeWork3 {
    public static void main(String[] args) {
        
// Задание
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение
        System.out.println ("Введите длину списка: ");
        Scanner inputRead = new Scanner(System.in);
        
         int size = inputRead.nextInt(); 
         try {
            } finally {
        inputRead.close();
            }
         int sum = 0;

        ArrayList<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(10);
            randomList.add(randomNumber); 
        }
        System.out.println("Список: " + randomList);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : randomList) {
                sum += i;
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }

        }
        double average = (double) sum / randomList.size();
        System.out.println("Среднее значение: " + average);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);

        Iterator<Integer> iterator = randomList.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }

    }
        System.out.println("Список без четных чисел: " + randomList);
}
}

