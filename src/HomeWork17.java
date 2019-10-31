import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*Задача №17: Запись данных в файлЗадание
Необходимо написать программу, которая будет записывать текстовые данные,
введенные с экрана, в файл .txt. Запись ввести в файл до тех пор,
пока не будет введена команда стоп в консоли.
Пользователь при тестировании программы по правилу черного
ящика должен понимать, какой принцип остановки записи в файл он должен подать.
*/
public class HomeWork17 {
    private static Object IOException;

    public static void main(String[] args) {
        String str;
        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'stop' ");

        try(FileWriter fw = new FileWriter("C:\\Users\\vshishkalov\\a.txt"))
        {
            do {
                System.out.println(": ");
                str = br.readLine();

                if(str.compareTo("stop") == 0) break;
                str = str + "\r\n"; //добавить символы перевода сроки
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}