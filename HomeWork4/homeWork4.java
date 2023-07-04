package HomeWork4;
import java.util.*;

public class homeWork4 {
    public static void main(String[] args) {
        // Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
        // 1) Умножьте два числа и верните произведение в виде связанного списка.
        // 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.
        
        LinkedList<Integer> num1 = new LinkedList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);

        LinkedList<Integer> num2 = new LinkedList<>();
        num2.add(5);
        num2.add(9);
        num2.add(7);

        LinkedList<Integer> product = multiplyLinkedLists(num1, num2);
        LinkedList<Integer> sum = addLinkedLists(num1, num2);

        System.out.print("Результат произведения: ");
        for (int i = product.size() - 1; i >= 0; i--) {
            System.out.print(product.get(i));
        }
        System.out.println();

        System.out.print("Результат сложения: ");
        for (int i = sum.size() - 1; i >= 0; i--) {
            System.out.print(sum.get(i));
        }
    }

    public static LinkedList<Integer> multiplyLinkedLists(LinkedList<Integer> num1, LinkedList<Integer> num2) {
        int size1 = num1.size();
        int size2 = num2.size();

        LinkedList<Integer> product = new LinkedList<>();

        for (int i = 0; i < size1; i++) {
            int carry = 0;
            LinkedList<Integer> tempProduct = new LinkedList<>();

            for (int j = 0; j < size2; j++) {
                int digit1 = num1.get(i);
                int digit2 = num2.get(j);

                int productDigit = (digit1 * digit2) + carry;
                tempProduct.add(productDigit % 10);
                carry = productDigit / 10;
            }

            if (carry != 0) {
                tempProduct.add(carry);
            }

            for (int k = 0; k < i; k++) {
                tempProduct.addFirst(0);
            }

            product = addLinkedLists(product, tempProduct);
        }

        return product;
    }

    public static LinkedList<Integer> addLinkedLists(LinkedList<Integer> num1, LinkedList<Integer> num2) {
        int size1 = num1.size();
        int size2 = num2.size();
        int maxSize = Math.max(size1, size2);

        LinkedList<Integer> result = new LinkedList<>();
        int carry = 0;

        for (int i = 0; i < maxSize; i++) {
            int digit1 = (i < size1) ? num1.get(i) : 0;
            int digit2 = (i < size2) ? num2.get(i) : 0;

            int sum = digit1 + digit2 + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }

        if (carry != 0) {
            result.add(carry);
        }

        return result;

    }
}