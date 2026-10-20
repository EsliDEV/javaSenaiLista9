package AtividadeLista9For;
import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprovados = 0;
        int reprovados = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a nota do aluno " + i + "°: ");
            double nota = sc.nextDouble();
            if (nota >= 7) {
                aprovados++;
            } else {
                reprovados++;
            }
        }
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);

    }
}