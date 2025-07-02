package academy.devdojo.maratonajava.introducao;

/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {

        String name = "Arthur";
        String adress = "Avenida Brasil, nº 1138";
        double salario = 2010.00;
        String date = "02/05/2025";
        String relatorio = "Eu "+name+", morando no "+adress+", confirmo que recebi o salario de "+salario+", na data "+date;

        System.out.println(relatorio);

    }
}