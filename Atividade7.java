package AtividadeLista9For;
import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int atual = 0,total;
        System.out.println("digite um numero limite para o programa:");
        total = sc.nextInt();
        for (int i = 1; i <total+1; i++) {
            atual += i;

            System.out.println("o numero " + i + " mais o a soma do numero anterior: " + (i - 1) + " é igual a: " + atual);

        }
    }
}
