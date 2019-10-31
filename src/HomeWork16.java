import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;


/*
Задача №16: Выгрузка данных из файла на экран
Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
*/
public class HomeWork16 {
    public static void main(String[] args) {
        String s;
        int linesCount = 0;
        try (BufferedReader br =
                     new BufferedReader(new FileReader("C:\\Users\\vshishkalov\\a.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                LineNumberReader l = new LineNumberReader(new FileReader("C:\\Users\\vshishkalov\\a.txt"));
                linesCount++;
            }
            System.out.println(linesCount);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}