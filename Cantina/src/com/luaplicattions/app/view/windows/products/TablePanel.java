package com.luaplicattions.app.view.windows.products;

import com.luaplicattions.app.model.beans.Product;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;

public class TablePanel extends JPanel{
    private JTable tbProducts;
    private static TablePanel instance;
    
    private TablePanel(){
        initialize();
    }
    
    public static TablePanel getInstance(){
        if(instance == null){
            instance = new TablePanel();
        } return instance;
    }
    
    private void initialize(){
        this.setLayout(new BorderLayout());
        this.add(createTable(), BorderLayout.CENTER);
        this.setVisible(true);
    }
    
    private JScrollPane createTable(){
       //Lista de Testes - apagar
        List <Product> product = new ArrayList <Product>();
        product.add(new Product());
        //------------------------
        ProductsTableModel productsTableModel = new ProductsTableModel(product);
        tbProducts = new JTable(productsTableModel);
        tbProducts.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scroll = new JScrollPane(tbProducts);
        Border border = BorderFactory.createEmptyBorder(10,20,10,20);
        scroll.setBorder(border);
        return scroll;
    }
}
