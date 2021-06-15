package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class SubjectAdder extends JPanel {
	
	WindowFrame frame;
	
	public SubjectAdder(WindowFrame frame) {		
		this.frame = frame;

		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelNum = new JLabel("Num: ", JLabel.TRAILING);
		JTextField fieldNum = new JTextField(10);
		labelNum.setLabelFor(fieldNum);
		panel.add(labelNum);
		panel.add(fieldNum);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelNum.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelProfessor = new JLabel("Professor: ", JLabel.TRAILING);
		JTextField fieldProfessor = new JTextField(10);
		labelNum.setLabelFor(fieldProfessor);
		panel.add(labelProfessor);
		panel.add(fieldProfessor);
		
		JLabel labelClass = new JLabel("Class: ", JLabel.TRAILING);
		JTextField fieldClass = new JTextField(10);
		labelNum.setLabelFor(fieldClass);
		panel.add(labelClass);
		panel.add(fieldClass);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		

		this.add(panel);
		this.setVisible(true);
	}

}
