import java.util.Scanner;

public class exercico2 {
    public static void main(String[] args) {
        int x, y, resto;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor de x: ");
        x = entrada.nextInt();

        System.out.println("Digite o valor de y: ");
        y = entrada.nextInt();

        resto = x % y;

        System.out.println("o resto da divisao de x "+x+" e y "+y+" é igual "+(resto));
         
         entrada.close();


    }
}
