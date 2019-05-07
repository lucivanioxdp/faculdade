package com.unip.app.view.windows;

import com.unip.app.view.configurator.WindowConfigurator;
import com.unip.app.view.main.Menu;
import com.unip.app.view.panels.ConvertPanel;
import com.unip.app.view.panels.PainelResultConversao;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class ConvertWindow extends JInternalFrame{
    private static ConvertWindow instance;
    
    
    public ConvertWindow(){
        initialize();
    }
    
    private void initialize(){
        WindowConfigurator.setWindowSize(this, 100, 100);
        WindowConfigurator.centerWindow(this);
        controladorJanela();
        mountWindow();
        this.setVisible(true);
    }
    
    private void mountWindow(){
        WindowConfigurator.windowFuncion
        (this, new BorderLayout(), "Conversão", false, true, false, false);
        JPanel pnl = new JPanel(new GridLayout(2,1));
        pnl.add(ConvertPanel.getInstance());
        pnl.add(PainelResultConversao.getInstance());
        this.add(pnl, BorderLayout.CENTER);
    }
    
    public void controladorJanela(){
    this.addInternalFrameListener(new javax.swing.event.InternalFrameListener()
        {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt)
            {
                Menu.getInstance().ativaBotaoConverter();
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt)
            {
            }
        });
    }
}
