package br.com.bootCampJava.exercicios.modulo03.exercicio03;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Bolota");
        MaquinaBanho maquina = new MaquinaBanho();

        maquina.exibirStatus();

        for(int i=0;i<5;i++){
            maquina.abastecerComAgua();
        }
        maquina.abastecerComShampoo();
        maquina.colocarPet(pet);
        maquina.darBanho();
        maquina.retirarPet();
        maquina.exibirStatus();
        System.out.println("---------------");

        MaquinaBanho maquina2 = new MaquinaBanho();
        Pet pet2 = new Pet("Faisca");
        maquina2.exibirStatus();
        maquina2.colocarPet(pet2);
        maquina2.darBanho();
        maquina2.retirarPet();
        maquina2.exibirStatus();

        Pet pet3 = new Pet("Thor");
        maquina2.colocarPet(pet3);
        maquina2.limparMaquina();
        maquina2.abastecerComAgua();
        maquina2.abastecerComAgua();
        maquina2.abastecerComShampoo();
        maquina2.limparMaquina();
        maquina2.exibirStatus();


    }








}
