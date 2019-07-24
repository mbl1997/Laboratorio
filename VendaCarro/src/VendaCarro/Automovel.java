/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendaCarro;

/**
 *
 * @author marib
 */
public class Automovel {
    
     private int ano;
     private String marca;
     private String modelo;
     private String cor;
     private double valor;


public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;      
	}
        	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;      
	}
	@Override
	public String toString() {
		return "Automovel [cor=" + cor + ", marca=" + marca + ", modelo=" + modelo
				+ ", ano=" + ano+ ", valor=" + valor+"]";
	}
}
