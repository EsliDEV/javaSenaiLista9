package AtividadeLista9For;
import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        int divisores = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            System.out.println(num + " e primo");
        } else {
            System.out.println(num + " nao e primo");
        }

    }
}