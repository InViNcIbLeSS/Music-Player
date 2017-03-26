/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Dhaval
 */
public class SongSelectorPanel extends JPanel {
    private JLabel root;
    
    public SongSelectorPanel(Dimension size) {
        setBackground(Color.red);
        setPreferredSize(size);
        setOpaque(true);
        
        JButton openButton = new JButton("Open");
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JFileChooser chooser = new JFileChooser();
                int returnVal = chooser.showOpenDialog(null);
                if(returnVal == JFileChooser.APPROVE_OPTION) {
                    System.out.println("You chose to open this file: " +
                        chooser.getSelectedFile().getAbsolutePath());
                    Player player = Player.getInstance();
                    player.play(chooser.getSelectedFile().getAbsolutePath());
                }
            }
        });
        add(openButton);
        add(new JLabel("panel"));
    }
}
