package com.luaplicattions.app.view.main;
import com.luaplicattions.app.view.menu.Menu;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import javax.swing.SwingUtilities;


public class MainScreen extends JFrame {
    private JDesktopPane desktop = new JDesktopPane();
    private JTabbedPane menu;
    private static MainScreen instance;
    
    private MainScreen(){
        super("Cantina");
        initialize();
    }
    
    public static MainScreen getInstance(){
        if(instance == null){
            instance = new MainScreen();
        }
        return instance;
    }
    
    private void initialize(){
        this.setWindowSize();
        //encerra a execução do programa ao fechar a janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //posiciona a janela no meio da área de trabalho
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.add(Menu.getInstance(), BorderLayout.NORTH);
        this.add(desktop, BorderLayout.CENTER);
        this.setVisible(true);
        
    }
    
    //adiciona o JInternalFrame ao JDesktopPane
    public void createWindow(JInternalFrame window){
        desktop.add(window);
    }

    //metodo para ajustar a tela de acordo com a resolução do monitor
    //menos o tamanho do inset para dar um espaçamento entre a janela e a area de trabalho
    private void setWindowSize(){
        int inset = 50;
        //pega qual a resolução da tela do computador e guarda em uma variavel do tipo dimenção
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //define os limites da janela subtraindo o valor de altura e largura de acordo com o valor do inset
        this.setBounds(inset, inset,
                  screenSize.width  - inset*2,
                  screenSize.height - inset*2);
    }
    
    public JDesktopPane getDesktop(){
        return desktop;
    }
    
    //metodo para mover uma tela selecionada para a frente do JDesktop
    public void moveWindowForward(JInternalFrame window){
        window.moveToFront();
    }
    
    public static void main (String[] args){
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
