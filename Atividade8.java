package AtividadeLista9For;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Digite um numero: ");
        number = sc.nextInt();
        for(int cont = 1; cont <= 10; cont++){
            System.out.println("A tabuada é: ");
            System.out.println(number*cont);
        }
    }
}
