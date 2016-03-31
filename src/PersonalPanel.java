import javax.swing.JPanel;

public class PersonalPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	MainFrame mf;
	public PersonalPanel(MainFrame m, String s) {
		mf = m;
		this.setName("PersonalPanel");
	}

	void pc()
	{
		mf.ChangePanel(mf.PanelNames[1], mf.PanelNames[0]);
	}
}
