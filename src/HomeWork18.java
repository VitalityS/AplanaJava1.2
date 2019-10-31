import java.io.*;

/*
Задача №18: Выгрузка данных из файла, проверка и перезапись
Необходимо написать программу, которая будет выводить на экран
текстовые данные из файла .txt, а потом в этот же файл перезаписывать текстовые данные,
введенные вручную.
Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
*/
public class HomeWork18 {
    public static void main(String[] args) {
        //в переменную передаются строки из исходного файла "a.txt"
        String s;
        //в переменную передаются строки введенные в консоли
        String str;
        //хранит количество строк в исходном файле "a.txt"
        int linesCountOut = 0;
        //хранит количество строк введённых с консоли
        int linesCountIn = 0;
        //открывается поток чтения  из файла "a.txt"
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("C:\\Users\\vshishkalov\\a.txt"))) {
            //в переменную s передается значение каждой прочтенной строки из файла "a.txt"
            while ((s = bufferedReader.readLine()) != null) {
                //пока строка не null - вывести её в консоль
                System.out.println(s);
                //считает кол-во строк в исходном файле "a.txt"
                linesCountOut++;
            }
            //закрываем поток чтения
            bufferedReader.close();
            System.out.println("_________________________\n" +
                    "Количество строк в исходном файле: " + linesCountOut);
            //открывается поток чтения из консоли
            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(System.in));
            System.out.println("Признак конца ввода - строка 'stop'\n_________________________ ");
            //открывается поток записи в файл "a.txt"
            try (FileWriter fw = new FileWriter("C:\\Users\\vshishkalov\\a.txt")) {
                do {
                    System.out.println(": ");
                    str = br.readLine();


                    if (str.compareTo("stop") == 0){
                        System.out.println("Запись остановлена по команде \"stop\"" +
                                "\nколичество строк в файле: " + linesCountIn);
                    break;}
                    str = str + "\r\n"; //добавить символы перевода сроки
                    fw.write(str);
                    //считает кол-во введенных строк
                    linesCountIn++;
                    //если количество новых строк столько же, сколько в исходном файле, выйти из цикла записи строк.
                    if (linesCountIn == linesCountOut){
                        System.out.println("Запись приостановлена,\nколичество строк должно быть столько же, \nсколько и в исходном файле: " + linesCountIn);
                        break;
                    }
                } while (str.compareTo("stop") != 0);
                System.out.println("linesCountIn:" + linesCountIn);
                //закрываем поток записи
                fw.close();
                //закрываем поток чтения
                br.close();

            } catch (IOException exc) {
                System.out.println("Ошибка ввода-вывода: " + exc);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }

    }
}