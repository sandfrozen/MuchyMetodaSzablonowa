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
/* Mucha podstawowa */
public class MuchaA extends Mucha{

    @Override
    protected void move() {
        x += vx;
        y += vy;
        if(x<0) { x = -x; vx = -vx; }
	if(x>1) { x = 2-x;vx = -vx; }
	if(y<0) { y = -y; vy = -vy; }
	if(y>1) { y = 2-y;vy = -vy; }
    }

    @Override
    protected void draw(Graphics g) {
        g.setColor(Color.black);
        Rectangle rc = g.getClipBounds();
        int a = (int) (x * rc.getWidth()),
                b = (int) (y * rc.getHeight());
        g.fillOval(a, b, 5, 5);
    }
    
}
