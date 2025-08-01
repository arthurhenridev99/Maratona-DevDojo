package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 1800;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condiçoes, mas vou ter!";
        // Operador Ternário: (condição) ? verdadeiro : falso
        String resultado;
        if(salario > 5000){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}
