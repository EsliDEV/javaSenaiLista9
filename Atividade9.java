package AtividadeLista9For;
import java.util.Scanner;
public class Atividade9 {
    public static void main(String[] args) {
        int num,fat,cont=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero que voce quer o fatorial");
        num = sc.nextInt();
        fat=num;
        for (cont=num-1;cont>0;cont--){
            fat=fat*cont;
            System.out.println(fat);

        }
    }
}
