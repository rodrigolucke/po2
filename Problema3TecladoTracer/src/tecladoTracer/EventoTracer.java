/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecladoTracer;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import static tecladoTracer.TecladoTracer.botaoPressed;
import static tecladoTracer.TecladoTracer.botaoReleased;

/**
 *
 * @author m80027
 */
public class EventoTracer implements MouseListener,MouseMotionListener {

    TecladoTracer tt;

  
    JButton botao;
    String resultado;
    String array[] = new String[4];
    

    public EventoTracer(TecladoTracer tt) {
        this.tt = tt;
        /*this.botaoPressed = false;
        this.botaoEntered = false;
        this.botaoLeft = false;
        this.botaoReleased = false;*/
    }

    @Override
    public void mouseClicked(MouseEvent e) {
     System.out.println("cliquei aqui ->" + e.toString());
        botao = (JButton) e.getSource();
        if(!botao.getText().equals("ok")){
            tt.palavra = botao.getText();
            resultado = tt.b.consultar(tt.palavra);
            array = resultado.split(" ");
            tt.jTextField1.setText(tt.jTextField1.getText()+botao.getText());
        }
         
    }

    @Override
    public void mousePressed(MouseEvent e) {
        try {
            System.out.println("pressionei aqui ->" + e.toString());
            botao = (JButton) e.getSource();
            tt.palavra = botao.getText();
            botaoPressed = true;

            resultado = tt.b.consultar(tt.palavra);
            array = resultado.split(" ");
        
            tt.jOpcao.setText(array[0]);
            tt.jOpcao1.setText(array[1]);
            tt.jOpcao2.setText(array[2]);
            tt.jOpcao3.setText(array[3]);
           
        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       // System.out.println("soltei aqui ->" + e.toString());
            botaoPressed=false;
      
        
            
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        botao = (JButton) e.getSource();
        if(botaoPressed){
            System.out.println("entrei aqui ->" +botao.getText());
            botao = (JButton) e.getSource();
            tt.palavra = tt.palavra+""+botao.getText();
            
            resultado = tt.b.consultar(tt.palavra);
            array = resultado.split(" ");
            int qtLetras = tt.palavra.length();
           // se acrescentar mais uma letra e nãoa char nenhuma palavra retira a ultima letra e refaz a pesquisa
           while(array[0].equals("") && qtLetras >0 ){
                
               // qtLetras = tt.palavra.length();
                tt.setPalavra(tt.palavra.substring(0,qtLetras-1));
                qtLetras=tt.palavra.length();;
                 resultado = tt.b.consultar(tt.palavra);
                 array = resultado.split(" ");
             
             
                if(array.length > 3){
                    tt.jOpcao3.setText(array[3]);
                }/*else{
                    tt.jOpcao3.setText("");
                }*/

                if(array.length > 2){
                    tt.jOpcao2.setText(array[2]);
                }/*else{
                    tt.jOpcao2.setText("");
                }*/

                if(array.length > 1){
                    tt.jOpcao1.setText(array[1]);
                }/*else{
                    tt.jOpcao1.setText("");
                }*/
          
           }
           
             if(array.length > 3){
                    tt.jOpcao3.setText(array[3]);
                }/*else{
                    tt.jOpcao3.setText("");
                }*/

                if(array.length > 2){
                    tt.jOpcao2.setText(array[2]);
                }/*else{
                    tt.jOpcao2.setText("");
                }*/

                if(array.length > 1){
                    tt.jOpcao1.setText(array[1]);
                }/*else{
                    tt.jOpcao1.setText("");
                }*/
          /*  while(array[0].equals("") && !array[0].equals(null) ){
                
                int qtLetras = palavra.length();
                palavra.substring(0,qtLetras-1);
                resultado = tt.b.consultar(palavra);
            }*/
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
      /*  System.out.println("sai daqui->" +e.toString());
        if( botaoPressed){
             System.out.println("sai daqui pressed->" +e.toString());
           
           
        }  */
    }

    @Override
    public void mouseDragged(MouseEvent e) {
       

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
