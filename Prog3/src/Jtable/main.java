package Jtable;

import java.awt.BorderLayout;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class main extends JFrame  {
	
	public static JFrame v = new JFrame();
	
	
	public static void main (String[] args) {
		v.setVisible(true);
		v.setSize(500,500);
		
		 
		DefaultTableModel DisennoTabla = new DefaultTableModel(); // creación de la distribución de la tablatabla (como un jpanel dentro de un jframe)
		DisennoTabla.addColumn("Columna1");//add colum para agregar columnas
		DisennoTabla.addColumn("columna2");
		String[] fila1 = {"primer campo","segundo campo"};
		DisennoTabla.addRow(fila1);//las filas se llenan con objetos (con un for se puede reciclar el mismo y usarlo varias veces
		
		JTable TablaCompleta = new JTable(DisennoTabla);
		JScrollPane p = new JScrollPane(TablaCompleta);
		v.add(p,BorderLayout.CENTER); // si no se redimenciona la ventana no funciona bien 
	
		
		//jTable.fireTableDataChanged() para cambiar datos
	}

}
