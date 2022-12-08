package game;
import javax.swing.JPanel;
import java.awt.*;
import game.*;

public class Terrain  extends JPanel{
	TicTacToe game;

	public Terrain(TicTacToe game) {
			this.game = game;
			this.setFocusable(true);
			this.requestFocus();
			this.setBackground(Color.decode("#24262b"));
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			game.render(g);
		}
}