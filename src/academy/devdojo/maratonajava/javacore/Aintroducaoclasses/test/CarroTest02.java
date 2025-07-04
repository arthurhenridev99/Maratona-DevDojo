package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest02 {
    public static void main(String[] args) {
        Carro carro2 = new Carro();
        carro2.nome = "Audi";
        carro2.modelo = "A3";
        carro2.ano = 2017;

        System.out.println("A "+carro2.nome+" do modelo "+carro2.modelo+
                " do ano "+carro2.ano+" é um carro que tenho sonho de ter!");
    }
}
