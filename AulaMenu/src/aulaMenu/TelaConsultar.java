/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaMenu;

import javax.accessibility.AccessibleContext;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.plaf.PanelUI;

/**
 *
 * @author m72583
 */
public class TelaConsultar extends TelaPai {
    EventoConsultar co;
    /**
     * Creates new form TelaInserir
     */
    public TelaConsultar() {
        initComponents();
        this.setSize(300,300);
        this.jLabel1.setText("Nome:");
        this.jLabel2.setText("Idade:");
        this.jToggleButton1.setText("Consultar");
        
        co = new EventoConsultar(this);
        this.jToggleButton1.addMouseListener(co);
    }

    @Override
    public void setjToggleButton1(JToggleButton jToggleButton1) {
        super.setjToggleButton1(jToggleButton1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JToggleButton getjToggleButton1() {
        return super.getjToggleButton1(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjTextField2(JTextField jTextField2) {
        super.setjTextField2(jTextField2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JTextField getjTextField2() {
        return super.getjTextField2(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjTextField1(JTextField jTextField1) {
        super.setjTextField1(jTextField1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JTextField getjTextField1() {
        return super.getjTextField1(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjLabel2(JLabel jLabel2) {
        super.setjLabel2(jLabel2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JLabel getjLabel2() {
        return super.getjLabel2(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjLabel1(JLabel jLabel1) {
        super.setjLabel1(jLabel1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JLabel getjLabel1() {
        return super.getjLabel1(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPessoa(PontosGrafico pessoa) {
        super.setPessoa(pessoa); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PontosGrafico getPessoa() {
        return super.getPessoa(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AccessibleContext getAccessibleContext() {
        return super.getAccessibleContext(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String paramString() {
        return super.paramString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUIClassID() {
        return super.getUIClassID(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setUI(PanelUI ui) {
        super.setUI(ui); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PanelUI getUI() {
        return super.getUI(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateUI() {
        super.updateUI(); //To change body of generated methods, choose Tools | Templates.
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();

        jLabel1.setText("jl1");

        jLabel2.setText("jl2");

        jToggleButton1.setText("OK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jToggleButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
