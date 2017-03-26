/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicSliderUI;

/**
 *
 * @author Dhaval
 */
public class SongControlPanel extends JPanel {
    private JLabel root;
    private int i = 0;
    
    public JButton playButton;
    public JButton pauseButton;
    public JButton nextButton;
    public JButton prevButton;
    public JButton stopButton;
    
    public SongControlPanel() {
        
        setBackground(Color.orange);
        setPreferredSize(new Dimension(800, 75));
        setOpaque(true);
        IconPack icons = IconPack.getInstance();
        IconPack.loadIcons("wood2");
        playButton = new ControlButton(IconPack.playIcon);
        nextButton = new ControlButton(IconPack.nextIcon);
        prevButton = new ControlButton(IconPack.prevIcon);
        pauseButton = new ControlButton(IconPack.pauseIcon);
        
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(i % 2 == 0) {
                    playButton.setIcon(IconPack.playIcon);
                }
                else {
                    playButton.setIcon(IconPack.pauseIcon);
                }
                i++;
                
            }
        });
        add(prevButton);
        add(playButton);
        add(nextButton);
        add(new JLabel("panel"));
    }
    
    private static class MySliderUI extends BasicSliderUI {

    private static float[] fracs = {0.0f, 0.2f, 0.4f, 0.6f, 0.8f, 1.0f};

    public MySliderUI(JSlider slider) {
        super(slider);
    }

    @Override
    public void paintTrack(Graphics g) {
        
    }

    @Override
    public void paintThumb(Graphics g) {
        
    }
    }
    
}
