import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;

public class PersonalPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	MainFrame mf;
	private JTextField textField;
	public PersonalPanel(MainFrame m, String s) {
		mf = m;
		this.setName("PersonalPanel");
		setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(6, 50, 109, 16);
		add(lblId);
		
		JLabel label = new JLabel("名前");
		label.setBounds(6, 78, 109, 16);
		add(label);
		
		JLabel label_1 = new JLabel("住所");
		label_1.setBounds(6, 106, 109, 16);
		add(label_1);
		
		JLabel label_2 = new JLabel("会社名");
		label_2.setBounds(6, 134, 109, 16);
		add(label_2);
		
		JLabel label_3 = new JLabel("メールアドレス");
		label_3.setBounds(6, 162, 109, 16);
		add(label_3);
		
		JLabel label_4 = new JLabel("誕生日");
		label_4.setBounds(6, 190, 109, 16);
		add(label_4);
		
		JLabel label_5 = new JLabel("来店回数");
		label_5.setBounds(6, 218, 109, 16);
		add(label_5);
		
		JLabel label_6 = new JLabel("ボトルキープ");
		label_6.setBounds(6, 246, 109, 16);
		add(label_6);
		
		JLabel label_7 = new JLabel("グラスキープ");
		label_7.setBounds(6, 274, 109, 16);
		add(label_7);
		
		JLabel label_8 = new JLabel("会費納入方法");
		label_8.setBounds(6, 302, 109, 16);
		add(label_8);
		
		JLabel label_9 = new JLabel("備考");
		label_9.setBounds(6, 330, 109, 16);
		add(label_9);
		
		textField = new JTextField();
		textField.setBounds(115, 45, 300, 26);
		add(textField);
		textField.setColumns(10);
	}

	void pc()
	{
		mf.ChangePanel(mf.PanelNames[1], mf.PanelNames[0]);
	}
}
