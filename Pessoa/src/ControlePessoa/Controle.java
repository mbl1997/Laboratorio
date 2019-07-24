/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlePessoa;
import java.util.Scanner;
/**
 *
 * @author marib
 */
public class Controle {
    static Pessoa[] vPess = new Pessoa [20];	
static int  contaPessoa = 0 ;
    
    public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);

	char op;
	  while(true){
		  System.out.println("\n-------------Menu--------------");
		  System.out.println("1- Cadastrar Pessoas");
		  System.out.println("2- Lista Pessoas");
		  System.out.println("3- Localizar Pessoas");
		  System.out.println("4-Sair");
		  op = entrada.next().charAt(0);
		  
		  if(op == '1')
			  cadastrar();
		  if(op == '2')
			  lista();
		  if(op == '3')
			  localizar();
		  if(op == '4')
			  sair();
	  }
	}

	private static void cadastrar() {
	Scanner entrada = new Scanner(System.in);
	vPess[contaPessoa] = new Pessoa();
	
	System.out.println("Digite o nome:");
	vPess[contaPessoa].setNome(entrada.nextLine());
	
	System.out.println("Digite o status de relacionamento:");
	vPess[contaPessoa].setStatus(entrada.nextLine());
	
		System.out.println("Digite o sexo dessa pessoa:");
	vPess[contaPessoa].setSexo(entrada.nextLine());
	
	System.out.println("Digite a idade:");
	vPess[contaPessoa].setIdade(entrada.nextInt());
	
	contaPessoa++;
		
	}

	private static void lista() {
		for(int i =0; i < contaPessoa; i++){
			System.out.println(vPess[i]);
		}
		
	}

	private static void localizar() {
		Scanner entrada = new Scanner (System.in);
		System.out.print("\n ...Digite o nome para localizar a Pessoa:");
		String PessoaAux = entrada.next();
		
		int i;
		for( i = 0; i < contaPessoa; i++){
			if (vPess[i].getNome().equals(PessoaAux)){
				   System.out.println(vPess[i]);
		}
		}
	}


	private static void sair() {
		System.out.println("Você finalizou !!");
		
	}
}
