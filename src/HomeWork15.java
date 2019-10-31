import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

/*
Задача №15: Сортировка данных в массивеЗадание
Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Использовать пузырьковый метод сортировки.
*/
public class HomeWork15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа через пробел:");
        String str = in.nextLine();
//строку делим по пробелу и числа сохраняем в массив строк
        String strArr[] = str.split(" ");
        int[] arrayNumbers = new int[strArr.length];
//все элементы массива строк strArr[] преобразуем в числовой тип и сохраняем в arrayNumbers[]
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = parseInt(strArr[i]);
        }
//Ниже реализован "пузырьковый метод сортировки"
/*Внешний цикл каждый раз сокращает фрагмент массива,
так как внутренний цикл каждый раз ставит в конец
фрагмента максимальный элемент*/
        for (int i = arrayNumbers.length - 1; i >= 0; i--) {
            for (int j = 0; j < arrayNumbers.length - 1; j++) {
/*Сравниваем элементы попарно,
если они имеют неправильный порядок, то меняем местами*/
                if (arrayNumbers[j] > arrayNumbers[j + 1]) {
                    int temp = arrayNumbers[j];
                    arrayNumbers[j] = arrayNumbers[j + 1];
                    arrayNumbers[j + 1] = temp;
                }
            }
        }
//Выводим все элементы отсортированного массива на экран
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.print(arrayNumbers[i] + " ");
        }
//также можно вывести массив используя метод toString
//System.out.println(Arrays.toString(arrayNumbers));
    }
}