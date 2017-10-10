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
public class Tabuleiro {
    int tamanho =16;
    LinkedList<PontoTabuleiro> pontosTabuleiro = new LinkedList<PontoTabuleiro>();
    
    public Tabuleiro() {
        this.gerarPontosTabuleiro();
        //this.distribuirNaviosAleatoriamente();
        this.gerarTabuleiro();
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public LinkedList<PontoTabuleiro> getPontosTabuleiro() {
        return pontosTabuleiro;
    }

    public void setPontosTabuleiro(LinkedList<PontoTabuleiro> pontosTabulçeiro) {
        this.pontosTabuleiro = pontosTabulçeiro;
    }
   
   public void gerarPontosTabuleiro(){        
        for (int i = 0; i < this.tamanho; i++) {           
               this.addPontoTabuleiro( new PontoTabuleiro(i));            
        }
    }

    private void addPontoTabuleiro(PontoTabuleiro pontoTabuleiro) {
        this.pontosTabuleiro.add(pontoTabuleiro);
    }
    
    public void distribuirNaviosAleatoriamente(){
        MetodosAuxiliares m = new MetodosAuxiliares();
        int[] vetorPosicoesNavios = new int[5];
        
           
            vetorPosicoesNavios[0] =1;
            vetorPosicoesNavios[1] =10;
            vetorPosicoesNavios[2] =3;
            vetorPosicoesNavios[3] =7;
            vetorPosicoesNavios[4] =15;
          
        for (int j = 0; j < 5; j++) {
            for (PontoTabuleiro pontoTabuleiro : pontosTabuleiro) {
                if(pontoTabuleiro.endereco == vetorPosicoesNavios[j]){
                    pontoTabuleiro.setTemNavio(true);
                }
            }


        }
        }   

    private void gerarTabuleiro() {
        
       
        MetodosAuxiliares m = new MetodosAuxiliares();
         int[] vetorPosicoesNavios = new int[5];
        for (int j = 0; j < 4; j++) {
             String navio = "";       
             while(navio.equals("-1") || navio.equals("")){
                 navio  = JOptionPane.showInputDialog("Digite o endereço do n° "+ (j+1) + ":");
             }
            vetorPosicoesNavios[j] = Integer.parseInt(navio);
        }
         for (int i = 0; i < 5; i++) {
            //int navio = m.gerarNumero(0, 15);
           for (PontoTabuleiro pontoTabuleiro : pontosTabuleiro) {
                if(pontoTabuleiro.endereco == vetorPosicoesNavios[i]){
                    pontoTabuleiro.setTemNavio(true);
                }
            }
         }
    }

    private boolean verificarNumeroDigitado(int[] vetorPosicoesNavios, int finalArray , int navio) {
        
        for (int i = 0; i < finalArray; i++) {
            if(vetorPosicoesNavios[i] == navio || navio <0 || navio >15){
                return false;
            }
        }
        return true;
       
    }
    
    
}
