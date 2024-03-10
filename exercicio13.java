import java.util.Scanner;

public class exercicio13 {
        public static void main(String[] args) {
        double horaDetrab;
        double horasTrabalhadas;
        double percentual;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Para calcularmos seu salario liquido, digite o valor da hora trabalhada: ");
        horaDetrab = entrada.nextDouble();
        System.out.println("Agora digite quantas horas vc trabalhou: ");
        horasTrabalhadas = entrada.nextDouble();
        System.out.println("Pra finalizar, digite o percentual de desconto do INSS: ");
        percentual = entrada.nextDouble();
    
        double salarioBruto = horaDetrab*horasTrabalhadas;
        double valorDesconto = salarioBruto/100*percentual;
        double salarioLiquido = salarioBruto-valorDesconto ;
    
        System.out.println("Seu salario liquido é: "+ salarioLiquido);

        
        entrada.close();


    }
}
