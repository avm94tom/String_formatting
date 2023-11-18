/*
Вводится строка и две подстроки.  еобходимо заменить все вхождения одной подстроки на
другую.
*/
import java.util.Scanner;
import java.lang.String;
import java.lang.Object;

public class zadacha4 {
    public static void main(String[] args) {
        String originalString, redactedString;
        String firstSubstring, secondSubstring;

        System.out.println("ВВедите любую строку");
        //создал объект сканнер для строки
        Scanner originalStringScannerObject  = new Scanner(System.in);
        originalString = originalStringScannerObject.nextLine();


        //создал оьбъект сканнер для заменяемой подстроки и считал ее
        System.out.println("ВВедите подстроку которую нужно заменить");
        Scanner firstSubstringScannerObject  = new Scanner(System.in);
        firstSubstring  = firstSubstringScannerObject.nextLine();


        //создал оьбъект сканнер для НЕзаменяемой подстроки и считал ее
        System.out.println("ВВедите подстроку НА которую ее нужно заменить");
        Scanner secondSubstringScannerObject  = new Scanner(System.in);
        secondSubstring = secondSubstringScannerObject.nextLine();


        //Делю строку на подстроки
        if (originalString.contains(firstSubstring)){
            redactedString = originalString.replace(firstSubstring, secondSubstring);
            System.out.println("Отредактированная строка: ");
            System.out.println(redactedString);
            System.out.println("НЕотредактированная строка: ");
            System.out.println(originalString);
        } else {
            redactedString = originalString;
            System.out.println("Ничего не менялось. НЕотредактированная строка: ");
            System.out.println(originalString);
        }
        originalStringScannerObject.close();
        firstSubstringScannerObject.close();
        firstSubstringScannerObject.close();
    }
}

