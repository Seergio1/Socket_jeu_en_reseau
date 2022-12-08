package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GradientPaint;
import Bouton.*;
import listener.*;


public class FrameConnect extends JFrame{
	final int WIDTH = 300;
	final int HEIGHT = 300;
	
	Bouton btnConnect;
	JPanel pane;
	JTextField[] ipPort = new JTextField[2];
	EcouteurConnect ecouteurC;

	public JTextField[] getTextField(){
		return ipPort;
	}
	
	public FrameConnect(){
		
		pane = new JPanel();
		pane.setBackground(Color.decode("#24262b"));
		pane.setLayout(null);

		btnConnect = new Bouton();
		
		btnConnect.setText("Valider");
		ipPort[0] = new JTextField("  Entrer un Ip");
		ipPort[1] = new JTextField("  Entrer un Port");

		ecouteurC = new EcouteurConnect(this);

		for (int i = 0;i<ipPort.length ;i++ ) {
			pane.add(ipPort[i]);
			ipPort[i].setCaretPosition(ipPort[i].getText().length());
			ipPort[i].setCaretColor(Color.white);
			ipPort[i].setForeground(Color.white);
			ipPort[i].setFont(new Font("Verdana", Font.BOLD, 20));
			ipPort[i].setOpaque(false);
		}
		
		btnConnect.setBounds(45,175,200,50);
		btnConnect.addActionListener(ecouteurC);
		ipPort[0].setBounds(45,20,200,50);
		ipPort[1].setBounds(45,80,200,50);
		pane.add(btnConnect);
		
		this.setTitle("Tic-Tac-Toe");
		this.setContentPane(pane);
		this.setSize(WIDTH, HEIGHT);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
}