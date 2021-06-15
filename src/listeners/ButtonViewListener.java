package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.SubjectViewer;
import gui.WindowFrame;

import java.awt.event.ActionListener;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}


	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		SubjectViewer viewer = frame.getSubjectviewer();
		frame.setupPanel(viewer);
	}

}
