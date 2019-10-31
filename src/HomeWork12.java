import java.util.Scanner;

/*
Задача №12: Удаление всех пробелов в заданном тексте
Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.
*/
public class HomeWork12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine();
//строка str2 = str без пробелов
        String str2 = new String();
//строку str разделить на массив символов
        char[] charAray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
//если символ не пробел, то добавить его в строку str2
            if(charAray[i] != ' '){
                str2 += charAray[i];
            }
        }
        System.out.println(str2);
    }
}