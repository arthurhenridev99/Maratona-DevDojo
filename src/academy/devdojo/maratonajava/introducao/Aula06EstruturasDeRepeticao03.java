package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {

        // Imprima os primeiros 25 numeros  de um dado valor. Por exemplo, 50

        int valorMax = 50;
        for (int x = 0; x <= valorMax; x++) {
            if (x > 25) {
                break;
            }
            System.out.println(x);
        }
    }
}
