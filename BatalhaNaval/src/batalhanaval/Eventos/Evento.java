/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval.Eventos;

/**
 *
 * @author rodrigolucke
 */
import java.io.Serializable;

public class Evento implements Serializable {

	private static final long serialVersionUID = 742010242566568034L;
	private String mensagem;

	public Evento(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return this.mensagem;
	}
}
