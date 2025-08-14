package br.com.bootCampJava.exercicios.modulo03.exercicio03;

public class Pet {
    private String nome;
    private boolean estaSujo;

    public Pet(String nome) {
        this.nome = nome;
        this.estaSujo = true;
    }

    public boolean isEstaSujo() {
        return this.estaSujo;
    }

    public void setEstaSujo(boolean estaSujo) {
        this.estaSujo = estaSujo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}