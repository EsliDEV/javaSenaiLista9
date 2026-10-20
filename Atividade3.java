package AtividadeLista9For;

import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numeber = sc.nextInt();
        System.out.println("Iniciando a contagem...");
        for(int i = 0; i <= numeber; i++){
            System.out.println(i);

        }
    }
}
