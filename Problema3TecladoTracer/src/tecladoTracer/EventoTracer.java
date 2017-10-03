/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecladoTracer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author m80027
 */
public class EventoTracer implements MouseListener, MouseMotionListener{
TecladoTracer tt;
    EventoTracer(TecladoTracer tt) {
            this.tt = tt;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
      //  System.out.println("cliquei aqui ->" + e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
      System.out.println("pressionei aqui ->" +e.toString());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       System.out.println("soltei aqui ->" +e.toString());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       System.out.println("entrei aqui ->" +e.toString());
    }

    @Override
    public void mouseExited(MouseEvent e) {
      System.out.println("sai daqui ->" +e.toString());
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("passei aqui ->" +e.toString());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
