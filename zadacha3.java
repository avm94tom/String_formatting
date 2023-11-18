/*
Парсим соцсети
У вас есть публикация в социальной сети, и вам необходимо определить индекс последнего появления
определенного хэштега #javaforever.
 */

import java.util.Scanner;
import java.lang.String;
import java.lang.Object;

public class zadacha3 {
    public static void main(String[] args) {
        String originalPublication;
        int numberOfMentions = 0, lastMentionIndex = 0;


        originalPublication = ("In Java, #javaforever Scanner is a class in java.util package #javaforever used for obtaining the input of the primitive types like int, double, etc. and strings. #javaforever");
        int end = originalPublication.length();
        if (originalPublication.contains("#javaforever") && end - lastMentionIndex -  <= 0) {
               numberOfMentions+=1;

               lastMentionIndex = originalPublication.lastIndexOf("#javaforever");
               System.out.println("Хэштег в тексте встречается: " + numberOfMentions);
               System.out.println("Хэштег в последний раз упоминается: " + lastMentionIndex);

        } else {
            numberOfMentions = 0;
            lastMentionIndex = 0;
            System.out.println("Хэштег в тексте  не встречается: ");
            System.out.println("Хэштег в тексте не упоминается: ");
        }

        System.out.println("Хэштег в тексте встречается: " + numberOfMentions);
        System.out.println("Хэштег в последний раз упоминается: " + lastMentionIndex);

    }
}
