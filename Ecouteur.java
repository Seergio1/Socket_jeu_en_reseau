package listener;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.awt.Toolkit;
import game.*;



public class Ecouteur implements MouseListener {
	TicTacToe game;
	Terrain terrain;

	public Ecouteur(TicTacToe game,Terrain terrain){
		this.game = game;
		this.terrain = terrain;
	}
		 @Override
		 public void mouseClicked(MouseEvent e) {
			if (game.accepted()) {
				if (game.yourTurn() && !game.unableToCommunicateWithOpponent() && !game.won() && !game.enemyWon()) {
					int x = e.getX() / game.lengthOfSpace();
					int y = e.getY() / game.lengthOfSpace();
					y *= 3;
					int position = x + y;

					if (game.spaces()[position] == null) {
						if (!game.circle()) game.setSpaces(position,"X");
						else game.setSpaces(position,"O");
						game.setYourTurn(false);
						terrain.repaint();
						Toolkit.getDefaultToolkit().sync();

						try {
							game.dos().writeInt(position);
							game.dos().flush();
						} catch (IOException e1) {
							game.setError(game.errors()+1);
							e1.printStackTrace();
						}

						System.out.println("DATA WAS SENT");
						game.checkForWin();
						game.checkForTie();

					}
				}
			}
		 }

		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {

		}

	}