package br.com.bootCampJava.exercicios.modulo02.desafio;

/*
 * =================================================================================
 * DESAFIO DE CÓDIGO: CÁLCULO DE DESCONTO
 * =================================================================================
 *
 * DESCRIÇÃO:
 * Uma loja online deseja calcular o valor final de um produto após aplicar um
 * desconto percentual.
 *
 * ENTRADA:
 * - A primeira linha contém o valor original do produto (double).
 * - A segunda linha contém a porcentagem de desconto (double).
 *
 * SAÍDA:
 * - Se o desconto for válido (entre 0 e 100, inclusive), deverá retornar o valor final
 * do produto, formatado com exatamente duas casas decimais.
 * - Caso a porcentagem de desconto seja inválida (menor que 0 ou maior que 100),
 * deverá retornar a mensagem "Desconto invalido".
 *
 * EXEMPLOS:
 * | Entrada       | Saída              |
 * |---------------|--------------------|
 * | 100           | 90.00              |
 * | 10            |                    |
 * |---------------|--------------------|
 * | 250           | 212.50             |
 * | 15            |                    |
 * |---------------|--------------------|
 * | 80            | 76.00              |
 * | 5             |                    |
 * |---------------|--------------------|
 * | 90            | Desconto invalido  |
 * | 150           |                    |
 *
 * =================================================================================
 *
 */


import java.util.Scanner;
import java.text.DecimalFormat;
public class DesafioModulo02Parte02 {


    public class DescontoInteligente {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // TODO: Leia o valor original do produto:
            double valor = scanner.nextDouble();

            // TODO: Leia a porcentagem de desconto:
            double porcentagem = scanner.nextDouble();

            // TODO: Verifique se o desconto está dentro de um intervalo válido:
            if(porcentagem<0 || porcentagem>100){

                System.out.println("Desconto invalido");
            }
            else {

                // TODO: Calcule o valor final do produto:
                double valorFinal =valor - (valor * (porcentagem/100));

                // Formata e exibe o valor com duas casas decimais
                DecimalFormat df = new DecimalFormat("0.00");
                System.out.println(df.format(valorFinal));
            }

            scanner.close();
        }
    }
}
