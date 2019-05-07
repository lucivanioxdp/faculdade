package com.unip.app.view.panels;

import com.unip.app.model.Adjacencia;
import com.unip.app.model.Lista;
import com.unip.app.model.NomeVertice;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VerticeLista extends JPanel{
    private String nomeVertice = "v1";
    private List <Adjacencia> adjacentes;
    private JLabel lblNome;
    private JTextField txPeso1, txPeso2, txPeso3, txPeso4, txPeso5,
                        txPeso6, txPeso7, txPeso8, txPeso9, txPeso10;
    private JComboBox adj1, adj2, adj3, adj4, adj5,
                        adj6, adj7, adj8, adj9, adj10;
    
    public VerticeLista(String nomeVertice){
        this.nomeVertice = nomeVertice;
        initialize();
    }
    
    private void initialize(){
       this.setLayout(new FlowLayout());
       montaPainelVertice();
       this.setVisible(true);
    }
    
    private void montaPainelVertice(){
        String descricaoPeso = "Insira o peso do vertice (sem peso = 0)";
        txPeso1 = new JTextField("1"); 
            txPeso1.setToolTipText(descricaoPeso);
        txPeso2 = new JTextField("1");  
            txPeso2.setToolTipText(descricaoPeso);
        txPeso3 = new JTextField("1");  
            txPeso3.setToolTipText(descricaoPeso);
        txPeso4 = new JTextField("1");  
            txPeso4.setToolTipText(descricaoPeso);
        txPeso5 = new JTextField("1");  
            txPeso5.setToolTipText(descricaoPeso);
        txPeso6 = new JTextField("1"); 
            txPeso6.setToolTipText(descricaoPeso);
        txPeso7 = new JTextField("1"); 
            txPeso7.setToolTipText(descricaoPeso);
        txPeso8 = new JTextField("1"); 
            txPeso8.setToolTipText(descricaoPeso);
        txPeso9 = new JTextField("1"); 
            txPeso9.setToolTipText(descricaoPeso);
        txPeso10 = new JTextField("1");
            txPeso10.setToolTipText(descricaoPeso);
        
       String descricaoCbx = "Selecione o Vertice Adjacente"; 
       adj1 = new JComboBox(NomeVertice.values()); 
        adj1.setToolTipText(descricaoCbx);
        adj1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(adj1.getSelectedIndex() > Lista.getInstance().getTamanhoLista()){
                    JOptionPane.showMessageDialog
                    (null, "Este vertice não existe nesse Grafo,"+
                        " selecione um vertice menor ou igual ao tamanho do grafo");
                    
                    adj1.setSelectedIndex(0);
                }
                
            }
        });
       adj2 = new JComboBox(NomeVertice.values()); 
        adj2.setToolTipText(descricaoCbx);
        adj2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(adj2.getSelectedIndex() > Lista.getInstance().getTamanhoLista()){
                    JOptionPane.showMessageDialog
                    (null, "Este vertice não existe nesse Grafo,"+
                        " selecione um vertice menor ou igual ao tamanho do grafo");
                    
                    adj2.setSelectedIndex(0);
                }
                
            }
        });
       adj3 = new JComboBox(NomeVertice.values());
        adj3.setToolTipText(descricaoCbx);
        adj3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(adj3.getSelectedIndex() > Lista.getInstance().getTamanhoLista()){
                    JOptionPane.showMessageDialog
                    (null, "Este vertice não existe nesse Grafo,"+
                        " selecione um vertice menor ou igual ao tamanho do grafo");
                    
                    adj3.setSelectedIndex(0);
                }
                
            }
        });
       adj4 = new JComboBox(NomeVertice.values());
        adj4.setToolTipText(descricaoCbx);
        adj4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(adj4.getSelectedIndex() > Lista.getInstance().getTamanhoLista()){
                    JOptionPane.showMessageDialog
                    (null, "Este vertice não existe nesse Grafo,"+
                        " selecione um vertice menor ou igual ao tamanho do grafo");
                    
                    adj4.setSelectedIndex(0);
                }
                
            }
        });
       adj5 = new JComboBox(NomeVertice.values());
        adj5.setToolTipText(descricaoCbx);
        adj5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(adj5.getSelectedIndex() > Lista.getInstance().getTamanhoLista()){
                    JOptionPane.showMessageDialog
                    (null, "Este vertice não existe nesse Grafo,"+
                        " selecione um vertice menor ou igual ao tamanho do grafo");
                    
                    adj5.setSelectedIndex(0);
                }
                
            }
        });
       adj6 = new JComboBox(NomeVertice.values());
        adj6.setToolTipText(descricaoCbx);
        adj6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(adj6.getSelectedIndex() > Lista.getInstance().getTamanhoLista()){
                    JOptionPane.showMessageDialog
                    (null, "Este vertice não existe nesse Grafo,"+
                        " selecione um vertice menor ou igual ao tamanho do grafo");
                    
                    adj6.setSelectedIndex(0);
                }
                
            }
        });
       adj7 = new JComboBox(NomeVertice.values());
        adj7.setToolTipText(descricaoCbx);
        adj7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(adj7.getSelectedIndex() > Lista.getInstance().getTamanhoLista()){
                    JOptionPane.showMessageDialog
                    (null, "Este vertice não existe nesse Grafo,"+
                        " selecione um vertice menor ou igual ao tamanho do grafo");
                    
                    adj7.setSelectedIndex(0);
                }
                
            }
        });
       adj8 = new JComboBox(NomeVertice.values());
        adj8.setToolTipText(descricaoCbx);
        adj8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(adj8.getSelectedIndex() > Lista.getInstance().getTamanhoLista()){
                    JOptionPane.showMessageDialog
                    (null, "Este vertice não existe nesse Grafo,"+
                        " selecione um vertice menor ou igual ao tamanho do grafo");
                    
                    adj8.setSelectedIndex(0);
                }
                
            }
        });
       adj9 = new JComboBox(NomeVertice.values());
        adj9.setToolTipText(descricaoCbx);
        adj9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(adj9.getSelectedIndex() > Lista.getInstance().getTamanhoLista()){
                    JOptionPane.showMessageDialog
                    (null, "Este vertice não existe nesse Grafo,"+
                        " selecione um vertice menor ou igual ao tamanho do grafo");
                    
                    adj9.setSelectedIndex(0);
                }
                
            }
        });
       adj10 = new JComboBox(NomeVertice.values());
        adj10.setToolTipText(descricaoCbx);
        adj10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(adj10.getSelectedIndex() > Lista.getInstance().getTamanhoLista()){
                    JOptionPane.showMessageDialog
                    (null, "Este vertice não existe nesse Grafo,"+
                        " selecione um vertice menor ou igual ao tamanho do grafo");
                    
                    adj10.setSelectedIndex(0);
                }
                
            }
        });
       
       lblNome = new JLabel(nomeVertice);
        this.add(lblNome);
        this.add(adj1);
        this.add(txPeso1);
            this.add(new JLabel("-->"));
        this.add(adj2);
        this.add(txPeso2);
            this.add(new JLabel("-->"));
        this.add(adj3);
        this.add(txPeso3);
            this.add(new JLabel("-->"));
        this.add(adj4);
        this.add(txPeso4);
            this.add(new JLabel("-->"));
        this.add(adj5);
        this.add(txPeso5);
            this.add(new JLabel("-->"));
        this.add(adj6);
        this.add(txPeso6);
            this.add(new JLabel("-->"));
        this.add(adj7);
        this.add(txPeso7);
            this.add(new JLabel("-->"));

    }
    
    public String getNome(){
        return nomeVertice;
    }
    
    public List <Adjacencia> getAdjacentes(){
        int contador = 0;
        adjacentes = new ArrayList<>();
        if(adj1.getSelectedIndex() != 0){
            Adjacencia adjacente = new Adjacencia
               (adj1.getSelectedItem().toString(), Integer.parseInt(txPeso1.getText()));
            adjacentes.add(contador++, adjacente);
        }
        
        if(adj2.getSelectedIndex() != 0){
            Adjacencia adjacente = new Adjacencia
               (adj2.getSelectedItem().toString(), Integer.parseInt(txPeso2.getText()));
            adjacentes.add(contador++, adjacente);
        }
        
        if(adj3.getSelectedIndex() != 0){
            Adjacencia adjacente = new Adjacencia
               (adj3.getSelectedItem().toString(), Integer.parseInt(txPeso3.getText()));
            adjacentes.add(contador++, adjacente);
        }
        
        if(adj4.getSelectedIndex() != 0){
            Adjacencia adjacente = new Adjacencia
               (adj4.getSelectedItem().toString(), Integer.parseInt(txPeso4.getText()));
            adjacentes.add(contador++, adjacente);
        }
        
        if(adj5.getSelectedIndex() != 0){
            Adjacencia adjacente = new Adjacencia
               (adj5.getSelectedItem().toString(), Integer.parseInt(txPeso5.getText()));
            adjacentes.add(contador++, adjacente);
        }
        
        if(adj6.getSelectedIndex() != 0){
            Adjacencia adjacente = new Adjacencia
               (adj6.getSelectedItem().toString(), Integer.parseInt(txPeso6.getText()));
            adjacentes.add(contador++, adjacente);
        }
        
        if(adj7.getSelectedIndex() != 0){
            Adjacencia adjacente = new Adjacencia
               (adj7.getSelectedItem().toString(), Integer.parseInt(txPeso7.getText()));
            adjacentes.add(contador++, adjacente);
        }
        
        if(adj8.getSelectedIndex() != 0){
            Adjacencia adjacente = new Adjacencia
               (adj8.getSelectedItem().toString(), Integer.parseInt(txPeso8.getText()));
            adjacentes.add(contador++, adjacente);
        }
        
        if(adj9.getSelectedIndex() != 0){
            Adjacencia adjacente = new Adjacencia
               (adj9.getSelectedItem().toString(), Integer.parseInt(txPeso9.getText()));
            adjacentes.add(contador++, adjacente);
        }
        
        if(adj10.getSelectedIndex() != 0){
            Adjacencia adjacente = new Adjacencia
               (adj10.getSelectedItem().toString(), Integer.parseInt(txPeso10.getText()));
            adjacentes.add(contador++, adjacente);
        }
        return adjacentes;
    }
    
}
