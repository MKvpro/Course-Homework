import java.util.Scanner;

public class WhatAge {
    public static void main(String[] args) {
        int age = 0;
        System.out.println("Введите AD или BC(AD - Наша эра; BC - До нашей эры) ");
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        String answer = scanner1.next();
        switch (answer) {
            case "AD":
                System.out.println("Введите год");
                while(!scanner2.hasNextInt()){
                    scanner2.next();
                    System.out.println("Введите год");
                }
                int year = scanner2.nextInt();
                for (int i = 0; i < year; ) {
                    i = i + 100;
                    age++;
                }
                System.out.println(age + " Век нашей эры");
                break;
            case "BC":
                System.out.println("Перед годом введите знак : - :");
                while(!scanner2.hasNextInt()) {
                    scanner2.next();
                    System.out.println("Введите год и перед ним знак : - :");
                }
                System.out.println("Введите год");
                year = scanner2.nextInt();
                for (int i = 0; i > year; ) {
                    i = i - 100;
                    age++;
                }
                System.out.println(age + " Век до нашей эры");
                break;
            default:
                System.out.println("Вы ввели неподходящий символ");
        }
    }
}
