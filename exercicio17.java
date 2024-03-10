import java.util.Scanner;

public class exercicio17 {
                public static void main(String[] args) {
        double n ,z, y;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("QUantas canetas você comprou? ");
        n = entrada.nextDouble();
        System.out.println("Qual valor de nota vc usou para pagar? ");
        z = entrada.nextDouble();
        System.out.println("Qual foi o troco? ");
        y = entrada.nextDouble();

    
        double precoCaneta = (z - y)/ n;
            
    
        System.out.println("Cada canta saiu por: R$ "+ precoCaneta);
            
        entrada.close();


    }
}
