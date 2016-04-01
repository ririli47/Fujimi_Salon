import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

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
		setBackground(SystemColor.window);
		mf = m;
		this.setName("PersonalPanel");
		setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBackground(SystemColor.window);
		lblId.setBounds(32, 24, 109, 16);
		add(lblId);
		
		JLabel label = new JLabel("名前");
		label.setBounds(32, 52, 109, 16);
		add(label);
		
		JLabel label_1 = new JLabel("住所");
		label_1.setBounds(32, 80, 109, 16);
		add(label_1);
		
		JLabel label_2 = new JLabel("会社名");
		label_2.setBounds(32, 108, 109, 16);
		add(label_2);
		
		JLabel label_3 = new JLabel("役職");
		label_3.setBounds(32, 136, 109, 16);
		add(label_3);
		
		JLabel label_4 = new JLabel("メールアドレス");
		label_4.setBounds(32, 164, 109, 16);
		add(label_4);
		
		JLabel label_5 = new JLabel("電話番号");
		label_5.setBounds(32, 192, 109, 16);
		add(label_5);
		
		JLabel label_6 = new JLabel("誕生日");
		label_6.setBounds(32, 220, 109, 16);
		add(label_6);
		
		JLabel label_7 = new JLabel("来店回数");
		label_7.setBounds(32, 248, 109, 16);
		add(label_7);
		
		JLabel label_8 = new JLabel("ボトルキープ");
		label_8.setBounds(32, 276, 109, 16);
		add(label_8);
		
		JLabel label_9 = new JLabel("グラスキープ");
		label_9.setBounds(32, 304, 109, 16);
		add(label_9);
		
		JLabel label_10 = new JLabel("会費情報");
		label_10.setBounds(32, 332, 109, 16);
		add(label_10);
		
		JLabel label_11 = new JLabel("備考");
		label_11.setBounds(32, 360, 109, 16);
		add(label_11);
		
		textField = new JTextField();
		textField.setBounds(141, 19, 300, 26);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mf.MemberInfo[mf.Global][1] = textField_1.getText();
			}
		});
		textField_1.setColumns(10);
		textField_1.setBounds(141, 47, 300, 26);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(141, 75, 300, 26);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(141, 103, 300, 26);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(141, 131, 300, 26);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(141, 159, 300, 26);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(141, 187, 300, 26);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(141, 215, 300, 26);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(141, 243, 300, 26);
		add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(141, 271, 300, 26);
		add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(141, 299, 300, 26);
		add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(141, 327, 300, 26);
		add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(141, 355, 300, 26);
		add(textField_12);
		
		JButton button = new JButton("前へ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mf.Global != 0)
					mf.Global--;
				SetInfo();
			}
		});
		button.setBounds(453, 19, 117, 29);
		add(button);
		
		JButton button_1 = new JButton("次へ");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mf.Global < mf.MemberInfo.length-1)
					mf.Global++;
				SetInfo();
			}
		});
		button_1.setBounds(589, 19, 117, 29);
		add(button_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("個人");
		comboBox.addItem("法人");
		comboBox.setBounds(456, 328, 80, 27);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem("月会費");
		comboBox_1.addItem("年会費");
		comboBox_1.setBounds(533, 328, 95, 27);
		add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addItem("現金");
		comboBox_2.addItem("カード");
		comboBox_2.setBounds(626, 328, 80, 27);
		add(comboBox_2);
		
		
		JButton button_2 = new JButton("編集内容を保存");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(int i = 0;  i < 100;  i++)
				{
					if(mf.MemberInfo[i][1] == null)
					{
						break;
					}
					if(mf.MemberInfo[i][1].equals(textField.getText()))
					{
						if(mf.Global != i)
						{
							textField.setText("The ID is already used");
							return;
						}
					}
				}
				
				//現在のtextFieldの値を反映
				mf.MemberInfo[mf.Global][1] = textField.getText();
				mf.MemberInfo[mf.Global][2] = textField_1.getText();
				mf.MemberInfo[mf.Global][3] = textField_2.getText();
				mf.MemberInfo[mf.Global][4] = textField_3.getText();
				mf.MemberInfo[mf.Global][5] = textField_4.getText();
				mf.MemberInfo[mf.Global][6] = textField_5.getText();
				mf.MemberInfo[mf.Global][7] = textField_6.getText();
				mf.MemberInfo[mf.Global][8] = textField_7.getText();
				mf.MemberInfo[mf.Global][9] = textField_8.getText();
				mf.MemberInfo[mf.Global][10] = textField_9.getText();
				mf.MemberInfo[mf.Global][11] = textField_10.getText();
				
				if(comboBox.getSelectedIndex() == 0)
					mf.MemberInfo[mf.Global][12] = "個人";
				else if(comboBox.getSelectedIndex() == 1)
					mf.MemberInfo[mf.Global][12] = "法人";
				
				if(comboBox_1.getSelectedIndex() == 0)
					mf.MemberInfo[mf.Global][12] = mf.MemberInfo[mf.Global][12] + "　月会費";
				else if(comboBox_1.getSelectedIndex() == 1)
					mf.MemberInfo[mf.Global][12] = mf.MemberInfo[mf.Global][12] + "　年会費";
				
				if(comboBox_2.getSelectedIndex() == 0)
					mf.MemberInfo[mf.Global][12] = mf.MemberInfo[mf.Global][12] + "　現金";
				else if(comboBox_2.getSelectedIndex() == 1)
					mf.MemberInfo[mf.Global][12] = mf.MemberInfo[mf.Global][12] + "　カード";
				
				//mf.MemberInfo[mf.Global][12] = textField_11.getText();
				mf.MemberInfo[mf.Global][13] = textField_12.getText();
					
				
	            String line[] = new String[100];
				int i = 0;
				try {
					//書き込む文字列
					String Write = "";
					
					
					for(i = 0;  i < 13;  i++)
						Write = Write + mf.MemberInfo[mf.Global][i] + ",";
					Write = Write + mf.MemberInfo[mf.Global][i];
					
		            //ファイルを読み込む
		            FileReader fr = new FileReader("/Users/Naoya/mine/helper-caravan/富士見サロン会員情報.csv");
		            BufferedReader br = new BufferedReader(fr);

		            //読み込んだファイルを１行ずつ処理する
		            i = 0;
		            String kari;
		            while ((kari = br.readLine()) != null) {
		            	line[i] = kari;
		            	if(i == mf.Global)
		            		line[i] = Write;
		                i++;
		            }
		            br.close();
		        }
		        catch(IOException ex) {
		            //例外発生時処理
		            ex.printStackTrace();        	
		        }
				//ファイル書き込み
				try{
				      File file = new File("/Users/Naoya/mine/helper-caravan/富士見サロン会員情報.csv");

				      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));

				      for(i = 0;  i < 100;  i++)
				      	pw.println(line[i]);

				        pw.close();
				    }catch(IOException ee){
				      System.out.println(ee);
				    }
				  }
		});
		button_2.setBounds(453, 75, 117, 29);
		add(button_2);
		
		JButton button_3 = new JButton("一覧に戻る");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mf.Reload();
				cp();
			}
		});
		button_3.setBounds(453, 131, 117, 29);
		add(button_3);
		
		
		
	}

	
	void SetInfo()
	{

		//System.out.println(mf.MemberInfo[mf.Global][9]);
		textField.setText(mf.MemberInfo[mf.Global][1]);
		textField_1.setText(mf.MemberInfo[mf.Global][2]);
		textField_2.setText(mf.MemberInfo[mf.Global][3]);
		textField_3.setText(mf.MemberInfo[mf.Global][4]);
		textField_4.setText(mf.MemberInfo[mf.Global][5]);
		textField_5.setText(mf.MemberInfo[mf.Global][6]);
		textField_6.setText(mf.MemberInfo[mf.Global][7]);
		textField_7.setText(mf.MemberInfo[mf.Global][8]);
		textField_8.setText(mf.MemberInfo[mf.Global][9]);
		textField_9.setText(mf.MemberInfo[mf.Global][10]);
		textField_10.setText(mf.MemberInfo[mf.Global][11]);
		textField_11.setText(mf.MemberInfo[mf.Global][12]);
		textField_12.setText(mf.MemberInfo[mf.Global][13]);

	}
	
	void cp()
	{
		mf.ChangePanel(mf.PanelNames[1], mf.PanelNames[0]);
	}
}
