/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monster.island;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Omar xv
 */
public class Menu extends JFrame{
    private JButton btn1; 
    private JLabel dragon, segundon, fondillo, ayuda;
    public boolean openedOnce;
    public Menu()
    {
        super();
        ayuda = new JLabel(new ImageIcon("imagenes/menu/Ayuda.jpg"));
        dragon= new JLabel(new ImageIcon("imagenes/menu/1.gif"));
        fondillo = new JLabel(new ImageIcon("imagenes/menu/fondo.jpg"));
        setContentPane(fondillo);
        segundon= new JLabel(new ImageIcon());    
        fondillo = new JLabel();
        ayuda.setLocation(325,275);
        ayuda.setSize(150,50);
        segundon.setSize(200,200);
        segundon.setLocation(320,50);
        dragon.setSize(200,200);
        dragon.setLocation(75,50);
        setLayout(null);
        ayuda.addMouseListener(new MouseAdapter(){
            public void MouseClicked(MouseEvent e) {
                getMe().setVisible(false);
                new Ayuda(getMe());
            }
        });
        dragon.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                Tablero tablero= new Tablero();
                tablero.setVisible(true);
                getMe().setVisible(false);
                tablero.addWindowListener(new WindowAdapter(){
                    @Override
                    public void windowClosing(WindowEvent we) {
                    getMe().setVisible(true);
            }
        });
            }
            public void mouseEntered(MouseEvent e) {
                dragon.setIcon(new ImageIcon(getClass().getResource("imagenes/menu/2.jpg")));
            }
            public void mouseExited(MouseEvent e) {
                dragon.setIcon(new ImageIcon("imagenes/menu/1.gif"));
            }
        });
        segundon.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                Tablero tablero= new Tablero();
                tablero.setVisible(true);
                getMe().setVisible(false);
            }
        });
        add(ayuda);
        add(segundon);
        add(dragon);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(600,400);
        Toolkit tk;
        tk=Toolkit.getDefaultToolkit ();
        Dimension tamPant=tk.getScreenSize();
        setLocation((tamPant.width-getSize().width)/2,(tamPant.height-getSize().height)/2);
        if(openedOnce == false){
            new Splash(this);
            openedOnce = true;
        }
    }
    public Menu getMe()
    {
        return this;
    }
}
