package AtividadeLista9For;
import java.util.Scanner;
public class Atividade13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,cont,cont2;
        System.out.println("digite um numero");
        num = sc.nextInt();
        cont2 = 0;
        for (cont=0;cont<=4;cont++){

            if (num%2==0){
                System.out.println("numero par ");
                cont2++;
            }
            System.out.println("até este momento foram "+ cont2+" numeros pares digitados");

            System.out.println("digite o proximo numero");
            num = sc.nextInt();


        }
    }


}
