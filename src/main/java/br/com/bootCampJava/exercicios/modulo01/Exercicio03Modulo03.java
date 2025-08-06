package br.com.bootCampJava.exercicios.modulo01;

/* 03 - Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela
        fórmula: área=base X altura */

import java.util.Scanner;

public class Exercicio03Modulo03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a altura do retângulo: ");
        double altura = in.nextDouble();

        System.out.println("Digite a base do retângulo: ");
        double base = in.nextDouble();

        double area = base * altura;
        System.out.println("A área do retângulo é: " + area);
        in.close();
    }
}

