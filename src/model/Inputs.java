package model;

import java.util.Scanner;

public class Inputs {
    public static int lerValor(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public static String lerTipo(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.next();
    }

    public static String lerNome(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.next();
    }

    public static String lerData(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.next();
    }

    public static double lerPeso(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public static double lerAltura(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public static String lerEscolha(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.next();
    }


}