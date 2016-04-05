import javax.swing.JPanel;

public class ResultPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	MainFrame mf;
	public ResultPanel(MainFrame m, String s) {
		mf = m;
		this.setName("ResultPanel");
	}

	void pc()
	{
		mf.ChangePanel(mf.PanelNames[1], mf.PanelNames[0]);
	}
}
