package lessons4;
import java.util.*;

public class lessons4 {
    public static void main(String[] args) {
        // long startTime = System.nanoTime();
        // List<Integer> arrayList = new ArrayList<>(); // массив который автоматически увеличивается
        // for (int i = 0; i < 10000; i++) {
        //     arrayList.add(i);
        // }
        // long endTime = System.nanoTime();
        // long resulArrayList = endTime - startTime;
        // List<Integer> linkedList = new LinkedList<>(); // список связан и поэтому чтобы добавить в конец надо пробежать по всем жлементам цепочками
        // for (int i = 0; i < 10000; i++) { 
        //     linkedList.add(i);
        // } 
        // endTime = System.nanoTime();
        // long resultLinkedList = endTime - startTime;
        // System.out.println(resultLinkedList);
        // System.out.println("now arrayList");
        // System.out.println(resulArrayList);



        // Реализовать консольное приложение 1. Принимает строку tex~num
        // 2. нужно распелить строку по ~, сохранить text в связанный список на позицию num
        // 3. Если введено print~num, выводит строку из позии num в связанном списке и удаляет ее из списка

        // Scanner scanner = new Scanner(System.in, "cp866");
        // System.out.println("Введите строку text~num или print~num или exit: ");
        // // String str = scanner.nextLine();
        // String str = "";
        // LinkedList<String> arr = new LinkedList<>();
        // while (!str.equals("exit")) {
        //     str = scanner.nextLine(); 
        //     String[] st = str.split("~");
        //     if (st[0].equals("print")) {
        //         //arr.add(Integer.parseInt(st[0], st[1]));
        //         System.out.println(arr.get(st[1]));
        //     }
        //     if (st[0] instanceof String) {
        //         arr.add(Integer.parseInt(st[1], st[0]));
                
        //     }
        // }
        // scanner.close();


        String [] array = {"a", "b", "c", "d", "e", "f", "g"};
        // Stack <String> stack = new Stack<> ();
        Queue<String> queue = new ArrayDeque<> ();
        for (String element: array) {
           // stack.push (element);
            queue.offer (element);
            
        }
        //System.out.println(stack.toString());
        System.out.println(queue.toString());



    }
    
}
