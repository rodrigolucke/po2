/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author rodrigolucke
 */
public class PontoTabuleiro {
    int endereco;    
    boolean temNavio;
    boolean permiteJogada;


    public PontoTabuleiro(int endereco) {
        this.endereco = endereco;
        this.temNavio = false;
        this.permiteJogada = true;
    }

    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

    public boolean getTemNavio() {
        return temNavio;
    }

    public void setTemNavio(boolean temNavio) {
        this.temNavio = temNavio;
    }

    public boolean isPermiteJogada() {
        return permiteJogada;
    }

    public void setPermiteJogada(boolean permiteJogada) {
        this.permiteJogada = permiteJogada;
    }
    
    
    
}
