/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecladoTracer;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author m78172
 */
public class TecladoTracer extends javax.swing.JFrame {

    EventoTracer et;
    //JButton[] botoesTela;
    Banco b;
    String palavra = "";
    JButton botao;
    static boolean botaoPressed;
    static boolean botaoEntered;
    static boolean botaoLeft;
    static boolean botaoReleased;

    /**
     * Creates new form Teclado
     */
    public TecladoTracer() {
        initComponents();
        //
        //int t =0;
        //    for (JButton cp : this.getComponent(i)){

        for (int i = 0; i < getContentPane().getComponentCount(); i++) {
            //varre todos os componentes
            Component c = getContentPane().getComponent(i);
            
            
            
            if (c instanceof JButton && !((JButton) c).getText().equals("")) {
                 
                //apaga os valores
                JButton b = (JButton) c;
                et = new EventoTracer(this);
                b.addMouseListener(et);
                b.addMouseMotionListener(et);
            }
        }
        
       /* JButton op1 = (JButton) c;
        JButton op2 = (JButton) c;
        JButton op3 = (JButton) c;
        JButton op4 = (JButton) c;*/
        
        
        b = new Banco();
    }

    public EventoTracer getEt() {
        return et;
    }

    public void setEt(EventoTracer et) {
        this.et = et;
    }

    public Banco getB() {
        return b;
    }

