import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JTable;

public class TopPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	MainFrame mf;
	public TopPanel(MainFrame m, String s) {
		mf = m;
		//System.out.println(mf.MemberInfo[0][0]);
	}

	void pc()
	{
		mf.ChangePanel(mf.PanelNames[1], mf.PanelNames[0]);
	}
}
