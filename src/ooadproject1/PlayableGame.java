/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadproject1;

import java.awt.*;
import java.awt.image.*;

/**
 *
 * @author Lenovo G50
 */
public class PlayableGame {
    private String f;
    private String t;
    private BufferedImage boxArt;
    private int l;
    public PlayableGame(){
       f = "N/A";
       t = "Unknown";
       l = 0;
    }
    public PlayableGame(String f, String t, int l){
        this.f = f;
        this.t = t;
        this.l = l;
    }
}
