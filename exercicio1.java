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

//peça dois numero e mostre a soma deles
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int primeiroNumero;
       int segundoNumero;
       int resultado;
       
       Scanner entrada = new Scanner(System.in);
      
         System.out.println("Digite um numero: ");
         //ler valor informado
         primeiroNumero = entrada.nextInt();
         
         System.out.println("Digite mais um numero: ");
         segundoNumero = entrada.nextInt();
         
         resultado = primeiroNumero + segundoNumero;
         
         System.out.println("A soma dos numeros é: "+(primeiroNumero+segundoNumero));
         
         entrada.close();//fechando entradas
                              
    }
    
}
