/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4grafico;

 
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author m80027
 */
public class PainelGrafico extends javax.swing.JPanel {
        ExibeGrafico eg;
    /**
     * Creates new form PainelGrafico
     */
    public PainelGrafico() {
        initComponents();
        this.setSize(400,300);
        this.setVisible(false);
        this.setBounds(0, 0, this.getWidth(), this.getHeight());
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltarPainelGraficoToPrincipal = new javax.swing.JButton();
        gerarGrafico = new javax.swing.JButton();

        voltarPainelGraficoToPrincipal.setText("Voltar");
        voltarPainelGraficoToPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarPainelGraficoToPrincipalActionPerformed(evt);
            }
        });

        gerarGrafico.setText("Gerar gráfico");
        gerarGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarGraficoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(gerarGrafico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(voltarPainelGraficoToPrincipal))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 277, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarPainelGraficoToPrincipal)
                    .addComponent(gerarGrafico)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void voltarPainelGraficoToPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarPainelGraficoToPrincipalActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_voltarPainelGraficoToPrincipalActionPerformed

    private void gerarGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarGraficoActionPerformed
         
      
    }//GEN-LAST:event_gerarGraficoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton gerarGrafico;
    public javax.swing.JButton voltarPainelGraficoToPrincipal;
    // End of variables declaration//GEN-END:variables
    

}
