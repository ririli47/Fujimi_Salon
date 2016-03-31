import javax.swing.JPanel;

public class RegisterPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	MainFrame mf;
	public RegisterPanel(MainFrame m, String s) {
		mf = m;
		this.setName("RegisterPanel");
	}

	void pc()
	{
		mf.ChangePanel(mf.PanelNames[1], mf.PanelNames[0]);
	}
}
