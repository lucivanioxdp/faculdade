package com.luaplicattions.app.view.windows.sales;

import com.luaplicattions.app.view.configurators.ComponentsConfigurator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class SalePanel extends JPanel{
    private JButton btnAddProduct, btnRemoveProduct, btnPayment;
    private JLabel lblSubTotal, lblTotal, lblResultSubTotal, lblResulTotal;
    //configutaor e o objeto responsável pelas configurações dos elementos swing
    private ComponentsConfigurator configurator = new ComponentsConfigurator();
    private final String source =  "/com/luaplicattions/app/view/images/icons/";
   private static SalePanel instance;
    
    private SalePanel(){
        initialize();
    }
    
    public static SalePanel getInstance(){
        if(instance == null){
            instance = new SalePanel();
        }return instance;
    }
    
    private void initialize(){
        this.setLayout(new BorderLayout());
        this.setBackground(null);
        this.add(mountRegisterPanel(), BorderLayout.NORTH);
        this.add(mountPaymentPanel(), BorderLayout.SOUTH);
        this.setVisible(true);
    }
    //monta o painel que gerencia a esclusão e adição de produtos
    private JPanel mountRegisterPanel(){
        JPanel pnlRegister = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        Border border = BorderFactory.createEmptyBorder(10,10,10,10);
        btnAddProduct = configurator.btnConfigurator
        ("<html>Adicionar <br/>Produto</html>", null, border, source+"addProduct.png");
        btnRemoveProduct = configurator.btnConfigurator
        ("<html>Remover <br/>Produto<html>", null, border, source+"remove.png");
        pnlRegister.add(btnAddProduct);
        pnlRegister.add(btnRemoveProduct);
        pnlRegister.setVisible(true);
        return pnlRegister;
    }
    
    //aqui vai ficar o metodo de criação da tabela
    
    private JPanel mountPaymentPanel(){
        JPanel paymentPanel = new JPanel(new BorderLayout());
        paymentPanel.add(confirmPaymentPanel(), BorderLayout.SOUTH);
        paymentPanel.add(mountInfoPanel(), BorderLayout.CENTER);
        this.setVisible(true);
        return paymentPanel;
        
    }
    
    private JPanel mountInfoPanel(){
        JPanel infoValues = new JPanel(new GridLayout(2,2));
        Border border = BorderFactory.createEmptyBorder(0,100,20,0);
        infoValues.setBorder(border);
        ComponentsConfigurator configurator = new ComponentsConfigurator();
        lblSubTotal = configurator.configureJLabel
        ("SubTotal:",new Color(30,144,255), new Font("Arial", Font.BOLD, 15));
        lblTotal = configurator.configureJLabel
        ("Total:",new Color(30,144,255), new Font("Arial", Font.BOLD, 15));
        lblResultSubTotal = configurator.configureJLabel
        ("0.00",new Color(30,144,255), new Font("Arial", Font.BOLD, 30));
        lblResulTotal = configurator.configureJLabel
        ("0.00",new Color(30,144,255), new Font("Arial", Font.BOLD, 30));
        
        infoValues.add(lblSubTotal);
        infoValues.add(lblTotal);
        infoValues.add(lblResultSubTotal);
        infoValues.add(lblResulTotal);
        infoValues.setVisible(true);
        return infoValues;
    }
    
    private JPanel confirmPaymentPanel(){
        JPanel pnlConfirm = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        Border border = BorderFactory.createEmptyBorder(10,10,10,10);
        btnPayment = configurator.btnConfigurator
        ("<html>PAGAMENTO<html>", null, border, source+"payment.png");
        pnlConfirm.add(btnPayment);
        pnlConfirm.setVisible(true);
        return pnlConfirm;
    }
}
