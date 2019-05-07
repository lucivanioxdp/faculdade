package com.luaplicattions.app.view.windows.products;

import com.luaplicattions.app.view.configurators.ComponentsConfigurator;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class FooterPanel extends JPanel{
    private JButton btnPrint;
    private ComponentsConfigurator configurator = new ComponentsConfigurator();
    private final String source =  "/com/luaplicattions/app/view/images/icons/";
    private static FooterPanel instance;
    
    private FooterPanel(){
        initialize();
    }
    
    public static FooterPanel getInstance(){
        if (instance == null){
            instance = new FooterPanel();
        }return instance;
    }
    
    private void initialize(){
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        mountPanel();
        this.setBackground(null);
        this.setVisible(true);
    }
    
    private void mountPanel(){
        Border border = BorderFactory.createEmptyBorder(10,10,10,10);
        btnPrint = configurator.btnConfigurator
        ("Imprimir", Color.WHITE, border, source+"print.png");
        this.add(btnPrint);
    }
    
}
