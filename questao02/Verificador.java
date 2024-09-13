package questao02;

import java.util.Scanner;

public class Verificador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=0;

        System.out.println("Digite uma palavra: ");
        String palavra = sc.next();

        for(int i=0; i<palavra.length(); i++){
            if( palavra.charAt(i)=='A' || palavra.charAt(i)=='a'){
                cont++;
            }
        }

        System.out.println("Número de incidência da letra A: "+cont);

    }
}
