/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Dhaval
 */
public class ControlButton extends JButton {
    
    public ControlButton(ImageIcon icon) {
        super(icon);
        setOpaque(false);
        setBorderPainted(false); 
        setContentAreaFilled(false); 
        setFocusPainted(false); 
        setPreferredSize(new Dimension(50,50));
    }
    
}
