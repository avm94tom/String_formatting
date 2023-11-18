/*
Цензура
Далеко не все слова можно и нужно
произносить вслух. напишем программу,
которая заменит все символы в заданном
слове, кроме первого и последнего, на символ *. апример, С УПРЯ -> C***Я
*/
import java.util.*;
import java.util.Arrays;
import java.lang.String;
import java.lang.Object;

 class zadacha1 {
     public static void main(String[] args) {
         String Stroka = "Муравьи";
         String temp = new String();
         int firstIndex = 0;
         int lastIndex = Stroka.length() - 1;

         //превращаю строку в массив букв
         char[] JavaCharArray = Stroka.toCharArray();
         //сохраняю 1 и последнюю отдельно
         char firstLetter = Stroka.charAt(firstIndex);
         char lastLetter = Stroka.charAt(lastIndex);

         //создаю строку типа StringBulder для сборки строки воедино
         StringBuilder temp2 = new StringBuilder(temp);

         // Цикл замены букв как char с постоянной заменой 1 и последжнего символов
             for ( int i = firstIndex; i <= lastIndex; i++){
                 char star = '*';
                 JavaCharArray[i] = star;
                 JavaCharArray[firstIndex] = firstLetter;
                 JavaCharArray[lastIndex] = lastLetter;
                 temp2.append(JavaCharArray[i]);
                 temp = temp2.toString();
             }
         System.out.println("Было: " + Stroka);
         System.out.println("Cтало: " + temp);
     }
 }
