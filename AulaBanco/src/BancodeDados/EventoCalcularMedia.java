/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancodeDados;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author m80027
 */
public class EventoCalcularMedia implements MouseListener{
TelaMedia ti;
Banco coon = new Banco();
    public EventoCalcularMedia( TelaMedia ti) {
        this.ti = ti;
       
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("BancodeDados.EventoIneserir.mouseClicked()");
        
        
      
      /* ti.pessoa.setNome("testes");
       ti.pessoa.setIdade(35);*/
        int[] retorno = new int[2];
         retorno = coon.calcularMedia();
          
        String campo1 = "Total de "+retorno[0] + "e total de idades "+ retorno[1]; 
        String campo2 = "Média total de "+  retorno[0]/ retorno[1]+".";
        
       ti.getjTextField1().setText(campo1);
       ti.getjTextField2().setText(campo2);
      
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
        /*if(ti.ti.isVisible())
            ti.ti.setVisible(false);
        else
        ti.ti.setVisible(true);*/
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
   
    
    
    
}
