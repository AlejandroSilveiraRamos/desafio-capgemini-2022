package com.alejandro;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExerciseTwo {
    private static final int SECURE_PASSWORD_LENGTH = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a senha: ");

        String password = scanner.nextLine();

        isPasswordSafe(password);

        scanner.close();
    }

    public static boolean isPasswordSafe(String password) {
        Pattern characterPattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher charactereMatcher = characterPattern.matcher(password);

        Pattern numberPattern = Pattern.compile("([0-9])");
        Matcher numberMatcher = numberPattern.matcher(password);

        boolean isValid = true;

        /** Verifica caracteres especiais */
        if (!charactereMatcher.find()) {
            isValid = false;
            System.out.println("A senha deve conter no minimo um caractere especial.");
        }

        /** Verifica o tamanho da senha */
        if (password.length() < SECURE_PASSWORD_LENGTH) {
            isValid = false;

            int characteresToBeAdded = SECURE_PASSWORD_LENGTH - password.length();
            System.out.println("A senha deve conter no minimo seis digitos. Adicione mais " + characteresToBeAdded
                    + " caracteres.");
        }

        /** Verifica se há digitos */
        if (!numberMatcher.find()) {
            isValid = false;
            System.out.println("A senha deve conter no minimo um numero.");
        }

        /** Verifica caracter maiúsculo */
        if (password.equals(password.toUpperCase())) {
            isValid = false;
            System.out.println("A senha deve conter no minimo um caractere minusculo.");
        }

        /** Verifica caracter minúsculo */
        if (password.equals(password.toLowerCase())) {
            isValid = false;
            System.out.println("A senha deve conter no minimo um caractere maiusculo.");
        }

        return isValid;
    }
}