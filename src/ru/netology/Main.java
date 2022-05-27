package ru.netology;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Расчёт индекса массы тела" +
                "\n" + "Введите вес: ");
        double weight = scanner.nextDouble();
        System.out.println("Введите рост");
        double growth = scanner.nextDouble();
        System.out.println("Результат: " + weight / ((growth / 100) * (growth / 100)) + " кг/м²");

    }
}
