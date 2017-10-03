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
public class EventoExcluir implements MouseListener{
TelaExcluir ti;
Banco coon = new Banco();
    public EventoExcluir( TelaExcluir ti) {
        
        this.ti = ti;
       
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("BancodeDados.EventoIneserir.mouseClicked()");
        
        //ti.pessoa.setNome(ti.getjTextField1().getText());
        //ti.pessoa.setIdade(Integer.parseInt(ti.getjTextField2().getText()));
      //  ti.pessoa.setIdade(35);
      String nome = "testes";
     
      // ti.pessoa.setIdade(35);*/
        
       coon.excluir(nome);
          
       ti.getjTextField1().setText("");
       ti.getjTextField2().setText("");
      
        
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
