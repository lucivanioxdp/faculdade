package com.luaplicattions.app.view.windows.products;

import com.luaplicattions.app.view.configurators.ComponentsConfigurator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class AddProducts extends JPanel{
    private JPanel pnlForm, pnlButtons;
    private JTextField txtId, txtName, txtCostPrice, txtPrice, txtSize;
    private JComboBox cbxCategory, cbxSize;
    private JLabel lblId, lblCategory, lblName, lblCostPrice, lblPrice,lblSize;
    private JButton btnCancel, btnSave;
    private ComponentsConfigurator configurator = new ComponentsConfigurator();
    private final String source =  "/com/luaplicattions/app/view/images/icons/";
    private static AddProducts instance;
    
    private AddProducts(){
        initialize();
    }
    
    public static AddProducts getInstance(){
        if(instance == null){
            instance = new AddProducts();
        }return instance;
    }
    
    private void initialize(){
        this.setLayout(new BorderLayout());
        this.add(mountPnlForm(), BorderLayout.CENTER);
        this.add(mountPnlButtons(), BorderLayout.SOUTH);
        Border border = BorderFactory.createEmptyBorder(20,20,20,20);
        this.setBorder(border);
        this.setVisible(true);
    }
    
    private JPanel mountPnlForm(){
        pnlForm = new JPanel(new GridLayout(12,1));
        lblCategory = configurator.configureJLabel
            ("Categoria:", new Color(30,144,255), new Font("Arial", Font.BOLD, 12));
        cbxCategory = new JComboBox();
        lblName = configurator.configureJLabel
            ("Nome do Produto:", new Color(30,144,255), new Font("Arial", Font.BOLD, 12));
        txtName = new JTextField();
        lblCostPrice = configurator.configureJLabel
            ("Preco de Custo:", new Color(30,144,255), new Font("Arial", Font.BOLD, 12));
        txtCostPrice = new JTextField();
        lblPrice = configurator.configureJLabel
            ("Preço do produto:", new Color(30,144,255), new Font("Arial", Font.BOLD, 12));
        txtPrice = new JTextField();
        lblSize = configurator.configureJLabel
            ("Tipo de Medida:", new Color(30,144,255), new Font("Arial", Font.BOLD, 12));
        
        SizeType[] tipoMedida = SizeType.values();
        cbxSize = new JComboBox(tipoMedida);
        
        pnlForm.add(mountPnlId());
        pnlForm.add(lblCategory);
        pnlForm.add(cbxCategory);
        pnlForm.add(lblName);
        pnlForm.add(txtName);
        pnlForm.add(lblCostPrice);
        pnlForm.add(txtCostPrice);
        pnlForm.add(lblPrice);
        pnlForm.add(txtPrice);
        pnlForm.add(lblSize);
        pnlForm.add(cbxSize);
        
        return pnlForm;
    }
    
    private JPanel mountPnlId(){
        JPanel pnlId = new JPanel(new GridLayout(1,3));
        lblId = configurator.configureJLabel
            ("CÓDIGO:", new Color(30,144,255), new Font("Calibri", Font.BOLD, 14));
        txtId = new JTextField("0");
        txtId.setBorder(null);
        txtId.setEnabled(false);
        pnlId.add(lblId);
        pnlId.add(txtId);
        pnlId.add(new JLabel());
        Border border = 
             BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(30,144,255));
        pnlId.setBorder(border);
        return pnlId;
    }
    
    private JPanel mountPnlButtons(){
        pnlButtons = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        //borda do botão
        Border border = BorderFactory.createEmptyBorder(10,10,10,10);
        //metodo criado para configurar botões
        btnCancel = configurator.btnConfigurator
            (null, border, source+"cancel-product.png", "Cancelar");
        btnSave = configurator.btnConfigurator
            (null, border, source+"save-product.png", "Salvar Produto");
        pnlButtons.add(btnCancel);
        pnlButtons.add(btnSave);
        return pnlButtons;
    }
}
