/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monster.island;

import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class CampoBatalla extends JFrame{
    private int noEnemigos;
    private Enemigo ene1, ene2, ene3;
    public CampoBatalla(){
        ene1 = new Enemigo();
        ene2 = new Enemigo();
        ene3 = new Enemigo();
        setSize(720, 720);
    }
}
