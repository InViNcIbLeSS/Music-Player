/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Dhaval
 */
public class SongInfoPanel extends JPanel {
    private JLabel root;
    public SongInfoPanel() {
        setBackground(Color.black);
        setSize(600, 400);
        setOpaque(true);
        add(new JLabel("panel"));
    }
}
