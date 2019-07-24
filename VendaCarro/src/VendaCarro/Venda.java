/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendaCarro;
import java.util.Scanner;
/**
 *
 * @author marib
 */
public class Venda {
    
    static Automovel vAutomovel[] = new Automovel [20];
      static  int indAuto = 0;

    private static Object digita() {
         return null;   
    }
      
      Scanner entrada = new Scanner (System.in);
		public static void main(String[] args) {
             Scanner entrada = new Scanner (System.in); 
		String menu = "\n";
		menu += "\nMENU";
		menu += "\n=========================";
		menu += "\n1- Cadastra Automovel";
		menu += "\n2- Lista Automoveis";
		menu += "\n3- Lista Mais Barato";
		menu += "\n   Escolha: ";
		char op;
		while(true){
			System.out.println(menu);
			switch(digita().charAt(0)){
			case '1': cadastrar();  break;
			case '2': lista()   ;  break;
                        case '3': Localizar()   ; break;
                                
			}
		}
	}


	private static void Localizar() {
		Scanner entrada = new Scanner (System.in);
		System.out.print("\n ...Digite cor  para localizar o Automovel:");
		String LojaAux = entrada.next();
		
		int i;
		for( i = 0; i < indAuto; i++){
			if (vAutomovel[i].getCor().equals(LojaAux)){
				   System.out.println(vAutomovel[i]);
		}
		}
	}

	private static void Sair() {
	System.out.println("Parabéns ! Concluido .... ");
		
	}

	private static void lista() {
		for(int i =0; i < indAuto; i++){
			System.out.println(vAutomovel[i]);
			
		}
		
	}

	private static void cadastrar() {
	Scanner  entrada= new Scanner(System.in);
	 vAutomovel[indAuto] = new Automovel();
	 
	  System.out.println("Digite o modelo :");
	 vAutomovel[indAuto].setModelo(entrada.nextLine());
	 
	 System.out.println("Digite  a marca: ");
	 vAutomovel[indAuto].setMarca(entrada.nextLine());
	 
	 System.out.println("Digite a cor do Automovel:");
	 vAutomovel[indAuto].setCor(entrada.nextLine());
	 
	 	 System.out.println("Digite o ano do Automovel:");
	 vAutomovel[indAuto].setAno(entrada.nextInt());
	 
          System.out.println("Digite o Valor do Automovel:");
	 vAutomovel[indAuto].setValor(entrada.nextInt());
         
	 indAuto++;
	
	}
        
        public static String digita(String mens){
		Scanner e = new Scanner(System.in);
		System.out.println(mens);
		return e.nextLine();
	}
}
