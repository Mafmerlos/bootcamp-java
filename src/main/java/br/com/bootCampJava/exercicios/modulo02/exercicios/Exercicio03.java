package br.com.bootCampJava.exercicios.modulo02.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean valor;

        System.out.println("Entre com o primeiro numero");
        int numero = in.nextInt();

        System.out.println("Entre com o segundo numero maior que o primeiro: ");
        int numero2 = in.nextInt();

        if (numero > numero2) {
            System.out.println("Numero 2 precisa sera maior que o primeiro numero");
            return;
        }

        System.out.println("Escolha entre par ou impar (p/i): ");
        String escolha = in.next();

        if (escolha.equalsIgnoreCase("p")) {
            for (int i = numero2; i >= numero; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else if (escolha.equalsIgnoreCase("i")) {
            for (int i = numero2; i >= numero; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Opcao invalida. Escolha 'p' ou 'i'.");
        }

        in.close();
    }
}