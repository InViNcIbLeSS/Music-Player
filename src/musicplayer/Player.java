/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

/**
 *
 * @author Dhaval
 */
public class Player {
    private static Player player = null;
    private BasicPlayerTest basicPlayer;
    
    private Player() {
        basicPlayer = new BasicPlayerTest();
    }
    
    public static Player getInstance() {
        if(player == null) {
            player = new Player();
        }
        return player;
    }
    
    public void play(String path){
        basicPlayer.play(path);
    }
}
