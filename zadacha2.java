/*
Учет тезок
напишите программу, которая
принимает с клавиатуры два строковых значения,
каждое из которых содержит имя человека, и проверяет,
являются ли эти люди тезками. о результатам
проверки следует вывести на экран
соответствующее сообщение.
* */

import java.util.Scanner;
import java.lang.String;
import java.lang.Object;

public class zadacha2 {
    public static void main(String[] args) {
        String name1, name2;
        System.out.println("ВВедите имена в каждую строку");

        //создал оьбъекты сканнер для имен
        Scanner firstName  = new Scanner(System.in);
        Scanner secondName  = new Scanner(System.in);

        // считываю строки
        name1 = firstName.nextLine();
        name2 = secondName.nextLine();
        //Имена с заглавных букв
        name1= name1.substring(0,1).toUpperCase() + name1.substring(1,name1.length());
        name2= name2.substring(0,1).toUpperCase() + name2.substring(1,name2.length());

        if (name1.equals(name2)){
            System.out.println("Тёзки!");
        }else{
            System.out.println( name1 + " и " + name2 + " это разные имена!");
        }
        //закрыл ввод
        firstName.close();
        secondName.close();
    }
}