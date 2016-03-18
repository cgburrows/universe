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

// cos equation for brightness between 65 and 255
// y = 95cos(.1x) + 160
public class Star {
    private double brightness; // brightness
    private final int minLight; 
    private final int maxLight;
    
    public Star() {
        this.minLight = 65;
        this.maxLight = 255;
    } // Star()
    
    public void shine() {
        
    }
}
