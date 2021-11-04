package Jlist;

import java.awt.BorderLayout;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;



public class main extends JFrame{
	static JFrame v = new JFrame();
	public static void main (String[] args) {
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setSize(400, 400);
		
		
		 
		
		List<Persona> lista = List.of(
			new Persona("victor", "martinez",LocalDate.of(1999, 12, 1)),
			new Persona("paco", "perez", LocalDate.of(1999, 10, 24))
		);
	
		DefaultListModel<String> modelo = new DefaultListModel<>();
		JList<String> jlista = new JList<String>(modelo);
		for (Persona p : lista) {
			modelo.addElement(p.getNombre()+" "+p.getApellido());		
		}
		
		JPanel pa1 = new JPanel();
		pa1.add(jlista);
		v.add(pa1,BorderLayout.CENTER);
		v.setVisible(true);
		
		 
	}
	
		
		
}
