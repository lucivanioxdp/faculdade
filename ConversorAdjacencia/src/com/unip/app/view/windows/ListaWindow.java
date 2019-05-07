package com.unip.app.view.windows;

import com.unip.app.view.configurator.WindowConfigurator;
import com.unip.app.view.panels.ConvertPanel;
import com.unip.app.view.panels.PainelLista;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class ListaWindow extends JInternalFrame{
    JButton btnConfirmar;
    private static ListaWindow instance;
    
    public ListaWindow(){
        initialize();
    }
    
    public static ListaWindow getInstance(){
        if (instance == null){
            instance = new ListaWindow();
        }return instance;
    }
    private void initialize(){
        this.setLayout(new BorderLayout());
        WindowConfigurator.setWindowSize(this, 400, 400);
        WindowConfigurator.centerWindow(this);
        mountWindow();
        
        this.setVisible(true);
    }
    
    private void mountWindow(){
        WindowConfigurator.windowFuncion
        (this, new BorderLayout(), "Lista Adjacência", true, true, true, true);
        this.add(PainelLista.getInstance(), BorderLayout.CENTER);
        this.add(mountPnlButtons(), BorderLayout.SOUTH);
    }
    
    private JPanel mountPnlButtons(){
        JPanel pnlButtons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btnConfirmar = new JButton("Confirmar");
            btnConfirmar.setMnemonic(KeyEvent.VK_D);
            btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConvertPanel.getInstance().addListaOption();
                closeWindow();  
            }
        });
        pnlButtons.add(btnConfirmar);
        return pnlButtons;
    }
    public void closeWindow(){
        this.dispose();
    }
}
