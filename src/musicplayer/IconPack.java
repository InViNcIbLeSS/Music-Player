/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Dhaval
 */
public class IconPack {
    
    private static IconPack iconPack = null;
    
    public static ImageIcon playIcon;
    public static ImageIcon pauseIcon;
    public static ImageIcon nextIcon;
    public static ImageIcon prevIcon;
    public static ImageIcon stopIcon;
    
    private IconPack() {
        playIcon = new ImageIcon("icons\\wood\\pause.png");
    }
    
    public static IconPack getInstance() {
        if(iconPack == null) {
            iconPack = new IconPack();
        }
        return iconPack;
    }
    
    
    
    public static void loadIcons(String path) {
        playIcon = new ImageIcon("icons\\"+path+"\\play.png");
        pauseIcon = new ImageIcon("icons\\"+path+"\\pause.png");
        stopIcon = new ImageIcon("icons\\"+path+"\\stop.png");
        nextIcon = new ImageIcon("icons\\"+path+"\\next.png");
        prevIcon = new ImageIcon("icons\\"+path+"\\prev.png");
    }
    
}
