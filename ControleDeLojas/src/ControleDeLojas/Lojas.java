/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleDeLojas;

/**
 *
 * @author marib
 */
public class Lojas {
    
                   private String cor;
	private String produto;
	private String lugar;
	private int numeroFuncionarios;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	@Override
	public String toString() {
		return "Loja [cor=" + cor + ", produto=" + produto + ", lugar=" + lugar
				+ ", numeroFuncionarios=" + numeroFuncionarios + "]";
	}
}
