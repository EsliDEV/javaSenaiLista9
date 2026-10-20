package AtividadeLista9For;

public class Atividade16 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println("Os 10 primeiros numeros de Fibonacci:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(a);
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}