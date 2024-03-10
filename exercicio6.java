import java.util.Scanner;

public class exercicio6 {
        public static void main(String[] args) {
        int idade;
        int diasano = 365;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Quantos anos voce tem? ");
        idade = entrada.nextInt();

        int diasvividos = idade * diasano;

        System.out.println("Voce ja viveu "+ diasvividos+" dias!");
         
         entrada.close();


    }
}
