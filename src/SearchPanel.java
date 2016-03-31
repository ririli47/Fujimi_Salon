import javax.swing.JPanel;

public class SearchPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	MainFrame mf;
	public SearchPanel(MainFrame m, String s) {
		mf = m;
		this.setName("SearchPanel");
	}

	void pc()
	{
		mf.ChangePanel(mf.PanelNames[1], mf.PanelNames[0]);
	}
}
