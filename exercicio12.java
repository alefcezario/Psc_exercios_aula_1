import java.util.Scanner;

public class exercicio12 {
                      public static void main(String[] args) {
        int numeroDigitado;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        numeroDigitado = entrada.nextInt();
    
    
        int antecessor = numeroDigitado-1;
        int sucessor = numeroDigitado+1;

        System.out.println("O antecessor do numero digitado é: "+ antecessor);
        System.out.println("O antecessor do numero digitado é: "+ sucessor);
        
        entrada.close();


    }
}
