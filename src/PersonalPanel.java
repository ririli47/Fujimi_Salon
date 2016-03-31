import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class PersonalPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	MainFrame mf;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	
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
		
		JLabel label_3 = new JLabel("役職");
		label_3.setBounds(6, 162, 109, 16);
		add(label_3);
		
		JLabel label_4 = new JLabel("メールアドレス");
		label_4.setBounds(6, 190, 109, 16);
		add(label_4);
		
		JLabel label_5 = new JLabel("電話番号");
		label_5.setBounds(6, 218, 109, 16);
		add(label_5);
		
		JLabel label_6 = new JLabel("誕生日");
		label_6.setBounds(6, 246, 109, 16);
		add(label_6);
		
		JLabel label_7 = new JLabel("来店回数");
		label_7.setBounds(6, 274, 109, 16);
		add(label_7);
		
		JLabel label_8 = new JLabel("ボトルキープ");
		label_8.setBounds(6, 302, 109, 16);
		add(label_8);
		
		JLabel label_9 = new JLabel("グラスキープ");
		label_9.setBounds(6, 330, 109, 16);
		add(label_9);
		
		textField = new JTextField();
		textField.setBounds(115, 45, 300, 26);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(115, 73, 300, 26);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(115, 101, 300, 26);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(115, 129, 300, 26);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(115, 157, 300, 26);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(115, 185, 300, 26);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(115, 213, 300, 26);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(115, 241, 300, 26);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(115, 269, 300, 26);
		add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(115, 297, 300, 26);
		add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(115, 325, 300, 26);
		add(textField_10);
		
		JLabel label_10 = new JLabel("会費納入方法");
		label_10.setBounds(6, 358, 109, 16);
		add(label_10);
		
		JLabel label_11 = new JLabel("備考");
		label_11.setBounds(6, 386, 109, 16);
		add(label_11);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(115, 353, 300, 26);
		add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(115, 381, 300, 26);
		add(textField_12);
		
	}

	void SetInfo()
	{
		
		textField.setText(mf.MemberInfo[mf.Global][0]);
		textField_1.setText(mf.MemberInfo[mf.Global][1]);
		textField_2.setText(mf.MemberInfo[mf.Global][2]);
		textField_3.setText(mf.MemberInfo[mf.Global][3]);
		textField_4.setText(mf.MemberInfo[mf.Global][4]);
		textField_5.setText(mf.MemberInfo[mf.Global][5]);
		textField_6.setText(mf.MemberInfo[mf.Global][6]);
		textField_7.setText(mf.MemberInfo[mf.Global][7]);
		textField_8.setText(mf.MemberInfo[mf.Global][8]);
		textField_9.setText(mf.MemberInfo[mf.Global][9]);
		textField_10.setText(mf.MemberInfo[mf.Global][10]);

	}
	
	void cp()
	{
		mf.ChangePanel(mf.PanelNames[1], mf.PanelNames[0]);
	}
}
