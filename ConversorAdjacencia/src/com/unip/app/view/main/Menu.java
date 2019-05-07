package com.unip.app.view.main;

import com.unip.app.view.configurator.ComponentsConfigurator;
import com.unip.app.view.configurator.WindowConfigurator;
import com.unip.app.view.windows.ConvertWindow;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Menu extends JPanel{
    private JButton btnConvert, btnCategory, btnEntryHistory, btnSale;
    private ComponentsConfigurator configurator = new ComponentsConfigurator();
    private final String source =  "/com/unip/app/view/images/";
    private static Menu instance;
    
    private Menu(){
        initialize();
    }
    
    public static Menu getInstance(){
        if (instance == null){
            instance = new Menu();
        }return instance;
    }
    
    private void initialize(){
        this.setLayout(new GridLayout(1, 7));
        mountMenu();
        this.setVisible(true);
    }
    
    private void mountMenu(){
        Border border = BorderFactory.createEmptyBorder(10,10,10,10);
        btnConvert = configurator.btnConfigurator
        ("<html>Painel<br/> de Conversão", null, border, source+"convert-icon.png");
        btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JInternalFrame convertWindow = new ConvertWindow();
                WindowConfigurator.showWindow(convertWindow);
                btnConvert.setEnabled(false);
            }
        });
        //botão vazio só para preencher espaço no GridLayout
        this.add(btnConvert);
        this.add(configurator.createEmptyButton(new JButton()));
        this.add(configurator.createEmptyButton(new JButton()));
        this.add(configurator.createEmptyButton(new JButton()));
    }
    
    public void ativaBotaoConverter(){
        btnConvert.setEnabled(true);
    }
}
