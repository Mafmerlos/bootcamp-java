package br.com.bootCampJava.exercicios.modulo03.exercicio02;

public class TesteCarro {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.ligar();
        meuCarro.exibirStatus();

        meuCarro.trocarMarcha(1);
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.exibirStatus();

        meuCarro.virar("direita");

        meuCarro.diminuirVelocidade();
        meuCarro.diminuirVelocidade();

        meuCarro.trocarMarcha(0);
        meuCarro.desligar();
        meuCarro.exibirStatus();
    }
}