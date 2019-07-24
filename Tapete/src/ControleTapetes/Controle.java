/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleTapetes;
import java.util.Scanner;

/**
 *
 * @author marib
 */
public class Controle {
     static Tapete[] vTapete = new Tapete[10];
	static int contaTapetes = 0; 

public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
char op;
  while(true){
	  System.out.println("\n-------------Menu--------------");
	  System.out.println("1- Cadastrar Tapete");
	  System.out.println("2- Lista Tapete");
	  System.out.println("3- Localizar Tapete");
	  System.out.println("4-Sair");
	  op = entrada.next().charAt(0);
	  
	  if(op == '1')
		  cadastrar();
	  if(op == '2')
		lista();
	  if(op == '3')
		  Localizar();
	  if(op =='4')
		  sair();
  }
	}

	private static void sair() {
		System.out.println("Parabéns! Você finalizou ... ");
		
	}

	private static void lista() {
		for(int i =0; i < contaTapetes; i++){
			System.out.println(vTapete[i]);
			
		}
		
	}

	private static void Localizar() {
		Scanner entrada = new Scanner (System.in);
		System.out.print("\n ...Digite cor  para localizar o tapete:");
		String TapeteAux = entrada.next();
		
//	boolean ok = false;
		int i;
	for( i = 0; i < contaTapetes; i++){
		if (vTapete[i].getCorPrincipal().equals(TapeteAux)){
			   System.out.println(vTapete[i]);
			 //  ok = true;
			//   break;
		}
	}
	//	if(!ok) System.out.print("Não foi encontrado");
	//	else System.out.println(vTapete[i]);
	}

	private static void cadastrar() {
		Scanner entrada = new Scanner (System.in);
		vTapete[contaTapetes] = new Tapete();
		
	System.out.print("Digite a cor do tapete: ");
	vTapete[contaTapetes].setCorPrincipal(entrada.nextLine());
	
System.out.print("Digite a largura do tapete:");
vTapete[contaTapetes].setLargura(entrada.nextDouble());

System.out.print("Digite o comprimento do tapete:");
vTapete[contaTapetes].setComprimento(entrada.nextDouble());

contaTapetes ++;
		
	}
}
