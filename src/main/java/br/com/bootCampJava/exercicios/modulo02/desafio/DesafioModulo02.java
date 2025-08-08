package br.com.bootCampJava.exercicios.modulo02.desafio;
/*
 * =================================================================================
 * DESAFIO DE CÓDIGO: CÁLCULO DE FRETE
 * =================================================================================
 *
 * DESCRIÇÃO:
 * Uma empresa de logística precisa calcular o valor total de um frete com base
 * no peso da carga e no valor do frete por quilo.
 *
 * ENTRADA:
 * - O peso em quilos (double).
 * - O valor do frete por quilo (double).
 *
 * SAÍDA:
 * - O programa deverá retornar o valor total do frete, formatado com duas
 * casas decimais.
 *
 * ---------------------------------------------------------------------------------
 * EXEMPLOS
 * ---------------------------------------------------------------------------------
 * A tabela abaixo apresenta exemplos com alguns dados de entrada e suas
 * respectivas saídas esperadas. Certifique-se de testar seu programa com
 * esses exemplos e com outros casos possíveis.
 *
 * | Entrada (Peso, Valor/Kg) | Saída  |
 * |--------------------------|--------|
 * | 10                       | 50.00  |
 * | 5                        |        |
 * |--------------------------|--------|
 * | 3.5                      | 42.00  |
 * | 12                       |        |
 * |--------------------------|--------|
 * | 7                        | 52.50  |
 * | 7.5                      |        |
 * =================================================================================
 */
import java.util.Scanner;
public class DesafioModulo02 {

    public class CalculoFreteRapido {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // TODO: Leia o peso em quilos:
            double peso = scanner.nextDouble();


            // TODO: Leia o valor do frete por quilo:
            double frete = scanner.nextDouble();

            // TODO: Calcule o valor total do frete:
            double freteTotal = peso * frete;

            // TODO: Exiba o valor formatado com duas casas decimais:
            System.out.printf("%.2f \n", freteTotal);


            scanner.close();
        }
    }
}
