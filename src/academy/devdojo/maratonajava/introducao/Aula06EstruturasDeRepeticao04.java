package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        int valorDoCarro = 16300;
        int vezes = 0;
        int parcela = 0;

        // Loop para encontrar o número máximo de vezes
        for (int i = 1; i <= 60; i++) { // supondo que o parcelamento vá até 60 vezes
            int novaParcela = valorDoCarro / i;
            if (novaParcela >= 1000) {
                vezes = i;
                parcela = novaParcela;
            } else {
                break;
            }
        }

        System.out.println("Quantidade de vezes que é possível parcelar: " + vezes);
        System.out.println("Valor da parcela: " + parcela);
    }
}
