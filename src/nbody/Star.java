/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbody;

import edu.princeton.cs.StdDraw;
import java.awt.Color;
import java.lang.Math;
import java.util.Random;

/**
 *
 * @author Conor
 */
// cos equation for brightness between 65 and 255
// y = 95cos(.1x) + 160
public class Star {

    private double brightness; // brightness
    Color c;

    private final int xPos;
    private final int yPos;

    private final int minLight;
    private final int maxLight;

    Random r;
    double d;
    
    public Star(int x, int y) {
        brightness = 0;
        c = new Color(65, 65, 65);

        this.minLight = 65;
        this.maxLight = 255;

        this.xPos = x;
        this.yPos = y;

        r = new Random();
        d = (double) (r.nextInt(maxLight) + minLight);
    } // Star()

    public void shine() {
        brightness = 95 * Math.cos(d);
        c = new Color((int) brightness, (int) brightness, (int) brightness);
    }

    public void draw() {
        StdDraw.setPenColor(c);
        StdDraw.point(xPos, yPos);
    }
}
