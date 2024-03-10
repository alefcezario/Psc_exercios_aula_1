import java.util.Scanner;

public class exercicio20 {
        public static void main(String[] args) {
        double percentualIpi, codPC1, precoPC1, qtdPC1, codPC2, precoPC2, qtdPC2;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o percentual de IPI a ser adicionado no valor das peças: ");
        percentualIpi = entrada.nextDouble();

        System.out.println("Digite o código da peça 1: ");
        codPC1 = entrada.nextDouble();
        System.out.println("Digite o preço da peça 1: ");
        precoPC1 = entrada.nextDouble();
        System.out.println("Digite a quantidade comprada da peça 1: ");
        qtdPC1 = entrada.nextDouble();
       
        System.out.println("Agora digite o código da peça 2: ");
        codPC2 = entrada.nextDouble();
        System.out.println("Digite o preço da peça 2: ");
        precoPC2 = entrada.nextDouble();
        System.out.println("Digite a quantidade comprada da peça 2: ");
        qtdPC2 = entrada.nextDouble();

        double totalPC1 = precoPC1*qtdPC1;
        double totalPC2 = precoPC2*qtdPC2;
        double somatotal = totalPC1+totalPC2;

        double calculoIPI = somatotal/100*percentualIpi;

        double valorFinal = somatotal+calculoIPI;   
    
        System.out.println("Você pagará: R$ "+ valorFinal);
            
        entrada.close();


    }
}
