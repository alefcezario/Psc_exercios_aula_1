import java.util.Scanner;

public class exercicio7 {
            public static void main(String[] args) {
        double salario;
        double percentual = 7;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual o valor do seu salário: ");
        salario = entrada.nextDouble();

        double salarioreajustado = (salario + (salario/100*percentual));

        System.out.println("Com o reajuste de 7%, seu novo salário será: R$ "+ salarioreajustado);
         
         entrada.close();


    }
}
