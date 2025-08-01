package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01Arthur {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Arthur";
        funcionario.idade = 19;
        funcionario.salario1 = 1850;
        funcionario.salario2 = 2500;
        funcionario.salario3 = 5000;

        funcionario.imprime();
        funcionario.mediaResultado();
    }
}
