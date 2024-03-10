import java.util.Scanner;

public class exercicio8 {
          public static void main(String[] args) {
        double qtdmetros;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite quantos metros deseja converter em centimetros: ");
        qtdmetros = entrada.nextDouble();

        double conversaocentimetro = qtdmetros*100;

        System.out.println("Essa quantidade de metros é igual a "+ conversaocentimetro+" centimetros");
         
         entrada.close();


    }
}
