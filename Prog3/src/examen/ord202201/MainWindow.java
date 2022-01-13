package examen.ord202201;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import examen.ord202201.RocketLaunch.Status;

public class MainWindow extends JFrame implements WindowListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static Logger logger = Logger.getLogger(MainWindow.class.getName());
	private DefaultTableModel model;
	private DBManager dbManager;	
	private JTable launchesJTable ;
	private JPanel p1;
	private JButton b1;
	private List<RocketLaunch> allLaunches;
	private JLabel infoLabel;
	JTextField companyFilter;
	
	public MainWindow() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		dbManager = new DBManager();
		model = new DefaultTableModel();
		launchesJTable = new JTable(model);
		launchesJTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(launchesJTable), BorderLayout.CENTER);
		
		try { //llamada por la información ordenada
			dbManager.connect();
			allLaunches = dbManager.getAllLaunches();
		} catch (SQLException | ClassNotFoundException e) {
			logger.log(Level.SEVERE, "Error connecting to database to obtain launches data", e);
		}
		p1=new JPanel();
		b1=new JButton("ordenar");
		JButton b2 = new JButton("borrar");
		
		p1.add(b1);
		p1.add(b2);
		add(p1,BorderLayout.NORTH);
		
		infoLabel = new JLabel();
		add(infoLabel, BorderLayout.SOUTH);
		
		updateUI(allLaunches);
		
		//Funcion de librería , no del código
		launchesJTable.getColumnModel().getColumn(0).setMinWidth(60);
		launchesJTable.getColumnModel().getColumn(1).setMinWidth(110);
		launchesJTable.getColumnModel().getColumn(2).setMinWidth(320);
		launchesJTable.getColumnModel().getColumn(3).setMinWidth(20);
		launchesJTable.getColumnModel().getColumn(4).setMinWidth(20);
		
		//TODOCambio de color de la columna
		launchesJTable.setDefaultRenderer( Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel ret = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                ret.setForeground( Color.BLACK );
                if(launchesJTable.getValueAt(row, 4) == Status.SUCCESS) {
                    ret.setBackground(Color.green);
                } else if (launchesJTable.getValueAt(row, 4) == Status.FAILURE) {
                    ret.setBackground(Color.red);
                }
                return ret;
            }
        });
		
		setSize(800, 600);
		setVisible(true);
		
		//Odernar por company
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					allLaunches = dbManager.getAllOrdenado();
					updateUI(allLaunches);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			int fila = launchesJTable.getSelectedRow();
			//System.out.println(fila);
			allLaunches.remove(fila);
			updateUI(allLaunches);
			}
		});
	}
	
	// updates the UI with new data for the model
	private void updateUI(List<RocketLaunch> launches) {
		launchesJTable.setModel(new LaunchesTableModel(launches));
		infoLabel.setText(String.format("%d launches", launches.size()));
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new MainWindow();				
			}
		});

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		try {
			dbManager.disconnect();
		} catch (SQLException e1) {
			logger.log(Level.SEVERE, "Error disconnecting from database", e);
		}		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
