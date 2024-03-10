import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        double degrauX, alturaSubida;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual a altura de cada degrau da escada? ");
        degrauX = entrada.nextDouble();
        System.out.println("E qual altura vc deseja subir? ");
        alturaSubida = entrada.nextDouble();
       
        double qtddegraus = alturaSubida/degrauX;
            
    
        System.out.println("Voce devera subir: "+ qtddegraus+" degraus");
            
        entrada.close();


    }
}
