package listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import game.*;

public class  EcouteurConnect implements ActionListener{
	FrameConnect fc;
	int port = 0;
	String ip = "";
	public EcouteurConnect(FrameConnect fc){
		this.fc = fc;
	}
	public void actionPerformed(ActionEvent e){
		ip = fc.getTextField()[0].getText();
		port = Integer.parseInt(fc.getTextField()[1].getText());
		 if (port > 1 || port < 65535 ) {
		 	fc.setVisible(false);
		 	TicTacToe ticTacToe = new TicTacToe(ip,port);
		 }
	}
}