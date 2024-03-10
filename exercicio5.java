import java.util.Scanner;


public class exercicio5 {
        public static void main(String[] args) {
        // TODO code application logic here
        double valordolar;
        double cotacaodolar = 4.95;
              
       Scanner entrada = new Scanner(System.in);
      
         System.out.println("Digite quantos dolares deseja converter para reais: ");
         //ler valor informado
         valordolar = entrada.nextDouble();
         
         double valorconvertido = valordolar*cotacaodolar;
         
         
         System.out.println("O valor convertido em reais é "+(valorconvertido));
         
         entrada.close();
                              
    }
}
