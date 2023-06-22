import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) {
        // Задача 1 Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    /* 
    System.out.print("Введите число n: ");
    Scanner inputNumber = new Scanner(System.in);
    int n = inputNumber.nextInt();
    int sum1 = 0;
    int result = 1;
        for (int i = 1; i <= n; i++) {
            sum1 += i;
            result *= i;
        }
        System.out.println("Сумма чисел от 1 до " + n + " равна " + sum1);
        System.out.println("Произведение чисел от 1 до " + n + " равна " + result);
        */ 

        // Задача 2 Вывести все простые числа от 1 до 1000
        /* 
        int i,j;
        boolean isPrime;
        System.out.println("Простые числа от 1 до 1000:");
        for (i = 2; i <= 1000; i++) {
            isPrime = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
*/

        //Задача 3 Реализовать простой калькулятор

        Scanner scanner = new Scanner(System.in);
        int num1, num2, result;
        char operator;
        System.out.print("Введите первое число: ");
        num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        num2 = scanner.nextInt();
        System.out.print("Введите оператор (+, -, *, /): ");
        operator = scanner.next().charAt(0);
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка! Деление на ноль невозможно.");
                } else {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Ошибка! Неверный оператор.");
                break;
        }

}

}

