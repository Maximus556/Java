package HomeWork2;
import java.io.FileWriter;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws IOException{
        // К калькулятору из предыдущего дз добавить логирование.

    Logger logFile = Logger.getAnonymousLogger ();
    FileWriter logiFale = new FileWriter("logi.txt");
    String happy = "Калькулятор в работе";
    String error = "Ошибка калькулятора";


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
                logFile.info ("happy");
                logiFale.write (happy);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                logFile.info ("happy");
                logiFale.write (happy);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                logFile.info ("happy");
                logiFale.write (happy);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка! Деление на ноль невозможно.");
                    logFile.info ("error");
                    logiFale.write (error);
                } else {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Ошибка! Неверный оператор.");
                logFile.info ("error");
                logiFale.write (error);
                break;
            }
        logiFale.close ();
        
    }
   
}

