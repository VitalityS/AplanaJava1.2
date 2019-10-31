import java.util.Scanner;

/*
Задача №11: Ввод строки с клавиатуры
Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.
*/
public class HomeWork11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine();
        System.out.println(str);
    }
}