package tiposprimitivos;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um valor: ");
        int num1 = scan.nextInt();

        System.out.println("Digite outro valor: ");
        int num2 = scan.nextInt();

        int soma = num1 + num2;
        System.out.println("Valor total: " + soma);

        scan.close();

    }
    
}