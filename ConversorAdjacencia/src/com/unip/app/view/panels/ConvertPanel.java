package com.unip.app.view.panels;

import com.unip.app.model.Lista;
import com.unip.app.model.Matriz;
import com.unip.app.view.configurator.ComponentsConfigurator;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class ConvertPanel extends JPanel{
    private JPanel pnlButtons, pnlSelectOption, pnlListas = new JPanel(new GridLayout(10, 1));;
    private JButton btnMatriz, btnList;
    private ComponentsConfigurator configurator = new ComponentsConfigurator();
    private final String source = "/com/unip/app/view/images/";
            
    private static ConvertPanel instance;
    
    private ConvertPanel(){
        initialize();
    }
    
    public static ConvertPanel getInstance(){
        if (instance == null){
            instance = new ConvertPanel();
        }return instance;
    }
    
    private void initialize(){
        this.setLayout(new BorderLayout());
        this.add(mountBtnPanel(), BorderLayout.NORTH);
        this.setVisible(true);
        this.add(montaPainelSelecao(), BorderLayout.CENTER);
        this.add(cancelar(), BorderLayout.SOUTH);
        Border border = BorderFactory.createTitledBorder("Painel de Criação");
        this.setBorder(border);
        this.setVisible(true);
    }
    
    private JPanel mountBtnPanel(){
        JPanel pnl = new JPanel (new BorderLayout());
        JPanel pnlTexto = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlButtons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Border border = BorderFactory.createEmptyBorder(10,10,10,10);
        btnMatriz = configurator.btnConfigurator
        ("<html>Matriz<br/>Adjacência", null, border, source+"matriz.png");
            btnMatriz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Matriz.getInstance().setTamanhoMatriz();
            }
        });
        btnList = configurator.btnConfigurator
        ("<html>Lista<br/>Adjacência", null, border, source+"lista.png");
            btnList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Lista.getInstance().setTamanhoLista();
            }
        });
        pnlButtons.add(btnMatriz);
        pnlButtons.add(btnList);
        pnlTexto.add(new JLabel("SELECIONE UMA OPÇÃO A SER CONVERTIDA"));
        pnl.add(BorderLayout.NORTH, pnlTexto);
        pnl.add(BorderLayout.CENTER, pnlButtons);
        return pnl;
    }
    
    private JPanel cancelar(){
        JPanel cancelar = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnCancelar = new JButton("Cancelar");
            btnCancelar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    pnlSelectOption.removeAll();
                    pnlSelectOption.revalidate();
                    pnlSelectOption.repaint();
                }
            });
        cancelar.add(btnCancelar);
        return cancelar;
    }
    
    private JPanel montaPainelSelecao(){
        pnlSelectOption = new JPanel(new FlowLayout());
 
        return pnlSelectOption;
    }
    
    public void addMatrizOption(){
        pnlSelectOption.removeAll();
        JScrollPane scroll = MatrizPanel.getInstance().createTable();
        pnlSelectOption.add(scroll);
        pnlSelectOption.repaint();
    }
    
    public void addListaOption(){
        pnlSelectOption.removeAll();
        pnlSelectOption.add(PainelLista.getInstance().desenhaListas(), BorderLayout.CENTER);
        pnlSelectOption.repaint();
    }
    
}
