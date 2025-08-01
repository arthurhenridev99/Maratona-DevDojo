package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando Switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Domingo. Final de semama!");
                break;
            case 2:
                System.out.println("Segunda-feira. Dia útil!");
                break;
            case 3:
                System.out.println("Terça-feira. Dia útil!");
                break;
            case 4:
                System.out.println("Quarta-feira. Dia útil!");
                break;
            case 5:
                System.out.println("Quinta-feira. Dia útil!");
                break;
            case 6:
                System.out.println("Sexta-feira. Dia útil!");
                break;
            case 7:
                System.out.println("Sábado. Final de semama!");
                break;
            default:
                System.out.println("Erro! Valores disponíveis de 1 ao 7!");
                break;
        }
    }
}
