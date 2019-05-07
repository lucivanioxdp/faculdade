package com.luaplicattions.app.view.windows;

import com.luaplicattions.app.view.configurators.WindowConfigurator;
import com.luaplicattions.app.view.windows.sales.InformationPanel;
import com.luaplicattions.app.view.windows.sales.SalePanel;
import java.awt.BorderLayout;
import java.awt.LayoutManager;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class SalesWindow extends JInternalFrame{
    //painel de cadastro de produto a vender
    private JPanel panelCart, panelSale;
    //menu inferior de vendas
    private JPanel lowerSalesMenu;
    
    public SalesWindow(){
        initialize();
    }
    
    private void initialize(){
        WindowConfigurator.windowFuncion
        (this, new BorderLayout(), "VENDAS", true, true, true, true);
        mountWindow();
        WindowConfigurator.setWindowSize(this, 500, 200);
        WindowConfigurator.centerWindow(this);
        this.setVisible(true);
        
    }
    
    private void mountWindow(){
        panelCart = InformationPanel.getInstance();
        this.add(panelCart, BorderLayout.WEST);
        panelSale = SalePanel.getInstance();
        this.add(panelSale, BorderLayout.CENTER);     
    }
    
}
