package br.com.bootCampJava.exercicios.modulo02.exercicios;

import java.util.Scanner;

/*
 *  Um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com um numero para saber a tabuada: ");
        int numero = in.nextInt();
        for(int i = 1; i <= 10; i++) {
             int tabuada = numero * i;
            System.out.println( numero + " x " + i + " = " + tabuada);

        }
    }

}
