import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class Task002_1 {
    public static void main(String[] args) throws Exception {
        File log = new File("Log1.txt");
        try (PrintWriter writer = new PrintWriter(new FileWriter(log, true))) {
            LocalDate data = LocalDate.now();
            LocalTime time = LocalTime.now();
            Scanner in = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int a = in.nextInt();
            System.out.print("Введите второе число: ");
            int b = in.nextInt();
            System.out.print("Введите выражение (+, -, *, /): ");
            String expression = in.next();
            switch (expression) {
                case "+":
                    System.out.printf("Сумма: %s", Sum(a, b));
                    writer.append("Вызвана функция Sum, " + data + ", " + time + "\n");
                    break;
                case "-":
                    System.out.printf("Разность: %s", Sub(a, b));
                    writer.append("Вызвана функция Sub, " + data + ", " + time + "\n");
                    break;
                case "*":
                    System.out.printf("Произведение: %s", Mult(a, b));
                    writer.append("Вызвана функция Mult, " + data + ", " + time + "\n");
                    break;
                case "/":
                    System.out.printf("Частное: %s", Div(a, b));
                    writer.append("Вызвана функция Div, " + data + ", " + time + "\n");
                    break;
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Sub(int a, int b) {
        return a - b;
    }

    public static int Mult(int a, int b) {
        return a * b;
    }

    public static int Div(int a, int b) {
        return a / b;
    }
}
