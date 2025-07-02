package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        // dado um determinado salário anual, qual o valor de que precisarei pagar:
        // de 0 ate 34.712 - 9.70%
        // de 34.713 ate 68.507 - 37.35%
        // de 65.508 - 49,50%

        double salario = 70000;
        double taxa1 = 9.70 / 100;
        double taxa2 = 37.35 / 100;
        double taxa3 = 49.50 / 100;
        double valorImposto;
        
        if (salario > 0 && salario <= 34712) {
            valorImposto = salario * taxa1;
        }else if (salario >= 34713 && salario <= 68507) {
            valorImposto = salario * taxa2;
        } else {
            valorImposto = salario * taxa3;
        }
        System.out.println(valorImposto);
    }
}