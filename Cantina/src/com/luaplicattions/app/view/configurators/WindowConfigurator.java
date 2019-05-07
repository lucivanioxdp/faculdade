//classe responsável pela configuração de todas as janelas interbnas do sistema.
package com.luaplicattions.app.view.configurators;

import com.luaplicattions.app.view.main.MainScreen;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

public class WindowConfigurator {
    
    public static void setWindowSize (JInternalFrame window, int w, int h){
        Dimension size = MainScreen.getInstance().getSize();
        //a dimenção w| H sempre vem em double logo é necessário converte-la para int
        int width = (int)size.getWidth() - w;
        int height = (int)size.getHeight() - h;
        window.setSize(width, height);
    }
    
    public static void windowFuncion
        (JInternalFrame frame, LayoutManager layout, String title, boolean resizable, 
                boolean closable, boolean maximizable, boolean iconifiable){
        
        frame.setLayout(layout);
        //adiciona titulo a janela
        frame.setTitle(title);
        //habilita o botão retaurar
        frame.setResizable(resizable);
        //habilita o botão fechar
        frame.setClosable(closable);
        //habilita o batão maximizar
        frame.setMaximizable(maximizable);
        //habilita o icone da janela
        frame.setIconifiable(iconifiable);
    }
        
    public static void centerWindow(JInternalFrame window){
        //pega o tamnho atual do DesktopPane da tela principal
        Dimension d = MainScreen.getInstance().getDesktop().getSize();
        window.setLocation
        ((d.width - window.getSize().width)/2, (d.height - window.getSize().height)/2);
    }
    
    //metodo para criar, exibir e configurar o foco das janelas no projeto
    public static void showWindow(JInternalFrame window){
        MainScreen.getInstance().createWindow(window);
        //move a janela para a frente das demais
        MainScreen.getInstance().moveWindowForward(window);
        try {
            //seleciona a janela criada como principal e da foco para a mesma
            window.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(WindowConfigurator.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
}
