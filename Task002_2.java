import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Task002_2 {
    public static void main(String[] args) {
        File log = new File("Log2.txt");
        try (PrintWriter writer = new PrintWriter(new FileWriter(log, true))) {
            LocalDate data = LocalDate.now();
            LocalTime time = LocalTime.now();
            Scanner in = new Scanner(System.in);
            char[] array = { 0, 4, 47, 77, 75, 7, 87, 27, 37, 2, 73 };
            char temp = 0;
            for (int i = 0; i < array.length - 1; i++) {
                writer.append("Проход №" + i + "\n");
                for (int j = 0; j < array.length - 1; j++) {
                    if ((int) array[j] > (int) array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        writer.append(
                                "Итерация: " + j + ", Значение:" + (int) array[j] + ", " + data + ", " + time + "\n");
                    } else
                        writer.append(
                                "Итерация: " + j + ", Значение:" + (int) array[j] + ", " + data + ", " + time + "\n");
                }
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
