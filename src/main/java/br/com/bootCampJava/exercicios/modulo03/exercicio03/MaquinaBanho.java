package br.com.bootCampJava.exercicios.modulo03.exercicio03;

public class MaquinaBanho {

    private double nivelAgua;
    private double nivelShampoo;
    private Pet petAtual;
    private boolean maquinaSuja;

    private static final double CAPACIDADE_AGUA_MAXIMA = 30.0;
    private static final double CAPACIDADE_SHAMPOO_MAXIMA = 10.0;
    private static final double CONSUMO_AGUA_BANHO = 10.0;
    private static final double CONSUMO_SHAMPOO_BANHO = 2.0;
    private static final double CONSUMO_AGUA_LIMPEZA = 3.0;
    private static final double CONSUMO_SHAMPOO_LIMPEZA = 1.0;
    private static final double RECARGA_PADRAO = 2.0;

    public MaquinaBanho() {
        this.nivelAgua = 0;
        this.nivelShampoo = 0;
        this.petAtual = null;
        this.maquinaSuja = false;
    }

    public void darBanho() {
        if (this.petAtual == null || !this.petAtual.isEstaSujo() || this.nivelAgua < CONSUMO_AGUA_BANHO || this.nivelShampoo < CONSUMO_SHAMPOO_BANHO) {
            System.out.println("Operação não permitida.");
            return;
        }
        this.nivelAgua -= CONSUMO_AGUA_BANHO;
        this.nivelShampoo -= CONSUMO_SHAMPOO_BANHO;
        this.petAtual.setEstaSujo(false);
        System.out.println("Banho finalizado.");
    }

    public void abastecerComAgua() {
        this.nivelAgua += RECARGA_PADRAO;
        if (this.nivelAgua > CAPACIDADE_AGUA_MAXIMA) {
            this.nivelAgua = CAPACIDADE_AGUA_MAXIMA;
        }
        System.out.println("Água abastecida.");
    }

    public void abastecerComShampoo() {
        this.nivelShampoo += RECARGA_PADRAO;
        if (this.nivelShampoo > CAPACIDADE_SHAMPOO_MAXIMA) {
            this.nivelShampoo = CAPACIDADE_SHAMPOO_MAXIMA;
        }
        System.out.println("Shampoo abastecido.");
    }

    public void colocarPet(Pet petEntrando) {
        if (this.petAtual != null || this.maquinaSuja) {
            System.out.println("Operação não permitida.");
            return;
        }
        this.petAtual = petEntrando;
        System.out.println("Pet inserido.");
    }

    public void retirarPet() {
        if (this.petAtual == null) {
            System.out.println("Operação não permitida.");
            return;
        }
        if (this.petAtual.isEstaSujo()) {
            this.maquinaSuja = true;
        }
        this.petAtual = null;
        System.out.println("Pet retirado.");
    }

    public void limparMaquina() {
        if (!this.maquinaSuja || this.petAtual != null || this.nivelAgua < CONSUMO_AGUA_LIMPEZA || this.nivelShampoo < CONSUMO_SHAMPOO_LIMPEZA) {
            System.out.println("Operação não permitida.");
            return;
        }
        this.nivelAgua -= CONSUMO_AGUA_LIMPEZA;
        this.nivelShampoo -= CONSUMO_SHAMPOO_LIMPEZA;
        this.maquinaSuja = false;
        System.out.println("Máquina limpa.");
    }

    public double getNivelAgua() {
        return this.nivelAgua;
    }

    public double getNivelShampoo() {
        return this.nivelShampoo;
    }

    public boolean isOcupada() {
        return this.petAtual != null;
    }

    public boolean isMaquinaSuja() {
        return this.maquinaSuja;
    }

    public void exibirStatus() {
        System.out.println("\n--- STATUS DA MÁQUINA ---");
        System.out.printf("Nível de Água: %.2f / %.2f L%n", this.nivelAgua, CAPACIDADE_AGUA_MAXIMA);
        System.out.printf("Nível de Shampoo: %.2f / %.2f L%n", this.nivelShampoo, CAPACIDADE_SHAMPOO_MAXIMA);
        System.out.println("Máquina está suja: " + (this.maquinaSuja ? "Sim" : "Não"));
        if (isOcupada()) {
            System.out.println("Pet na máquina: " + this.petAtual.getNome());
            System.out.println("Pet está sujo: " + (this.petAtual.isEstaSujo() ? "Sim" : "Não"));
        } else {
            System.out.println("Pet na máquina: Nenhum");
        }
        System.out.println("--------------------------\n");
    }
}