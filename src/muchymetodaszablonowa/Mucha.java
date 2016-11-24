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
public abstract class Mucha {

    protected final double k = 0.01;
    protected double x, y;        // pozycja muchy
    protected double vx, vy;      // predkosc muchy

    protected abstract void draw(Graphics g);
    protected abstract void move();
    
    //public void TemplateMethod(Graphics g){
    //    draw(g);
    //    move();
    //}

    public Mucha() {
        x = Math.random();
        y = Math.random();
        vx = k * (Math.random() - Math.random());
        vy = k * (Math.random() - Math.random());
    }
}
