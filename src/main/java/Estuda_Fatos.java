
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leonardogd
 */
public class Estuda_Fatos {

    public static void main(String[] args) {
        
        int []vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        int operacao=5;
        int escolha_numero;
        int num_aleatorio;
        int resultado;
        int resultado_usuario;
        
        while(operacao != 0){
        
        System.out.println("1 - SOMA");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("0 - SAIR");
        System.out.println("Informe o tipo de operação desejada ou Digite 0 para sair:");
        
        operacao = leitor.nextInt();
        if(operacao == 0)
            break;
        else{
        
        System.out.println("Escolha o número que deseja estudar");
        
        escolha_numero = leitor.nextInt();
        
        
        if(operacao == 1){
            for(int i=0;i<15;++i){
                num_aleatorio = gerador.nextInt(10);
                System.out.println(escolha_numero + " + " + num_aleatorio + " = ");
                resultado = escolha_numero + num_aleatorio;
                System.out.println("Digite a resposta para a operação acima:");
                resultado_usuario = leitor.nextInt();
                if(resultado == resultado_usuario){
                    System.out.println("ACERTOU!");
                    System.out.println();
                }
                else{
                    System.out.println("Errado! Resposta correta é:" + resultado);
                    System.out.println();
                }
            }
        }
        
        if(operacao == 2){
            for(int i=0;i<15;++i){
                num_aleatorio = gerador.nextInt(10);
                if(escolha_numero<num_aleatorio){
                    System.out.println(num_aleatorio + " - " + escolha_numero + " = ");
                    resultado = num_aleatorio - escolha_numero;
                    System.out.println("Digite a resposta para a operação acima:");
                    resultado_usuario = leitor.nextInt();
                }
                else{
                    System.out.println(escolha_numero + " - " + num_aleatorio + " = ");
                    resultado = escolha_numero - num_aleatorio;
                    System.out.println("Digite a resposta para a operação acima:");
                    resultado_usuario = leitor.nextInt();
                }
                if(resultado == resultado_usuario){
                    System.out.println("ACERTOU!");
                    System.out.println();
                }
                else{
                    System.out.println("Errado! Resposta correta é:" + resultado);
                    System.out.println();
                }
            }
        }
           
                
        }
        }
        
        
    }
    
}
