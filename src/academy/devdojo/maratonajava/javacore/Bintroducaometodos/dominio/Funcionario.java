package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario1;
    public double salario2;
    public double salario3;

    public void imprime() {
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Salario 1: "+salario1+", Salario 2: "+salario2+" e Salario 3: "+salario3);
    }
    public void mediaResultado() {
        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("Media: "+media);
    }

}
