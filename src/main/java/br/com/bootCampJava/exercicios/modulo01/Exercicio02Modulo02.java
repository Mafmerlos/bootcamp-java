package br.com.bootCampJava.exercicios.modulo01;

/* 02 - Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
        fórmula: área=lado X lado */

import java.util.Scanner;

public class Exercicio02Modulo02 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Entre com o tamanho do lado do quadrado: ");
        double lado = sc.nextInt();
        double area =  lado * lado;
        System.out.println("A área do quadrado é: " + area);
        sc.close();
    }
}