package AtividadeLista9For;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, soma;
        double media = 0;
        soma = 0;
        for (int i = 1; i<=5; i++){
            media++;
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();
            soma += numero;
        }
        System.out.println("A media dos valores digitados é:" +soma/media);
    }
}
