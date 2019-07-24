/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleDeLojas;
import java.util.Scanner;
/**
 *
 * @author marib
 */
public class Controle {
    static Lojas[] vloja = new Lojas[10];
	static int contaLojas =0; 
        
    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
		char op;
		  while(true){
			  System.out.println("\n-------------Menu--------------");
			  System.out.println("1- Cadastrar Loja");
			  System.out.println("2- Lista Loja");
			System.out.println("3- Localizar");
			  System.out.println("4-Sair");
			  op = entrada.next().charAt(0);
			  
			  if(op == '1')
				  cadastrar();
			  if(op == '2')
				lista();
			  if(op == '3')
				Localizar();
			  if( op == '4')
				  Sair();
			
		  }
			}

	private static void Localizar() {
		Scanner entrada = new Scanner (System.in);
		System.out.print("\n ...Digite cor  para localizar a loja:");
		String LojaAux = entrada.next();
		
		int i;
		for( i = 0; i < contaLojas; i++){
			if (vloja[i].getCor().equals(LojaAux)){
				   System.out.println(vloja[i]);
		}
		}
	}

	private static void Sair() {
	System.out.println("Parabéns ! Concluido .... ");
		
	}

	private static void lista() {
		for(int i =0; i < contaLojas; i++){
			System.out.println(vloja[i]);
			
		}
		
	}

	private static void cadastrar() {
	Scanner  entrada= new Scanner(System.in);
	 vloja[contaLojas] = new Lojas();
	 
	  System.out.println("Digite o lugar :");
	 vloja[contaLojas].setLugar(entrada.nextLine());
	 
	 System.out.println("Digite o produto: ");
	 vloja[contaLojas].setProduto(entrada.nextLine());
	 
	 System.out.println("Digite a cor da Loja:");
	 vloja[contaLojas].setCor(entrada.nextLine());
	 
	 	 System.out.println("Digite o número de Funcionario:");
	 vloja[contaLojas].setNumeroFuncionarios(entrada.nextInt());
	 
	 contaLojas++;
	
	}
}
