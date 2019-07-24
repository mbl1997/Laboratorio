package cachorro;
 import  java.util.Scanner ;
/**
 *
 * @author marib
 */
public class Cachorro {
    
private String nome;
	private String raça;
	private char porte;
	private String dtNascimento;
        
        
    public static void main(String[] args) {
       Cachorro c = new Cachorro();
    System.out.print("Nome: ");
		c.setNome(digita());
		System.out.print("raça: ");
		c.setRaça(digita());
		System.out.print("Porte: ");
		c.setPorte(recebePorte());
		System.out.print("Data Nascimento dd/mm/aaaa: ");
		c.setDtNascimento();

		System.out.print("\n\n....Nome: " + c.getNome());

	}

	static char recebePorte() {
		char porte;
		while (true) {
			porte = digita().toLowerCase().charAt(0);
			if (porte == 'p' || porte == 'm' || porte == 'g')
				break;
			else {
				System.out.print("...Digite apenas [p][m][g]: ");
			}
		}
		return porte;
	}

	private static String digita() {
		Scanner e = new Scanner(System.in);
		return e.next();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public char getPorte() {
		return porte;
	}

	public void setPorte(char porte) {
		this.porte = porte;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento() {
		while (true) {
			String dt = digita();
			if (dt.length()  == 10  && 
				dt.charAt(2) == '/' && 
				dt.charAt(5) == '/') {
				if (diaOk(dt)) {
					this.dtNascimento = dt;
					break;
				}
			} 
			System.out.print("\nErro. Digite no formato dd/mm/aaaa: ");
		}
	}

	private boolean diaOk(String dt) {
		int dia = Integer.parseInt(dt.substring(0, 2));
		if (dia > 0 && dia <= 31) {
			System.out.println("dia Ok.");
			return true;
		}
		System.out.println("dia Não Ok.");
		return false;
	}
    }
    

