/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muchymetodaszablonowa;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author A5US
 */
public class MuchaCircle extends Mucha{

    @Override
    protected void move() {
        double kat = 0.15;      //new Random().nextDouble() * 0.3 + 0.05;//new Random().nextDouble() * 0.2;
        double vx2 = (vx * (Math.cos(kat))) - (vy * (Math.sin(kat)));
        double vy2 = (vx * (Math.sin(kat))) + (vy * (Math.cos(kat)));
        vx = vx2;
        vy = vy2;
        x += vx;
        y += vy;
        if(x<0) { x = -x; vx = -vx; }
	if(x>1) { x = 2-x;vx = -vx; }
	if(y<0) { y = -y; vy = -vy; }
	if(y>1) { y = 2-y;vy = -vy; }
    }
    
    @Override
    protected Color getColor() {
        return Color.orange;
    }
}
