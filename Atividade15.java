package AtividadeLista9For;
import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        for (int i = 1; i <= 8; i++) {
            System.out.print("Digite um digito: ");
            int number = sc.nextInt();
            if (number > 50) {
                contador++;
            }
        }
        System.out.println("Apenas " + contador + " Digitos são maiores que 50: ");
    }
}