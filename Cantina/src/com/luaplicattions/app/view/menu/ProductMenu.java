package com.luaplicattions.app.view.menu;

import com.luaplicattions.app.view.configurators.ComponentsConfigurator;
import com.luaplicattions.app.view.configurators.WindowConfigurator;
import com.luaplicattions.app.view.main.MainScreen;
import com.luaplicattions.app.view.windows.CategoryWindow;
import com.luaplicattions.app.view.windows.ProductsWindow;
import com.luaplicattions.app.view.windows.SalesWindow;
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

public class ProductMenu extends JPanel{
    private JButton btnProduct, btnCategory, btnEntryHistory, btnSale;
    private ComponentsConfigurator configurator = new ComponentsConfigurator();
    private final String source =  "/com/luaplicattions/app/view/images/menuicons/";
    private static ProductMenu instance;
    
    private ProductMenu(){
        initialize();
    }
    
    public static ProductMenu getInstance(){
        if (instance == null){
            instance = new ProductMenu();
        }return instance;
    }
    
    private void initialize(){
        this.setLayout(new GridLayout(1, 7));
        mountMenu();
        this.setVisible(true);
    }
    
    private void mountMenu(){
        Border border = BorderFactory.createEmptyBorder(10,10,10,10);
        btnProduct = configurator.btnConfigurator
        ("Produtos", null, border, source+"food.png");
        btnProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JInternalFrame productsWindow = new ProductsWindow();
                WindowConfigurator.showWindow(productsWindow);
            }
        });
        btnCategory = configurator.btnConfigurator
        ("Categorias", null, border, source+"category.png");
        btnCategory.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                JInternalFrame categoryWindow = new CategoryWindow();
                WindowConfigurator.showWindow(categoryWindow);
            }
        
    });
        btnEntryHistory = configurator.btnConfigurator
        ("<html>Histórico de <br/>Entradas e Saidas", null, border, source+"stock_history.png");
        btnSale = configurator.btnConfigurator
        ("Promoções", null, border, source+"stock_sale.png");

        this.add(btnProduct);
        this.add(btnCategory);
        this.add(btnEntryHistory);
        this.add(btnSale);
        //botão vazio só para preencher espaço no GridLayout
        this.add(configurator.createEmptyButton(new JButton()));
        this.add(configurator.createEmptyButton(new JButton()));
        this.add(configurator.createEmptyButton(new JButton()));
    }
}