    public void setB(Banco b) {
        this.b = b;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public JButton getBotao() {
        return botao;
    }

    public void setBotao(JButton botao) {
        this.botao = botao;
    }

    public static boolean isBotaoPressed() {
        return botaoPressed;
    }

    public static void setBotaoPressed(boolean botaoPressed) {
        TecladoTracer.botaoPressed = botaoPressed;
    }

    public static boolean isBotaoEntered() {
        return botaoEntered;
    }

    public static void setBotaoEntered(boolean botaoEntered) {
        TecladoTracer.botaoEntered = botaoEntered;
    }

    public static boolean isBotaoLeft() {
        return botaoLeft;
    }

    public static void setBotaoLeft(boolean botaoLeft) {
        TecladoTracer.botaoLeft = botaoLeft;
    }

    public static boolean isBotaoReleased() {
        return botaoReleased;
    }

    public static void setBotaoReleased(boolean botaoReleased) {
        TecladoTracer.botaoReleased = botaoReleased;
    }

    public JButton getjButton10() {
        return jButton10;
    }

    public void setjButton10(JButton jButton10) {
        this.jButton10 = jButton10;
    }

    public JButton getjButton11() {
        return jButton11;
    }

    public void setjButton11(JButton jButton11) {
        this.jButton11 = jButton11;
    }

    public JButton getjButton12() {
        return jButton12;
    }

    public void setjButton12(JButton jButton12) {
        this.jButton12 = jButton12;
    }

    public JButton getjButton13() {
        return jButton13;
    }

    public void setjButton13(JButton jButton13) {
        this.jButton13 = jButton13;
    }

    public JButton getjButton14() {
        return jButton14;
    }

    public void setjButton14(JButton jButton14) {
        this.jButton14 = jButton14;
    }

    public JButton getjButton15() {
        return jButton15;
    }

    public void setjButton15(JButton jButton15) {
        this.jButton15 = jButton15;
    }

    public JButton getjButton16() {
        return jButton16;
    }

    public void setjButton16(JButton jButton16) {
        this.jButton16 = jButton16;
    }

    public JButton getjButton17() {
        return jButton17;
    }

    public void setjButton17(JButton jButton17) {
        this.jButton17 = jButton17;
    }

    public JButton getjButton18() {
        return jButton18;
    }

    public void setjButton18(JButton jButton18) {
        this.jButton18 = jButton18;
    }

    public JButton getjButton19() {
        return jButton19;
    }

    public void setjButton19(JButton jButton19) {
        this.jButton19 = jButton19;
    }

    public JButton getjButton20() {
        return jButton20;
    }

    public void setjButton20(JButton jButton20) {
        this.jButton20 = jButton20;
    }

    public JButton getjButton21() {
        return jButton21;
    }

    public void setjButton21(JButton jButton21) {
        this.jButton21 = jButton21;
    }

    public JButton getjButton22() {
        return jButton22;
    }

    public void setjButton22(JButton jButton22) {
        this.jButton22 = jButton22;
    }

    public JButton getjButton23() {
        return jButton23;
    }

    public void setjButton23(JButton jButton23) {
        this.jButton23 = jButton23;
    }

    public JButton getjButton24() {
        return jButton24;
    }

    public void setjButton24(JButton jButton24) {
        this.jButton24 = jButton24;
    }

    public JButton getjButton25() {
        return jButton25;
    }

    public void setjButton25(JButton jButton25) {
        this.jButton25 = jButton25;
    }

    public JButton getjButton26() {
        return jButton26;
    }

    public void setjButton26(JButton jButton26) {
        this.jButton26 = jButton26;
    }

    public JButton getjButton27() {
        return jButton27;
    }

    public void setjButton27(JButton jButton27) {
        this.jButton27 = jButton27;
    }

    public JButton getjButton28() {
        return jButton28;
    }

    public void setjButton28(JButton jButton28) {
        this.jButton28 = jButton28;
    }

    public JButton getjButton29() {
        return jButton29;
    }

    public void setjButton29(JButton jButton29) {
        this.jButton29 = jButton29;
    }

    public JButton getjButton30() {
        return jButton30;
    }

    public void setjButton30(JButton jButton30) {
        this.jButton30 = jButton30;
    }

    public JButton getjButton31() {
        return jButton31;
    }

    public void setjButton31(JButton jButton31) {
        this.jButton31 = jButton31;
    }

    public JButton getjButton5() {
        return jButton5;
    }

    public void setjButton5(JButton jButton5) {
        this.jButton5 = jButton5;
    }

    public JButton getjButton6() {
        return jButton6;
    }

    public void setjButton6(JButton jButton6) {
        this.jButton6 = jButton6;
    }

    public JButton getjButton7() {
        return jButton7;
    }

    public void setjButton7(JButton jButton7) {
        this.jButton7 = jButton7;
    }

    public JButton getjButton8() {
        return jButton8;
    }

    public void setjButton8(JButton jButton8) {
        this.jButton8 = jButton8;
    }

    public JButton getjButton9() {
        return jButton9;
    }

    public void setjButton9(JButton jButton9) {
        this.jButton9 = jButton9;
    }

    public JButton getjOpcao() {
        return jOpcao;
    }

    public void setjOpcao(JButton jOpcao) {
        this.jOpcao = jOpcao;
    }

    public JButton getjOpcao1() {
        return jOpcao1;
    }

    public void setjOpcao1(JButton jOpcao1) {
        this.jOpcao1 = jOpcao1;
    }

    public JButton getjOpcao2() {
        return jOpcao2;
    }

    public void setjOpcao2(JButton jOpcao2) {
        this.jOpcao2 = jOpcao2;
    }

    public JButton getjOpcao3() {
        return jOpcao3;
    }

    public void setjOpcao3(JButton jOpcao3) {
        this.jOpcao3 = jOpcao3;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public JButton getOk() {
        return ok;
    }

    public void setOk(JButton ok) {
        this.ok = ok;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jOpcao = new javax.swing.JButton();
        jOpcao1 = new javax.swing.JButton();
        jOpcao2 = new javax.swing.JButton();
        jOpcao3 = new javax.swing.JButton();
        ok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(90, 220, 300, 40);

        jButton5.setText("Z");
        getContentPane().add(jButton5);
        jButton5.setBounds(100, 130, 40, 23);

        jButton6.setText("Q");
        getContentPane().add(jButton6);
        jButton6.setBounds(40, 70, 40, 23);

        jButton7.setText("W");
        getContentPane().add(jButton7);
        jButton7.setBounds(80, 70, 50, 23);

        jButton8.setText("E");
        getContentPane().add(jButton8);
        jButton8.setBounds(130, 70, 40, 23);

        jButton9.setText("R");
        getContentPane().add(jButton9);
        jButton9.setBounds(170, 70, 40, 23);

        jButton10.setText("T");
        getContentPane().add(jButton10);
        jButton10.setBounds(210, 70, 40, 23);

        jButton11.setText("Y");
        getContentPane().add(jButton11);
        jButton11.setBounds(250, 70, 40, 23);

        jButton12.setText("U");
        getContentPane().add(jButton12);
        jButton12.setBounds(290, 70, 40, 23);

        jButton13.setText("I");
        getContentPane().add(jButton13);
        jButton13.setBounds(330, 70, 40, 23);

        jButton14.setText("O");
        getContentPane().add(jButton14);
        jButton14.setBounds(370, 70, 40, 23);

        jButton15.setText("P");
        getContentPane().add(jButton15);
        jButton15.setBounds(410, 70, 40, 23);

        jButton16.setText("D");
        getContentPane().add(jButton16);
        jButton16.setBounds(140, 100, 40, 23);

        jButton17.setText("A");
        getContentPane().add(jButton17);
        jButton17.setBounds(60, 100, 40, 23);

        jButton18.setText("G");
        getContentPane().add(jButton18);
        jButton18.setBounds(220, 100, 40, 23);

        jButton19.setText("H");
        getContentPane().add(jButton19);
        jButton19.setBounds(260, 100, 40, 23);

        jButton20.setText("S");
        getContentPane().add(jButton20);
        jButton20.setBounds(100, 100, 40, 23);

        jButton21.setText("K");
        getContentPane().add(jButton21);
        jButton21.setBounds(340, 100, 40, 23);

        jButton22.setText("L");
        getContentPane().add(jButton22);
        jButton22.setBounds(380, 100, 40, 23);

        jButton23.setText("F");
        getContentPane().add(jButton23);
        jButton23.setBounds(180, 100, 40, 23);

        jButton24.setText("X");
        getContentPane().add(jButton24);
        jButton24.setBounds(140, 130, 40, 23);

        jButton25.setText("M");
        getContentPane().add(jButton25);
        jButton25.setBounds(340, 130, 40, 23);

        jButton26.setText("J");
        getContentPane().add(jButton26);
        jButton26.setBounds(300, 100, 40, 23);

        jButton27.setText("B");
        getContentPane().add(jButton27);
        jButton27.setBounds(260, 130, 40, 23);

        jButton28.setText("N");
        getContentPane().add(jButton28);
        jButton28.setBounds(300, 130, 40, 23);

        jButton29.setText("C");
        getContentPane().add(jButton29);
        jButton29.setBounds(180, 130, 40, 23);

        jButton30.setText("V");
        getContentPane().add(jButton30);
        jButton30.setBounds(220, 130, 40, 23);
        getContentPane().add(jButton31);
        jButton31.setBounds(140, 170, 170, 30);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(350, 150, 10, 10);

        jOpcao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jOpcaoMouseClicked(evt);
            }
        });
        getContentPane().add(jOpcao);
        jOpcao.setBounds(100, 20, 70, 30);

