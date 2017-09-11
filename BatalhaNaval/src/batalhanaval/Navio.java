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
import java.awt.Point;
import java.io.Serializable;



public abstract class Navio implements Serializable {

	private static final long serialVersionUID = 1L;

	private Jogador jogador;
	private Point posicao;
	private OrientacaoNavio orientacao;
        private String nomeNavio;
       

	public Navio(Jogador jogador ) {
		this.jogador = jogador;
		this.orientacao = OrientacaoNavio.HORIZONTAL;
	}

	public abstract String getNome();

	public abstract int getTamanho();

	public abstract int getId();

	public Point getPosicao() {
		return posicao;
	}

	public Point[] getArrayPosicao(){
		Point[] arrayPos = new Point[getTamanho()];
		int i = posicao.x;
		int j = posicao.y;
		int k = 0;

		while (k < getTamanho()) {
			arrayPos[k++] = new Point(i, j);

			switch (orientacao) {
			case VERTICAL:
				j++;
				break;
			case HORIZONTAL:
				i++;
				break;
			case DIAGONAL:
				if (getTamanho() != 1) {
					j++;
					i++;
				}
				break;
			default:
				break;
			}
		}

		return arrayPos;
	}

	public OrientacaoNavio getOrientacao() {
		return orientacao;
	}

	public void setPosicao(Point pos) {
		posicao = pos;
	}

	public void setOrientacao(OrientacaoNavio orientacao) {
		this.orientacao = orientacao;
	}

	public boolean estaDestruido() {
		for (Point p : getArrayPosicao()) {
			if (jogador.getValorPosicao(p.x, p.y) > 0) {
				return false;
			}
		}
		return true;
	}
}

