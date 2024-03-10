import java.util.Scanner;

public class exercicio9 {
              public static void main(String[] args) {
        double raio;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o raio para calcularmos a area de um circulo: ");
        raio = entrada.nextDouble();

        double area = Math.PI * raio*raio;

        System.out.println("A área do circulo com esse raio é: "+ area);
         
         entrada.close();


    }
}
