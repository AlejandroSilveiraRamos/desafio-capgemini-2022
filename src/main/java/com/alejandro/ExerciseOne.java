package com.alejandro;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de caracteres: ");
        int result = scanner.nextInt();
        
        System.out.println("");

        printSolution(result);
        scanner.close();
    }

    public static void printSolution(int number) {
        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= number - i; j++) {
                /** Inserindo um caractere vazio para N quantidades de caracteres */
                System.out.print(' ');
            }
            for (int j = number - i + 1; j <= number; j++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }
}