package examen.ord202201;

import java.util.Arrays;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class LaunchesTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final List<String> headers = Arrays.asList( "Company", "Date", "Location", "Cost", "Status");
	private List<RocketLaunch> launches;

	public LaunchesTableModel(List<RocketLaunch> launches) {
		this.launches = launches;
	}
	
	@Override
	public String getColumnName(int column) {
		return headers.get(column);
	}

	@Override
	public int getRowCount() {
		return launches.size();
	}

	@Override
	public int getColumnCount() {
		return headers.size(); 
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		RocketLaunch launch = launches.get(rowIndex);
		switch (columnIndex) {
			case 0: return launch.getCompany();
			case 1: return launch.getLaunchDate().toString();
			case 2: return launch.getLocation();
			case 3: return Float.valueOf(launch.getCost());
			case 4: return launch.getStatus();
			default: return null;
		}
	}

}
