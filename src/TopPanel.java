import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.awt.Font;


public class TopPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	MainFrame mf;
	public int Row;
	private JTable table;
	
	int num = 0;
	String rent = "";
	
	private String[] columnNames = {"通し番号", "ID", "種別", "名前", "住所", "会社名", "役職", "メールアドレス", "電話番号", "誕生日", "来店回数", "ボトルキープ", "グラスキープ", "会費情報", "備考", "在室状況"};
	
	DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
	ArrayList<String[]> aryList= new ArrayList<String[]>();
	
	public TopPanel(MainFrame m, String s) {
		mf = m;

		setBackground(SystemColor.window);
		setLayout(null);
		 
		//ファイルを読み込むボタンとその処理
		JButton btnNewButton = new JButton("読み込み");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnNewButton.setBounds(10, 5, 100, 30);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num == 0)
				{
					try {
						 File file = new File("富士見サロン会員情報.csv");
					        BufferedReader br;
							try {
								br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
								mf.MemberInfo = br.lines().map(line->line.split(",", -1)).toArray(String[][]::new);
								
					            br.close();

							} catch (UnsupportedEncodingException e1) {
								// TODO 自動生成された catch ブロック
								e1.printStackTrace();
							} catch (FileNotFoundException e1) {
								// TODO 自動生成された catch ブロック
								e1.printStackTrace();
							}
					
			            
						ReadData();
			        }
			        catch(IOException ex) {
			            ex.printStackTrace();        	
			        }
					
					num++;
				}
				else
				{
						Re();
				}
			}
			
		});

		add(btnNewButton);
		 
		 JScrollPane scrollPane = new JScrollPane();
		 scrollPane.setViewportBorder(null);
		 scrollPane.setBounds(0, 40, 750, 500);
		 this.add(scrollPane);
		 
		  table = new JTable(tableModel);
		  table.addMouseListener(new MouseAdapter() {
		  	@Override
		  	public void mouseClicked(MouseEvent e) {
		  		Row = table.getSelectedRow();
		  		String Id = tableModel.getValueAt(Row, 0).toString();
		  		cp(Id);
		  	}
		  });
		  table.setBackground(SystemColor.window);
		  table.setLocation(0, 40);
		  table.setSize(790, 540);
		  scrollPane.setViewportView(table);
	
	}

	//データを読み込み直す
	void Re()
	{
		aryList.clear();
	    tableModel.setRowCount(0);

		ReadData();
	}
	
	//データを読み込んでtableに流し込む
	void ReadData()
	{
	    for(int i = 0 ; i < mf.MemberInfo.length ; i++){
	      aryList.add(mf.MemberInfo[i]);
	    }
		
		for(int i = 0 ; i <  aryList.size() ; i++){
	        tableModel.addRow(aryList.get(i));
	      }
	}
	
	//パネルを変更する関数を呼び出す
	void cp(String Id)
	{
		mf.Global = Integer.parseInt(Id) -1;
		mf.Output();
		
		//                   old               next
		mf.ChangePanel(mf.PanelNames[0], mf.PanelNames[1]);
	}
}
