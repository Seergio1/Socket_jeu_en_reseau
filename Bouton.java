//changer la couleur d'un bouton
package Bouton;
import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.JButton;
import java.awt.GradientPaint;
import java.awt.Color;




public class Bouton extends JButton {
	public Bouton(){
		super();
		setContentAreaFilled(false);
		setFocusPainted(false);
	}
	public void paintComponent(Graphics g){
		final Graphics2D g2 = (Graphics2D) g.create();
		g2.setPaint(new GradientPaint(0,0,Color.decode("#45f3ff"),0,0,Color.decode("#45f3ff")));
		g2.fillRect(0,0,getWidth(),getHeight());
		g2.dispose();
		super.paintComponent(g);
		
	}
}