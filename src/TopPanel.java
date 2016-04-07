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
import java.io.FileReader;
import java.io.IOException;
import java.awt.Font;
import javax.swing.JTextField;


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
	
	private String[] columnNames = {"通し番号", "ID", "名前", "住所", "会社名", "役職", "メールアドレス", "電話番号", "誕生日", "来店回数", "ボトルキープ", "グラスキープ", "会費情報", "備考"};
	
	DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
	ArrayList<String[]> aryList= new ArrayList<String[]>();
	private JTextField txtusersnaoyaminehelpercaravancsv;
	
	public TopPanel(MainFrame m, String s) {
		mf = m;

		setBackground(SystemColor.window);
		setLayout(null);
		 
		
		JButton btnNewButton = new JButton("読み込み");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnNewButton.setBounds(10, 10, 100, 30);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String place = txtusersnaoyaminehelpercaravancsv.getText();
				if(num == 0)
				{
					
					
					try {
			            //ファイルを読み込む
			            //FileReader fr = new FileReader("/Users/Naoya/mine/helper-caravan/富士見サロン会員情報.csv");
			            FileReader fr = new FileReader(place);
			            BufferedReader br = new BufferedReader(fr);

			            //読み込んだファイルを１行ずつ処理する
			            String line;
			            String[] lines;
			            int i = 0;
			            int j = 0;
			            
			            while((line = br.readLine()) != null){
			            	lines = line.split(",", -1);
			            	
			            	for(j = 0;  j < mf.InfoNum;  j++)
			            	{
			            		mf.MemberInfo[i][j] = lines[j];
			            	}
			            	i++;
			            }
			            
			            
			            br.close();
			            
						ReadData();
						rent = place;
			        }
			        catch(IOException ex) {
			            //例外発生時処理
			            ex.printStackTrace();        	
			        }
					
					num++;
				}
				else
				{
					if(rent.equals(txtusersnaoyaminehelpercaravancsv.getText()))
					{
						Re();
					}
					else
					{
						place = txtusersnaoyaminehelpercaravancsv.getText();
						
						try {
				            //ファイルを読み込む
				            //FileReader fr = new FileReader("/Users/Naoya/mine/helper-caravan/富士見サロン会員情報.csv");
				            FileReader fr = new FileReader(place);
				            BufferedReader br = new BufferedReader(fr);

				            //読み込んだファイルを１行ずつ処理する
				            String line;
				            String[] lines;
				            int i = 0;
				            int j = 0;
				            
				           
				            while((line = br.readLine()) != null){
				            	lines = line.split(",", -1);
				            	
				            	for(j = 0;  j < mf.InfoNum;  j++)
				            	{
				            		mf.MemberInfo[i][j] = lines[j];
				            	}
				            	i++;
				            }
				            
				            br.close();
				            //ReadData();
							Re();
							
							rent = place;
				        }
				        catch(IOException ex) {
				            //例外発生時処理
				            ex.printStackTrace();        	
				        }
						
						num++;
					}
				}
			}
		});
		add(btnNewButton);
		 
		 JScrollPane scrollPane = new JScrollPane();
		 scrollPane.setViewportBorder(null);
		 scrollPane.setBounds(0, 40, 712, 400);
		 this.add(scrollPane);
		 
		  table = new JTable(tableModel);
		  table.addMouseListener(new MouseAdapter() {
		  	@Override
		  	public void mouseClicked(MouseEvent e) {
		  		Row = table.getSelectedRow();
		  		String Id = tableModel.getValueAt(Row, 0).toString();
				//System.out.println(Id);
		  		cp(Id);
		  	}
		  });
		  table.setBackground(SystemColor.window);
		  table.setLocation(0, 40);
		  table.setSize(712, 400);
		  //table.setBounds(20, 51, 975, 0);
		  scrollPane.setViewportView(table);
		  
		  txtusersnaoyaminehelpercaravancsv = new JTextField();
		  txtusersnaoyaminehelpercaravancsv.setText("/Users/Naoya/mine/helper-caravan/富士見サロン会員情報.csv");
		  txtusersnaoyaminehelpercaravancsv.setBounds(122, 11, 535, 26);
		  add(txtusersnaoyaminehelpercaravancsv);
		  txtusersnaoyaminehelpercaravancsv.setColumns(10);
	
	}

	void Re()
	{
		aryList.clear();
	    tableModel.setRowCount(0);

		ReadData();
	}
	
	void ReadData()
	{
		//ArrayListに配列 会員情報のデータをコピー
	    for(int i = 0 ; i < mf.MemberInfo.length ; i++){
	      aryList.add(mf.MemberInfo[i]);//参照渡し.
	    }
		
		for(int i = 0 ; i <  aryList.size() ; i++){
	        tableModel.addRow(aryList.get(i));
	      }
		//デバッグ
		//System.out.println(mf.MemberInfo[0][1]);
	}
	void cp(String Id)
	{
		mf.Global = Integer.parseInt(Id) -1;
		mf.Output();
		
		//                   old               next
		mf.ChangePanel(mf.PanelNames[0], mf.PanelNames[1]);
	}
}
