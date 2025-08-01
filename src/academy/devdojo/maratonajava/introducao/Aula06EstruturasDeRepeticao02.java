package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {

        // Imprima todos os numeros pares de 0 ate 1000000

        for(int x = 0; x <= 1000000; x++) {
            if(x % 2 == 0) {
                System.out.println(x);
            }
        }
    }
}
