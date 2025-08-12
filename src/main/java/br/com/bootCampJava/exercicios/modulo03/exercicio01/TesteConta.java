package br.com.bootCampJava.exercicios.modulo03.exercicio01;

public class TesteConta {

    public static void main(String[] args) {

        System.out.println("Iniciando teste 1...");
        Conta conta1 = new Conta(1000.0);
        System.out.println("Saldo inicial: " + conta1.getSaldo());
        System.out.println("Limite: " + conta1.getLimite());
        conta1.sacar(200.0);
        System.out.println("Saldo apos saque de 200: " + conta1.getSaldo());
        conta1.depositar(300.0);
        System.out.println("Saldo apos deposito de 300: " + conta1.getSaldo());
        System.out.println("Fim do teste 1.");

        System.out.println("\nIniciando teste 2...");
        Conta conta2 = new Conta(100.0);
        System.out.println("Saldo inicial: " + conta2.getSaldo());
        System.out.println("Limite: " + conta2.getLimite());

        System.out.println("Sacando 120 (para usar o cheque especial)...");
        conta2.sacar(120.0);
        System.out.println("Saldo apos saque: " + conta2.getSaldo());
        System.out.println("Esta usando o limite? " + conta2.estaUsandoChequeEspecial());

        System.out.println("Depositando 300 (para cobrir o limite e acionar a taxa)...");
        conta2.depositar(300.0);
        System.out.println("Saldo final: " + conta2.getSaldo());
        System.out.println("Fim do teste 2.");

        System.out.println("\nIniciando teste 3 (pagar boleto)...");
        System.out.println("Saldo conta 1 antes do boleto: " + conta1.getSaldo());
        conta1.pagarBoleto(450.0);
        System.out.println("Saldo conta 1 depois do boleto: " + conta1.getSaldo());
        System.out.println("Fim do teste 3.");
    }
}