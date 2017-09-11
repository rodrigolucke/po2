/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

/**
 *
 * @author rodrigolucke
 */
public class Cruzador extends Navio {

	public Cruzador(Jogador jogador) {
		super(jogador);
	}

	@Override
	public String getNome() {
		return "Cruzador";
	}

	@Override
	public int getTamanho() {
		return 3;
	}

	@Override
	public int getId() {
		return 5;
	}

}

