/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador;
import java.util.Scanner;
/**
 *
 * @author marib
 */
public class Controle {
                   static Computador vComputador[]  = new Computador[20];
	static Problema   vProblema  []  = new Problema  [7 ];
	static int  indvProblema   = 0;
	static int   indvComputador = 0;
    
    public static void main(String[] args) {
        
    String menu = "";
		menu += "\n\n==============================";
		menu += "\nMENU";
		menu += "\n==============================";
		menu += "\n1- Cadastra Computador  ";
		menu += "\n2- Relatorio Computador";
		menu += "\n3- Cadastra Problemas";
		menu += "\n4- Lista Problemas";
		menu += "\n==============================";
		menu += "\nEscolha: ";
		while(true){
			System.out.print(menu);
			switch(recebeChar()){
				case '1': cadastra();			break;
				case '2': relatorio();			break;
				case '3': cadastraProblema();	break;
				case '4': listaProblema();		break;
			}
		}
	}
		

	private static void cadastra() {
		if (indvProblema > 0){
			System.out.print("\nCadastro de Computador com Problema");
			System.out.print("\n   Digita a Identificacao do Computador: ");
			int id = Integer.parseInt(digita());
			int problema = selecionaProblema();
			vComputador[indvComputador] = new Computador();
			vComputador[indvComputador].setIdentificador(id);
			vComputador[indvComputador].setProblema(vProblema[problema]);
			indvComputador++;
		}
		else System.out.println("\n...ERRO. Não há Problemas Cadastrados.");
	}
	private static void relatorio() {
		if (indvComputador > 0)
			for (int i = 0; i < indvComputador; i++) {
				System.out.println(i+" "+vComputador[i].getIdentificador()+
						" - "+
						vComputador[i].getProblema().getDescricao());
			}
		else System.out.println("...ERRO. Não Há Computador Cadastrado.");
	}
	
	private static void cadastraProblema() {
		System.out.print("\nCadastro de Problemas");

		System.out.print("\n   Digita Codigo do Problema: ");
		int cod = Integer.parseInt(digita());
		
		System.out.print("   Digita Descrição do Problema: ");
		String descricao = digita();
		
		vProblema[indvProblema] = new Problema(cod,descricao);
		indvProblema++;
	}
	
	private static void listaProblema() {
		System.out.println(">>>>>Lista de Problemas:");
		for (int i = 0; i < indvProblema; i++) {
			System.out.println("     "+vProblema[i].getCodErro()+
					" "+vProblema[i].getDescricao());
		}
	}

	private static int selecionaProblema() {
		mostraProblemas();
		int probl;
		do{
			probl = Integer.parseInt(digita());
			if (probl < 1 || probl > 7)
				System.out.println("\n   ...ERRO. Código Incorreto.");
				break;
		}while(true);
		return probl;
	}

	private static void mostraProblemas() {
		for (int i = 0; i < indvProblema; i++) {
			System.out.println("   "+
					vProblema[i].getCodErro()+
					vProblema[i].getDescricao());
		}
	}
	
	private static char recebeChar() {
		return digita().charAt(0);
	}

	private static String digita() {
		Scanner e = new Scanner(System.in);
		return e.nextLine();
	}
}
