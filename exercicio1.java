/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author aluno
 */
import java.util.Scanner;

public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
      
         System.out.println("Digite um numero: ");
         int primeiroNumero = scanner.nextInt();
         
         System.out.println("Digite mais um numero: ");
         
         int segundoNumero = scanner.nextInt();
         
         System.out.println("A soma dos numeros é: "+(primeiroNumero+segundoNumero));
         
   
                
    }
    
}
