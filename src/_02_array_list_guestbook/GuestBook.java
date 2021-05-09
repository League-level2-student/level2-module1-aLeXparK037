package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame = new JFrame();
	JButton one = new JButton();
	JButton two = new JButton();
	ArrayList <String> list = new ArrayList<String>();

public void run() {
	frame.setVisible(true);
	JPanel panel = new JPanel();
	frame.add(panel);
	
	panel.add(one);
	panel.add(two);
	one.addActionListener(this);
	two.addActionListener(this);
	one.setText("Add name");
	two.setText("view names");
	frame.pack();



}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == one){
		String add = JOptionPane.showInputDialog("Please type in a name below");
		list.add(add);
		}
	if (e.getSource()== two) {
	for(int i=0;i<list.size();i++) {
			String s = list.get(i);
		JOptionPane.showMessageDialog(null, "Guest #" + i + ": " + s);
		} 
	}
}
}