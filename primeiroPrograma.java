* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprograma;

/**
 *
 * @author aluno
 */
import java.util.Scanner; //classe que permite ler do teclado
/**Criacao da primeira classe
 * **/
public class PrimeiroPrograma {
    /**
     * ponto de partida do programa
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    String nome;
    System.out.println("Escreva seu nome: ");
    nome = input.nextLine(); //le uma linha de texto
    System.out.println("\n O nome informado foi: "+nome);
    
    input.close(); //encerrar o que foi pedido
           
     
    }
    
}
