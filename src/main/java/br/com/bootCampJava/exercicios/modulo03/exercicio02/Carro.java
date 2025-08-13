package br.com.bootCampJava.exercicios.modulo03.exercicio02;

public class Carro {

    boolean ligado;
    int velocidade;
    int marcha;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void ligar() {
        if (this.ligado) {
            System.out.println("O carro já está ligado.");
        } else {
            this.ligado = true;
            System.out.println("Carro foi ligado.");
        }
    }

    public void desligar() {
        if (!this.ligado) {
            System.out.println("O carro já está desligado.");
            return;
        }

        if (this.velocidade == 0 && this.marcha == 0) {
            this.ligado = false;
            System.out.println("Motor desligado.");
        } else {
            System.out.println("Não pode desligar agora. Pare o carro e coloque em ponto morto.");
        }
    }

    public void acelerar() {
        if (!this.ligado) {
            System.out.println("Primeiro, ligue o carro.");
            return;
        }

        if (this.marcha == 0) {
            System.out.println("Você não pode acelerar em ponto morto.");
            return;
        }

        if (this.velocidade < 120) {
            this.velocidade = this.velocidade + 1;
            System.out.println("Velocidade: " + this.velocidade + " km/h");
        } else {
            System.out.println("Velocidade máxima.");
        }
    }

    public void diminuirVelocidade() {
        if (!this.ligado) {
            System.out.println("Primeiro, ligue o carro.");
            return;
        }

        if (this.velocidade > 0) {
            this.velocidade = this.velocidade - 1;
            System.out.println("Velocidade: " + this.velocidade + " km/h");
        } else {
            System.out.println("Carro parado.");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (!this.ligado) {
            System.out.println("Primeiro, ligue o carro.");
            return;
        }

        if (this.marcha + 1 == novaMarcha || this.marcha - 1 == novaMarcha || novaMarcha == 0) {
            if (novaMarcha == 1 && this.velocidade > 20) {
                System.out.println("Velocidade alta para 1ª marcha.");
            } else if (novaMarcha == 2 && (this.velocidade < 21 || this.velocidade > 40)) {
                System.out.println("Velocidade errada para a 2ª marcha.");
            } else if (novaMarcha == 3 && (this.velocidade < 41 || this.velocidade > 60)) {
                System.out.println("Velocidade errada para a 3ª marcha.");
            } else if (novaMarcha == 4 && (this.velocidade < 61 || this.velocidade > 80)) {
                System.out.println("Velocidade errada para a 4ª marcha.");
            } else if (novaMarcha == 5 && (this.velocidade < 81 || this.velocidade > 100)) {
                System.out.println("Velocidade errada para a 5ª marcha.");
            } else if (novaMarcha == 6 && (this.velocidade < 101 || this.velocidade > 120)) {
                System.out.println("Velocidade errada para a 6ª marcha.");
            } else {
                this.marcha = novaMarcha;
                if (this.marcha == 0) {
                    System.out.println("Carro em ponto morto.");
                } else {
                    System.out.println("Engatou a " + this.marcha + "ª marcha.");
                }
            }
        } else {
            System.out.println("Troque uma marcha de cada vez.");
        }
    }

    public void virar(String direcao) {
        if (!this.ligado) {
            System.out.println("Primeiro, ligue o carro.");
            return;
        }

        if (this.velocidade >= 1 && this.velocidade <= 40) {
            System.out.println("Virando para " + direcao + "...");
        } else {
            System.out.println("Muito rápido para virar agora.");
        }
    }

    public void exibirStatus() {
        String status;
        if (this.ligado) {
            status = "Ligado";
        } else {
            status = "Desligado";
        }

        String marchaAtual;
        if (this.marcha == 0) {
            marchaAtual = "Ponto Morto";
        } else {
            marchaAtual = this.marcha + "ª";
        }

        System.out.println("---");
        System.out.println("Status: " + status);
        System.out.println("Velocidade: " + this.velocidade + " km/h");
        System.out.println("Marcha: " + marchaAtual);
        System.out.println("---");
    }
}