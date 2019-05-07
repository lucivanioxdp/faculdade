package com.unip.app.view.main;

import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class MainScreen extends JFrame{
    private JDesktopPane desktop = new JDesktopPane();
    private static MainScreen instance;
    
    private MainScreen(){
        initialize();
    }
    
    public static MainScreen getInstance(){
        if(instance == null){
            instance = new MainScreen();
        }return instance;
    }
    
    private void initialize(){
        this.setWindowSize();
        //encerra a execução do programa ao fechar a janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //posiciona a janela no meio da área de trabalho
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.add(fundo(), BorderLayout.CENTER);
        this.add(Menu.getInstance(), BorderLayout.NORTH);
        desktop.setOpaque(false);
        this.add(desktop, BorderLayout.CENTER);
        this.setVisible(true);
       }
    
    private void setWindowSize(){
        int inset = 30;
        //pega qual a resolução da tela do computador e guarda em uma variavel do tipo dimenção
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //define os limites da janela subtraindo o valor de altura e largura de acordo com o valor do inset
        this.setBounds(inset, inset,
                  screenSize.width  - inset*2,
                  screenSize.height - inset*2);
    }
    
    public void addWindow(JInternalFrame window){
        desktop.add(window);
    }
    
    public void moveWindowForward(JInternalFrame window){
        window.moveToFront();
    }
    
    public JDesktopPane getDesktop(){
        return desktop;
    }
    
    public JPanel fundo(){
        JPanel fundo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel img = new JLabel();
        String source =  "/com/unip/app/view/images/";
        ImageIcon icon = new ImageIcon(getClass().getResource(source+"grafo.png"));
        img.setIcon(icon);
        img.setLocation(0,0);
        fundo.add(img);
        return fundo;
    }
    
    public static void main(String[] args){
        try {
            //aplica o look and feel ao JFrame (TRUE configura a borda e FALSE nao configura).
            UIManager.put("Synthetica.window.decoration", Boolean.TRUE);
             //carrega o gerenciador de layouts UIMananger do Java
             //para a skin da synthetica funcionar devem-se carregar dois jars, um default da sintetica e o outro do layout que deseja utilizar.
            UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
            MainScreen.getInstance();
            }
            catch(Exception e) {
                e.printStackTrace();
            }
    }
}
