/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author m80027
 */
public class EventoConsultar implements MouseListener{
TelaConsultar tc;
Banco coon = new Banco();
    public EventoConsultar( TelaConsultar tc) {
        this.tc = tc;
       
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("BancodeDados.EventoIneserir.mouseClicked()");
        
      // tc.pessoa.setNome(tc.getjTextField1().getText());
       
      
     String nome = "testes";
       /*tc.pessoa.setIdade(35);*/
     PontosGrafico p = new PontosGrafico();
     p =  coon.consultar(nome);
          
       tc.getjTextField1().setText(Integer.toString(p.getX()));
       tc.getjTextField2().setText(Integer.toString(p.getY()));
      
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
        /*if(tc.tc.isVisible())
            tc.tc.setVisible(false);
        else
        tc.tc.setVisible(true);*/
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
   
    
    
    
}
