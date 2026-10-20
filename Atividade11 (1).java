package AtividadeLista9For;
import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um numero: ");
            int number = sc.nextInt();
            if (i == 1) {
                maior = number;
                menor = number;
            } else {
                if (number > maior) {
                    maior = number;
                }
                if (number < menor) {
                    menor = number;
                }
            }
        }
        System.out.println("O maior numero e: " + maior);
        System.out.println("O menor numero e: " + menor);
    }
}