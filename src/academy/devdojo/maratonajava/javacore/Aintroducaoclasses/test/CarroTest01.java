package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Bmw";
        carro.modelo = "M5";
        carro.ano = 2018;

        System.out.println("A "+carro.nome+" do modelo: "+carro.modelo+" é um carrão. Fabricado em "+carro.ano);

    }
}
