import java.util.Scanner;

public class exercicio14 {

        public static void main(String[] args) {
        int a, b;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        a = entrada.nextInt();
        System.out.println("Digite o valor de B: ");
        b = entrada.nextInt();

    
        int novoA = b;
        int novoB = a;
      
    
        System.out.println("O novo valor de A é: "+ novoA);
        System.out.println("O novo valor de B é: "+ novoB);

        
        entrada.close();


    }
}
