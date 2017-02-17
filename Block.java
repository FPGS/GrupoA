package ejercicio_arkanoid;

import java.awt.*;
import java.applet.*;

public class Block extends Rectangle{
	Color color;
	public Block(int posX, int posY, int anchura, int altura, Color color){
		x = posX;
		y = posY;
		width = anchura;
		height = altura;
		this.color = color;
	}
	
	public void dibujar(Graphics g){
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}
}