import java.util.Scanner;

public class exercicio10 {
            public static void main(String[] args) {
        double temperaturaFarenheit;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual a temperatura em Farenheit que deseja converter para celsius? ");
        temperaturaFarenheit = entrada.nextDouble();
    
        double convertidaCelsius = (temperaturaFarenheit-32)/1.8;
     
    
        System.out.println("Sua temperatura em Ceusius é: "+ convertidaCelsius);

        
        entrada.close();


    }
}
