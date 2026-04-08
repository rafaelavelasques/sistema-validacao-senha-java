package A1;

import java.util.Scanner;

public class A1_2 {
    static void main(String[] args) {

        int senha = 12345;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        int valor = leitor.nextInt();

        while(valor!=senha){
            System.out.println("Senha invalida, tente novamente");
            System.out.println("Digite sua senha: ");
            valor = leitor.nextInt();
        }
        if(valor==senha){
            System.out.println("Acesso permitido");
        }
    }
}
