package com.luaplicattions.app.view.windows;

import com.luaplicattions.app.view.configurators.WindowConfigurator;
import com.luaplicattions.app.view.windows.products.AddProducts;
import java.awt.BorderLayout;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class EditProductWindow extends JInternalFrame{
    private JPanel addProducts;
    
    public EditProductWindow(){
        initialize();
    }
    
    private void initialize(){
        /*metodo que cria uma janela de acordo com o tamanho da Janela 
        principal menos a margem especificada*/
                                              //tamanho menos margem externa
        WindowConfigurator.setWindowSize(this, 800, 400);
        WindowConfigurator.centerWindow(this);
        WindowConfigurator.windowFuncion
        (this, new BorderLayout(), "Cadastro de Produtos", true, true, true, true);
        mountWindow();
        this.setVisible(true);
        
    }
    
    private void mountWindow(){
        this.add(AddProducts.getInstance(), BorderLayout.CENTER);
    }
}
