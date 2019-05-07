package com.luaplicattions.app.view.windows;

import com.luaplicattions.app.view.configurators.WindowConfigurator;
import com.luaplicattions.app.view.windows.products.FooterPanel;
import com.luaplicattions.app.view.windows.products.HeaderPanel;
import com.luaplicattions.app.view.windows.products.TablePanel;
import java.awt.BorderLayout;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class ProductsWindow extends JInternalFrame{
    private JPanel pnlHeader, pnlFooter, pnlTable;
    private static ProductsWindow instance;
    
    public ProductsWindow(){
        initialize();
    }
    
    public static ProductsWindow getInstance(){
        if (instance == null){
            instance = new ProductsWindow();
        }return instance;
    }
    
    private void initialize(){
        WindowConfigurator.setWindowSize(this, 500, 200);
        WindowConfigurator.centerWindow(this);
        WindowConfigurator.windowFuncion
        (this, new BorderLayout(), "PRODUTOS", true, true, true, true);
        mountWindow();
        this.setVisible(true);
    }
    
    private void mountWindow(){
        pnlHeader = HeaderPanel.getInstance();
        pnlTable = TablePanel.getInstance();
        pnlFooter = FooterPanel.getInstance();
        this.add(pnlHeader, BorderLayout.NORTH);
        this.add(pnlTable, BorderLayout.CENTER);
        this.add(pnlFooter, BorderLayout.SOUTH);
    }
}
