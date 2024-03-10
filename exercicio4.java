import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome, endereco, telefone;

        System.out.println("Olá, digite seu  nome: ");
        nome = input.nextLine(); 

        System.out.println("Agora digite seu endereço: ");
        endereco = input.nextLine(); 

        System.out.println("E por ultimo, seu telefone: ");
        telefone = input.nextLine();

        System.out.println("\n Vou exibir seus dados na proxima tela para conferencia ");
        System.out.println("Seu nome é: "+nome);
        System.out.println("Seu endereco é: "+endereco);
        System.out.println("Seu telefone é: "+telefone);


        input.close(); 
   
    }
}
