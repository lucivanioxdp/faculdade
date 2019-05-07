package com.luaplicattions.app.view.windows.category;

import com.luaplicattions.app.view.configurators.ComponentsConfigurator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class CategoryPanel extends JPanel{
    private JPanel pnlHeader, pnlFooter, pnlTable;
    private JButton btnAdd, btnRemove, btnPrint;
    private final String source =  "/com/luaplicattions/app/view/images/icons/";
    private ComponentsConfigurator configurator = new ComponentsConfigurator();
    private final Border border = BorderFactory.createEmptyBorder(6,6,6,6);
    private static CategoryPanel instance;
    
    private CategoryPanel(){
        initialize();
    }
    
    public static CategoryPanel getInstance(){
        if (instance == null){
            instance = new CategoryPanel();
        }return instance;
    }
    
    private void initialize(){
        this.setLayout(new BorderLayout());
        this.add(mountHeaderPanel(), BorderLayout.NORTH);
        this.add(mountFooterPanel(), BorderLayout.SOUTH);
        this.setVisible(true);
    }
    
    private JPanel mountHeaderPanel(){
        pnlHeader = new JPanel(new FlowLayout(FlowLayout.RIGHT));  
        btnAdd = configurator.btnConfigurator
        (null, border, source+"add.png", "adicionar categoria");
        btnRemove = configurator.btnConfigurator
        (null, border, source+"remove.png", "excluir produto");
        pnlHeader.add(btnAdd);
        pnlHeader.add(btnRemove);
        
        return pnlHeader;
    }
    
    private JPanel mountFooterPanel(){
        pnlFooter = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnPrint = btnPrint = configurator.btnConfigurator
        ("Imprimir", Color.WHITE, border, source+"print.png");
        pnlFooter.add(btnPrint);
        return pnlFooter;
    }
}
