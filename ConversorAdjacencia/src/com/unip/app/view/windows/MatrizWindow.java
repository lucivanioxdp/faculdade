package com.unip.app.view.windows;

import com.unip.app.view.configurator.WindowConfigurator;
import com.unip.app.view.panels.ConvertPanel;
import com.unip.app.view.panels.MatrizFormPanel;
import com.unip.app.view.panels.MatrizPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class MatrizWindow extends JInternalFrame{
    private static MatrizWindow instance;
    JButton btnConfirmar;
    
    public MatrizWindow(){
        initialize();
    }
    
    public static MatrizWindow getInstance(){
        if (instance == null){
            instance = new MatrizWindow();
        }return instance;
    }
    private void initialize(){
        WindowConfigurator.setWindowSize(this, 400, 400);
        WindowConfigurator.centerWindow(this);
        mountWindow();
        this.setVisible(true);
    }
    
    private void mountWindow(){
        WindowConfigurator.windowFuncion
        (this, new BorderLayout(), "Matriz", true, true, true, true);
        this.add(MatrizPanel.getInstance(), BorderLayout.CENTER);
        this.add(new MatrizFormPanel(), BorderLayout.EAST);
        this.add(mountPnlButtons(), BorderLayout.SOUTH);
    }
    
    public void closeWindow(){
        this.dispose();
    }
    
    private JPanel mountPnlButtons(){
        JPanel pnlButtons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btnConfirmar = new JButton("Confirmar");
            btnConfirmar.setMnemonic(KeyEvent.VK_D);
            btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConvertPanel.getInstance().addMatrizOption();
                closeWindow();
            }
        });
        pnlButtons.add(btnConfirmar);
        return pnlButtons;
    }
}
