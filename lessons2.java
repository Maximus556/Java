
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.logging.Logger;

public class lessons2 {
    public static void main (String[] args) { // throws IOException предупреждаем класс об ошибке

        /* 
        String name = "name";
        String anotherString = new String("name");
        char [] chars = {'n', 'a', 'm', 'e'};
        String string3 = new String (chars);
        System.out.println(name.equals(anotherString));
        System.out.println(string3.equals(anotherString));
        */
        
        Logger logger1 = Logger.getAnonymousLogger (); // создать логи
        FileWriter  fileWritter = new FileWriter ("test.txt");   //записать файл
        String happy = "Hello, world";
        logger1.info("happy"); // чтобы записывать кудато логи
       // fileWritter.write (String.valueOf(logger1.toString())); // написать в файле строчку
        fileWritter.write (happy);
        fileWritter.close ();

        // public static String createdString (int n) { // создали метод
        // System.out.println(createdString(5)); 
        //     StringBuilder str = new StringBuilder(); // метод строить строки
        //     String c1 = "c1";
        //     String c2 = "c2";
        //     for (int i = 0; i < n; i++) {
        //         str.append(c1);
        //         str.append(c2);
        //     }
        //     return str.toString();

    } 

}
} 