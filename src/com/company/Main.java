package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyBoardInput = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = keyBoardInput.nextInt();
        System.out.print("Введите число b: ");
        int b = keyBoardInput.nextInt();
        System.out.print("Введите число c: ");
        int c = keyBoardInput.nextInt();

        a = a + b + c;
        c = a - c - b;
        b = a - c - b;
        a = a - c - b;

        System.out.println("Число a стало числом b: " + a);
        System.out.println("Число b стало числом c: " + b);
        System.out.println("Число c стало числом a: " + c);

    }
}
