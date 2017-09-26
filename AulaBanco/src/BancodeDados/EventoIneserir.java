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
public class EventoIneserir implements MouseListener{
TelaPrincipal tp;
Banco coon = new Banco();
    public EventoIneserir( TelaPrincipal tp) {
        this.tp = tp;
       
    }


    @Override
    public void mouseClicked(MouseEvent e) {
         System.out.println(e);
         if(tp.ti.isVisible())
           tp.ti.setVisible(false);
        else
          tp.ti.setVisible(true);
         
        tp.ti.setLocation(200, -100);
        if(e.equals("Inserir")){
           coon.inserir(tp.ti.getjTextField1().getText(),Integer.parseInt( tp.ti.getjTextField2().getText()));
            
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
        /*if(tp.ti.isVisible())
            tp.ti.setVisible(false);
        else
        tp.ti.setVisible(true);*/
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
   
    
    
    
}
