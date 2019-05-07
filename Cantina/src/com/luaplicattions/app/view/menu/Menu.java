package com.luaplicattions.app.view.menu;

import java.awt.Color;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

public class Menu extends JTabbedPane{
    private static Menu instance;
    
    private Menu(){
        initialize();
    }
    
    public static Menu getInstance(){
        if(instance == null){
            instance = new Menu();
        }
        return instance;
    }
    
    private void initialize(){
        this.add("Principal",MainMenu.getInstance());
        this.add("Produtos",ProductMenu.getInstance());
    }
    
    private JTabbedPane createMenu (){
        return null;
    }
}
