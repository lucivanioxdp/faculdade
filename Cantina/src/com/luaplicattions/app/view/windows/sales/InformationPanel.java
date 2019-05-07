package com.luaplicattions.app.view.windows.sales;

import com.luaplicattions.app.view.configurators.ComponentsConfigurator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class InformationPanel extends JPanel{
    //Amount significa quantidade/montante
    //UnitPrice é o preço da unidade
    private JTextField txtStatusCashier, txtNote;
    private JLabel lblCashier,lblNote, lblClient;
    private JButton btnCancel, btnBack;
    private JComboBox  cbCashier, cbClient;
    private final Border border = BorderFactory.createEmptyBorder(150, 10, 10, 10);
    private ComponentsConfigurator configurator = new ComponentsConfigurator();
    private final String source =  "/com/luaplicattions/app/view/images/icons/";
    private static InformationPanel instance;
        
    
    private InformationPanel(){
        initialize();
    }
    
    public static InformationPanel getInstance(){
        if (instance == null){
            instance = new InformationPanel();
        }
        return instance;
    }
    
    private void initialize(){
        this.setLayout(new BorderLayout());
        //cor de fundo azul
        this.setBackground(new Color(30,144,255));
        this.add(BorderLayout.NORTH, statusCashier());
        this.add(BorderLayout.CENTER, infoSale());
        this.add(BorderLayout.SOUTH, cancelSale());
        this.setVisible(true);
    }
    
    private JPanel statusCashier(){
        JPanel status = new JPanel(new GridLayout(1,1));
        status.setBackground(null);
        txtStatusCashier = new JTextField("CAIXA ABERTO");
        txtStatusCashier.setBackground(new Color(0,255,0));
        txtStatusCashier.setFont(new Font("Arial", Font.BOLD, 18));
        txtStatusCashier.setEditable(false);
        txtStatusCashier.setForeground(new Color(255, 255, 255));
        status.add(txtStatusCashier);
        return status;
    }
    
    private JPanel infoSale(){
        JPanel info = new JPanel(new GridLayout(7, 1));
        info.setBackground(null);
        info.setBorder(border);
        lblCashier = configurator.configureJLabel
        ("Atendente:", new Color(255,255,255), new Font("Arial,", Font.BOLD, 15));
        cbCashier = new JComboBox();
        lblNote = configurator.configureJLabel
        ("Observação:", new Color(255,255,255), new Font("Arial,", Font.BOLD, 15));
        txtNote = new JTextField();
        lblClient = configurator.configureJLabel
        ("Cliente:", new Color(255,255,255), new Font("Arial,", Font.BOLD, 15));
        cbClient = new JComboBox();
        
        info.add(lblCashier);
        info.add(cbCashier);
        info.add(lblNote);
        info.add(txtNote);
        info.add(lblClient);
        info.add(cbClient);
        return info;
    }
    
    private JPanel cancelSale(){
        JPanel cancel = new JPanel(new GridLayout(2,1, 10, 10));
        cancel.setBorder(border);
        cancel.setBackground(null);
        Border borderBtn = BorderFactory.createEmptyBorder(10,10,10,10);
        btnCancel = configurator.btnConfigurator
        ("<html>Cancelar <br/>Pedido</html>", Color.WHITE, borderBtn, source+"cancel-sale.png");
        btnBack = configurator.btnConfigurator
        ("Voltar", Color.WHITE, borderBtn, source+"back.png");
        cancel.add(btnCancel);
        cancel.add(btnBack);
        return cancel;
    }
    
}
