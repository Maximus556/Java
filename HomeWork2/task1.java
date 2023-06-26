package HomeWork2;
import java.io.FileWriter;
import java.io.IOException;

public class task1 {
    public static void main(String[] args)  throws IOException{
    // Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
    int[] arr = {3, 6, 8, 3, 1, 5};

        FileWriter logFile = new FileWriter("log.txt");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    // записываем результат в лог-файл
                    logFile.write("Итерация " + (i+1) + ": " + arrayToString(arr) + "\n");
                }
            }
        }

        logFile.close();
    }

    // метод для преобразования массива в строку
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}


