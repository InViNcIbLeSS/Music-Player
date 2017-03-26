/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dhaval
 */
public class MusicPlayer {

    /**
     * @param args the command line arguments
     */
    JPanel songInfoPanel;
    JPanel songControlPanel;
    JPanel songSelectorPanel;
    
    public MusicPlayer() {
        createGUI();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new MusicPlayer();
    }
    
    private void createGUI() {
        JFrame frame = new JFrame(); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(-10, -10));
        songControlPanel = new SongControlPanel();
        songInfoPanel = new SongInfoPanel();
        songSelectorPanel = new SongSelectorPanel(new Dimension(200, 400));
        
        frame.add(songControlPanel, BorderLayout.SOUTH);
        frame.add(songInfoPanel, BorderLayout.CENTER);
        frame.add(songSelectorPanel, BorderLayout.WEST);
        
        frame.setVisible(true);
    }
    
}
