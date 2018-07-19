/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.ps.ui.paineis;

import br.univali.ps.ui.swing.ColorController;
import br.univali.ps.ui.swing.Themeable;
import br.univali.ps.ui.swing.weblaf.WeblafUtils;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

/**
 *
 * @author Adson Esteves
 */
public class PainelPluginItem extends javax.swing.JPanel implements Themeable{

    /**
     * Creates new form PainelPluginItem
     */
       
    public PainelPluginItem() {
        initComponents();
        configurarCores();
    }

    @Override
    public void configurarCores() 
    {        
        labelPluginInstalado.setBackground(ColorController.COR_PRINCIPAL);
        labelPluginInstalado.setForeground(ColorController.COR_LETRA);        
        if(WeblafUtils.weblafEstaInstalado())
        {
            WeblafUtils.configuraWebLaf(seletorPlugin);
        }
    }

    public JLabel getLabelPluginInstalado() {
        return labelPluginInstalado;
    }

    public void setLabelPluginInstalado(JLabel labelPluginInstalado) {
        this.labelPluginInstalado = labelPluginInstalado;
    }

    public JCheckBox getSeletorPlugin() {
        return seletorPlugin;
    }

    public void setSeletorPlugin(JCheckBox seletorPlugin) {
        this.seletorPlugin = seletorPlugin;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seletorPlugin = new javax.swing.JCheckBox();
        labelPluginInstalado = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        seletorPlugin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        seletorPlugin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(seletorPlugin, java.awt.BorderLayout.WEST);

        labelPluginInstalado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPluginInstalado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/univali/ps/ui/icones/Dark/pequeno/all_types.png"))); // NOI18N
        labelPluginInstalado.setText("plugin instalado");
        add(labelPluginInstalado, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelPluginInstalado;
    private javax.swing.JCheckBox seletorPlugin;
    // End of variables declaration//GEN-END:variables
}