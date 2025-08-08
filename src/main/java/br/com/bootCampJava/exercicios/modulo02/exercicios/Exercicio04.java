package br.com.bootCampJava.exercicios.modulo02.exercicios;

import java.util.Scanner;

/*
    Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero Inicial: ");
        int numero = in.nextInt();

        while(true){
            System.out.println("Digite outro numero: ");
            int numero2 = in.nextInt();

            if(numero2 < numero){
                System.out.println("Nao pode ser menor que o primeiro numero");
                continue;
            }
            if(numero2 % numero != 0){
                System.out.println("O resto da divisão é doferente de zero. Encerrando...");
                break;
            }
        }
        in.close();
    }
}
