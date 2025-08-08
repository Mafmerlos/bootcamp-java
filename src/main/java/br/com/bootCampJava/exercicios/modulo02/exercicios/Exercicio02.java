package br.com.bootCampJava.exercicios.modulo02.exercicios;
/*
 Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:

    Se for menor ou igual a 18,5 "Abaixo do peso";
    se for entre 18,6 e 24,9 "Peso ideal";
    Se for entre 25,0 e 29,9 "Levemente acima do peso";
    Se for entre 30,0 e 34,9 "Obesidade Grau I";
    Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
    Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";

 */


import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com seu peso: ");
        double peso =  in.nextDouble();
        System.out.println("Entre com sua altura: ");
        double altura =  in.nextDouble();
        double imc = peso / (altura * altura);
        if (imc <= 18.5) {
            System.out.println("Abaixo do Peso");
        }  else if (imc > 18.5 && imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade Grau II (Severa)");
        } else  if (imc >= 40) {
            System.out.println("Obesidade Grau III (Mórbida) ");
        }

    }

}
