package backEnd;

import java.awt.event.MouseEvent;

import javax.swing.JLabel;

public class ButtonsClicked {

	public void ifButtonTwoClicked(MouseEvent mouseEvent, JLabel display) {
		String displayValue = display.getText();
		display.setText(displayValue + 2);
	}
	
}
