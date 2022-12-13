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
            System.out.print("������� ������ �����: ");
            int a = in.nextInt();
            System.out.print("������� ������ �����: ");
            int b = in.nextInt();
            System.out.print("������� ��������� (+, -, *, /): ");
            String expression = in.next();
            switch (expression) {
                case "+":
                    System.out.printf("�����: %s", Sum(a, b));
                    writer.append("������� ������� Sum, " + data + ", " + time + "\n");
                    break;
                case "-":
                    System.out.printf("��������: %s", Sub(a, b));
                    writer.append("������� ������� Sub, " + data + ", " + time + "\n");
                    break;
                case "*":
                    System.out.printf("������������: %s", Mult(a, b));
                    writer.append("������� ������� Mult, " + data + ", " + time + "\n");
                    break;
                case "/":
                    System.out.printf("�������: %s", Div(a, b));
                    writer.append("������� ������� Div, " + data + ", " + time + "\n");
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
