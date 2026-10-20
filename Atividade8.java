package AtividadeLista9For;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Digite um numero: ");
        number = sc.nextInt();
        for(int cont = 1; cont <= 10&& number!=0; cont++){
            System.out.println("tabuada de"+number+ "é: ");
            System.out.println(number+"X"+cont+"=");
            System.out.println(number*cont);
            if(cont==10){
                System.out.println("digite o proximo numero:(0 para sair)");
                number = sc.nextInt();
                cont=0;
            };
        }
    }
}
