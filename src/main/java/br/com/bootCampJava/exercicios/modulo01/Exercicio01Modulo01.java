package br.com.bootCampJava.exercicios.modulo01;

/* 01 - Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos" */

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio01Modulo01 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        final int anoAtual = date .getYear();

        System.out.println("Digite seu nome: ");
        String nome = in.nextLine();
        System.out.println("Digite seu ano de nascimento: ");
        final int anoNasc = in.nextInt();

        int calcularAnoAtual = anoAtual - anoNasc;
        System.out.println("Olá " + nome + " você tem " +  calcularAnoAtual + " anos.");
        in.close();
    }
}

