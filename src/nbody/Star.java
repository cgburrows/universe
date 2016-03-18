/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbody;

/**
 *
 * @author Conor
 */
public class Star {
    private double brightness; // brightness
    private final int minLight; 
    private final int maxLight;
    
    public Star() {
        this.minLight = 127;
        this.maxLight = 255;
    }
}
