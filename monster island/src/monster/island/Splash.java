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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Omar xv
 */
public class Splash extends JFrame{
    private Menu padre;
    private Timer tmrTiempo;
    public Splash (Menu padre)
    {
        super ();
        this.padre=padre;
        setSize(600,400);
        setLocation(100,100);
        try{
           setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("imagenes/menu/0.jpg"))))); 
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(this, "Error, imagen 0.jpg no encontrada","Error de archivos",JOptionPane.WARNING_MESSAGE);
        }
        tmrTiempo=new Timer(2000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                getPadre().setVisible(true);
                tmrTiempo.stop();
                getMe().dispose();
        }});
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tmrTiempo.start();
        setLocationRelativeTo(null);
        setUndecorated(true);
        setVisible(true);
    }
    public Splash getMe()
    {
        return this;
    }
    public Menu getPadre()
    {
        return padre;
    }
}
