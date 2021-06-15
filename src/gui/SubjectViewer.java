package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import subject.SubjectInput;

public class SubjectViewer extends JPanel {
	
	WindowFrame frame;	
	SubjectManager subjectManager;
	
	public SubjectViewer(WindowFrame frame, SubjectManager subjectManager) {
		this.frame = frame;
		this.subjectManager = subjectManager;
		
		System.out.println("***" + subjectManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Num");
		model.addColumn("Name");
		model.addColumn("Professor");
		model.addColumn("Class");
		
		for (int i = 0; i < subjectManager.size(); i++) {
			Vector row = new Vector();
			SubjectInput si = subjectManager.get(i);
			row.add(si.getNum());
			row.add(si.getName());
			row.add(si.getProfessor());
			row.add(si.getclass());
			model.addRow(row);
		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);

	}

}
