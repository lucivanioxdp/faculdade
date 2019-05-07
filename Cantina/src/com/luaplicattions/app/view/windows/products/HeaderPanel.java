package com.luaplicattions.app.view.windows.products;

import com.luaplicattions.app.view.configurators.ComponentsConfigurator;
import com.luaplicattions.app.view.configurators.WindowConfigurator;
import com.luaplicattions.app.view.main.MainScreen;
import com.luaplicattions.app.view.windows.EditProductWindow;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class HeaderPanel extends JPanel{
    private JTextField txtSearch;
    private JButton btnSearch, btnEdit, btnNew, btnDelete;
    private ComponentsConfigurator configurator = new ComponentsConfigurator();
    private final String source =  "/com/luaplicattions/app/view/images/icons/";
    private static HeaderPanel instance;
    
    private HeaderPanel(){
        initialize();
    }
    
    public static HeaderPanel getInstance(){
        if(instance == null){
            instance = new HeaderPanel();
        }return instance;
    }
    
    private void initialize(){
        this.setLayout(new BorderLayout());
        mountPanel();
        this.setVisible(true);
    }
    
    private void mountPanel(){
        this.add(mountSearchPanel(), BorderLayout.WEST);
        this.add(mountButtonsForm(), BorderLayout.CENTER);
    }
    
    private JPanel mountSearchPanel(){
        Border border = BorderFactory.createEmptyBorder(6,6,6,6);
        JPanel search = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtSearch = new JTextField("Pesquisar...");
        txtSearch.setColumns(15);
        btnSearch = configurator.btnConfigurator
        ("", null, border, source+"search.png");
        search.add(btnSearch);
        search.add(txtSearch);
        search.setBackground(null);
        return search;
    }
    
    private JPanel mountButtonsForm(){
        Border border = BorderFactory.createEmptyBorder(6,6,6,6);
        JPanel buttonsForm = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnEdit = configurator.btnConfigurator
        (null, border, source+"edit.png", "editar produto");
        btnNew = configurator.btnConfigurator
        (null, border, source+"add.png", "adicionar produto");
        /*aqui vai ficar a ação que irá abrir a janela de adição de produtos ao 
        banco de dados*/
            btnNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JInternalFrame addProduct = new EditProductWindow();
                WindowConfigurator.showWindow(addProduct);
            }
        });
        
        btnDelete = configurator.btnConfigurator
        (null, border, source+"remove.png", "excluir produto");
        
        buttonsForm.add(btnEdit);
        buttonsForm.add(btnNew);
        buttonsForm.add(btnDelete);
        buttonsForm.setBackground(null);
        return buttonsForm; 
    }
}
