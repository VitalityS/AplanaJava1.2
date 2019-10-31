import java.util.Scanner;

/*
Задача №13: Сравнение двух строкЗадание
Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствтующее сообщение.
*/
public class HomeWork13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 строку");
        String str1 = in.nextLine();
        System.out.println("Введите 2 строку");
        String str2 = in.nextLine();
        if (str1.length() > str2.length()) {
            System.out.println(str1);
        } else if (str1.length() < str2.length()) {
            System.out.println(str2);
        } else System.out.println("Длина строк одинаковая");
    }
}