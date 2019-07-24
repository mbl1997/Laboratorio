/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleTapetes;

/**
 *
 * @author marib
 */
public class Tapete {
    
                    private String corPrincipal;
	 private double largura;
	 private double comprimento;
	 
	
	
	public String getCorPrincipal() {
		return corPrincipal;
	}
	public void setCorPrincipal(String corPrincipal) {
		this.corPrincipal = corPrincipal;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	@Override
	public String toString() {
		return "tapete [corPrincipal=" + corPrincipal + ", largura=" + largura
				+ ", comprimento=" + comprimento + "]";
	}
}
