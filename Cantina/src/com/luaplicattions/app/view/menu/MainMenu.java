//classe responsável por configurar o menu de vendas do programa
package com.luaplicattions.app.view.menu;

import com.luaplicattions.app.view.configurators.ComponentsConfigurator;
import com.luaplicattions.app.view.configurators.WindowConfigurator;
import com.luaplicattions.app.view.windows.SalesWindow;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MainMenu extends JPanel{
    //btnbtnOpenClaseCashier é igual a abrir fechar caixa
    private JButton btnOpenCloseCashier, btnCashierHistory, btnNewSale,
                    btnClient,btnOrderHistory, btnBlock, btnClose;
    private ComponentsConfigurator configurator = new ComponentsConfigurator();
    //variavel para facilitar a escrita do caminho dos icones
    private final String source =  "/com/luaplicattions/app/view/images/menuicons/";
    private static MainMenu instance;
    
    private MainMenu(){
        initialize();
    }
    
    public static MainMenu getInstance(){
        if(instance == null){
            instance = new MainMenu();
        }
        return instance;
    }
    
    private void initialize(){
        this.setLayout(new GridLayout(1, 7));
        mountMenu();
        this.setVisible(true);
    }
    
    private void mountMenu(){
        //borda interna para os botões
        Border border = BorderFactory.createEmptyBorder(10,10,10,10);
        //--caixa--
        btnOpenCloseCashier = configurator.btnConfigurator
                //não pode abreviar o caminho do arquivo de imagem pois ao criar o jar irá dar um null pointer exception
        ("<html>Abrir | <br/>Fechar Caixa", null, border, source+"cashier.png");
        btnCashierHistory = configurator.btnConfigurator
        ("<html>Histórico do <br/>Caixa", null, border, source+"cashierhystory.png");

        //--vendas--
        btnNewSale = configurator.btnConfigurator
        ("Nova Venda", null, border, source+"sale.png");
        btnNewSale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JInternalFrame salesWindow = new SalesWindow();
                WindowConfigurator.showWindow(salesWindow);
            }
        });

        //--clientes--
        btnClient = configurator.btnConfigurator
                //imagens está em inglês (images) não esuqeça ¬¬
        ("Clientes", null, border, source+"client.png");
        //--relatórios--
        btnOrderHistory = configurator.btnConfigurator
        ("<html>Histórico de<br/> Vendas", null, border, source+"salehistory.png");
        //--Sair--
        btnBlock = configurator.btnConfigurator
        ("Bloquear", null, border, source+"block.png");
        btnClose = configurator.btnConfigurator
        ("Sair", null, border, source+"close.png");
        
        this.add(btnOpenCloseCashier);
        this.add(btnCashierHistory);
        this.add(btnNewSale);
        this.add(btnClient);
        this.add(btnOrderHistory);
        this.add(btnBlock);
        this.add(btnClose);
    }
        
}
