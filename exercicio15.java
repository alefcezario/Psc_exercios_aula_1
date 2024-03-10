import java.util.Scanner;

public class exercicicio15 {
            public static void main(String[] args) {
        double a, b, c;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        a = entrada.nextDouble();
        System.out.println("Digite o valor de B: ");
        b = entrada.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = entrada.nextDouble();

        double calculo = b * b - 4 * a * c;
        double primeiraRaiz = (-b + Math.sqrt(calculo)) / (2 * a);
        double segundaRaiz =  (-b - Math.sqrt(calculo)) / (2 * a);
        
        /* fiz seguindo exemplo, mas nao consegui entender professor 10-03-2024 */
        
        System.out.println("O valor da primeira raiz é: "+ primeiraRaiz);
        System.out.println("O valor da segunda raiz é: "+ segundaRaiz);

        entrada.close();


    }
}
