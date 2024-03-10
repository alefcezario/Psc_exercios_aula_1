import java.util.Scanner;

public class exercicio11 {
                  public static void main(String[] args) {
        int notaUm;
        int notaDois;
        int notaTres;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite sua primeira nota: ");
        notaUm = entrada.nextInt();
        System.out.println("Digite sua segunda nota: ");
        notaDois = entrada.nextInt();
        System.out.println("Agora por ultimo digite sua terceira nota: ");
        notaTres = entrada.nextInt();
    
        int mediaSimples = (notaUm+notaDois+notaTres)/3;

        System.out.println("Sua média simples é: "+ mediaSimples);
         
         entrada.close();


    }
}
