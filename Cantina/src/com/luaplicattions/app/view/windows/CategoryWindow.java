package com.luaplicattions.app.view.windows;

import com.luaplicattions.app.view.configurators.WindowConfigurator;
import com.luaplicattions.app.view.windows.category.CategoryPanel;
import java.awt.BorderLayout;
import javax.swing.JInternalFrame;

public class CategoryWindow extends JInternalFrame{
    
    public CategoryWindow(){
        initialize();
    }
    
    private void initialize(){
        WindowConfigurator.setWindowSize(this, 600, 600);
        WindowConfigurator.centerWindow(this);
        mountWindow();
        this.setVisible(true);
    }
    
    private void mountWindow(){
        WindowConfigurator.windowFuncion
        (this, new BorderLayout(), "Categorias", false, true, false, false);
        this.add(CategoryPanel.getInstance(), BorderLayout.CENTER);
    }
        
}
