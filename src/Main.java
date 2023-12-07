import java.util.Scanner;
/**
 *<h1>Cálculo de Ano Bissexto</h1>
 *<b>Note</b><p>O programa diz se o ano digitado pelo usuário é bissexto ou não.
 *
 * @author washington Pereira;
 * @version 1.0
 * @since 07/12/2023
 *
 * */

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o ano:");
        int ano = entrada.nextInt();
        if(ano %4 ==0){
            System.out.println("O ano "+ano+" é bissexto");

        }else{
            System.out.println("O ano "+ano+ " não é ano bissexto");

        }
        entrada.close();
    }
}



