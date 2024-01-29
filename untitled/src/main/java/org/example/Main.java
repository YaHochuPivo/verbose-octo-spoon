package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        try {

                Scanner scan = new Scanner(System.in);


                PrintWriter pw = new PrintWriter("students.txt");

                for(int i = 1; i < count + 1; ++i) {
                    System.out.println("Введите информацию о студенте " + i + ":");
                    System.out.print("Имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Возраст: ");
                    int age = scanner.nextInt();
                    System.out.print("Средний балл: ");
                    double averagegrade = scanner.nextDouble();
                    scanner.nextLine();
                    String studentData = "Имя: " + name + ", Возраст: " + age + ", Средний балл: " + averagegrade + "\n";
                    pw.write(studentData);
                }

                pw.close();


            System.out.println("Данные успешно записаны в файл students.txt.");
        } catch (Exception var14) {
            System.out.println("Ошибка при записи данных в файл.");
        }

    }
}
