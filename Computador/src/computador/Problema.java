/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador;

/**
 *
 * @author marib
 */
public class Problema {
    
                   private int codErro;
	private String Descricao;

        
    public Problema(int codErro, String Descricao) {
        this.codErro = codErro;
        this.Descricao = Descricao;
    }

    public Problema() {
    }
        

    public int getCodErro() {
        return codErro;
    }

    public void setCodErro(int codErro) {
        this.codErro = codErro;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
        
        
}
