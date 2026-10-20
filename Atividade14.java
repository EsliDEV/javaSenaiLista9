package AtividadeLista9For;
import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite um digito: ");
            int number = sc.nextInt();
            if (number > 0) {
                soma = soma + number;
            }
        }
        System.out.println("A soma dos positivos e: " + soma);
    }
}