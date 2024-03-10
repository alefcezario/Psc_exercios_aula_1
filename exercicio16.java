import java.util.Scanner;

public class exercicio16 {
            public static void main(String[] args) {
        double distancia, combustivel;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Quantos quilometros foram percorridos? ");
        distancia = entrada.nextDouble();
        System.out.println("Quantos litros foram consumidos na viagem? ");
        combustivel = entrada.nextDouble();

    
        double consumoMedio = distancia/combustivel;
            
    
        System.out.println("Seu consumo medio de combustivel é: "+ consumoMedio);
            
        entrada.close();


    }
}
