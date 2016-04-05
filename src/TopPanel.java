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
	
	private String[] columnNames = {"通し番号", "ID", "名前", "住所", "会社名", "役職", "メールアドレス", "電話番号", "誕生日", "来店回数", "ボトルキープ", "グラスキープ", "会費情報", "備考"};
	
	DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
	ArrayList<String[]> aryList= new ArrayList<String[]>();
	
	public TopPanel(MainFrame m, String s) {
		mf = m;

		setBackground(SystemColor.window);
		setLayout(null);
		 
		
		JButton btnNewButton = new JButton("読み込み");
		btnNewButton.setBounds(10, 10, 100, 30);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num == 0)
				{
					ReadData();
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
