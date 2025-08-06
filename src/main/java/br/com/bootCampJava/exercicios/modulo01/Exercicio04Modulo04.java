package br.com.bootCampJava.exercicios.modulo01;

/* 04 - Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas */

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio04Modulo04{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int anoAtual = LocalDate.now().getYear();

        System.out.println("Digite o nome 1: ");
        String nome1 = in.nextLine();
        System.out.println("Digite seu ano de nascimento 1: ");
        int ano1 = in.nextInt();
        in.nextLine();

        System.out.println("Digite o nome 2: ");
        in.nextLine();
        String nome2 = in.nextLine();
        System.out.println("Digite seu ano de nascimento 2: ");
        int ano2 = in.nextInt();
        int idade1 = anoAtual - ano1;
        int idade2 = anoAtual - ano2;
        int diferenca = idade1 - idade2;

        System.out.println("Nome 1: " + nome1 + "\n Idade 1: " + idade1);
        System.out.println("Nome 2: " + nome2 + "\n Idade 2: " + idade2);
        System.out.println("Diferenca de idade : " + diferenca);
        in.close();
    }
}