        jOpcao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jOpcao1MouseClicked(evt);
            }
        });
        getContentPane().add(jOpcao1);
        jOpcao1.setBounds(180, 20, 70, 30);

        jOpcao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jOpcao2MouseClicked(evt);
            }
        });
        getContentPane().add(jOpcao2);
        jOpcao2.setBounds(270, 20, 70, 30);

        jOpcao3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jOpcao3MouseClicked(evt);
            }
        });
        getContentPane().add(jOpcao3);
        jOpcao3.setBounds(360, 20, 70, 30);

        ok.setText("ok");
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okMouseClicked(evt);
            }
        });
        getContentPane().add(ok);
        ok.setBounds(400, 230, 43, 23);

        setBounds(0, 0, 569, 344);
    }// </editor-fold>//GEN-END:initComponents

    private void jOpcaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOpcaoMouseClicked
       
        botao = (JButton) evt.getSource();   
        jTextField1.setText( botao.getText());
    }//GEN-LAST:event_jOpcaoMouseClicked

    private void jOpcao1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOpcao1MouseClicked
        botao = (JButton) evt.getSource();   
        jTextField1.setText( botao.getText());
    }//GEN-LAST:event_jOpcao1MouseClicked

    private void jOpcao2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOpcao2MouseClicked
        botao = (JButton) evt.getSource();   
        jTextField1.setText( botao.getText());
    }//GEN-LAST:event_jOpcao2MouseClicked

    private void jOpcao3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOpcao3MouseClicked
        botao = (JButton) evt.getSource();   
        jTextField1.setText( botao.getText());
    }//GEN-LAST:event_jOpcao3MouseClicked

    private void okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseClicked
      
            String salvar[] = new String[4];
            salvar = this.jTextField1.getText().split(" ");
            this.b.salvar(salvar[0]);
        
    }//GEN-LAST:event_okMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TecladoTracer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TecladoTracer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TecladoTracer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TecladoTracer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TecladoTracer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    public javax.swing.JButton jOpcao;
    public javax.swing.JButton jOpcao1;
    public javax.swing.JButton jOpcao2;
    public javax.swing.JButton jOpcao3;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables
}
