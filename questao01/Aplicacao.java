package questao01;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci fib = new Fibonacci();
        boolean pertence = false;

        System.out.println("Digite um número para saber se pertence a seq de Fibonacci:");
        int seq = sc.nextInt();

        for (int i = 0; i <= seq; i++) {
            if (seq == fib.proximoTermo()) {
                pertence = true;
            }
        }
        System.out.println(pertence);
    }
}
