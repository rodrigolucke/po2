/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

/**
 *
 * @author rodrigolucke
 */
public class Player {
   
    String Nome;
    int vida;
    Tabuleiro tabuleiroPlayer;

    public Player( String Nome, int vida) {
     
        this.Nome = Nome;
        this.vida = vida;
        this.tabuleiroPlayer = new Tabuleiro();
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getVida() {
        return this.calcularVidaPlayer();
    }

    public void setVida(int v) {
        this.vida = this.vida;
    }
    
      public void diminuiVida() {
        this.vida = this.vida - 1;
    }


    public Tabuleiro getTabuleiroPlayer() {
        return tabuleiroPlayer;
    }

    public void setTabuleiroPlayer(Tabuleiro tabuleiroPlayer) {
        this.tabuleiroPlayer = tabuleiroPlayer;
    }
    
    public int calcularVidaPlayer() {
           int vida =0;
            for (PontoTabuleiro ponto :this.getTabuleiroPlayer().pontosTabuleiro) {
                    if(ponto.getTemNavio())
                        vida = vida +1;
                   
            }
            return vida;
        }
    
}
