import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	MainFrame mf;
	
	private String[] columnNames2 = {"名前", "検索要素"};
	
	DefaultTableModel tableModel2 = new DefaultTableModel(columnNames2, 0);
	ArrayList<String[]> aryList2= new ArrayList<String[]>();

	private JTable table2;
	
	public SearchPanel(MainFrame m, String s) {
		mf = m;
		this.setName("SearchPanel");
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(0, 40, 750, 520);
		this.add(scrollPane);
		
		table2 = new JTable(tableModel2);
		scrollPane.setViewportView(table2);
		
		JButton button = new JButton("全一覧へ戻る");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mf.ChangePanel(mf.PanelNames[4], mf.PanelNames[0]);
			}
		});
		button.setBounds(0, 6, 117, 29);
		add(button);
		
	}

	void cp()
	{
		String Rent[][] = new String[mf.MemberInfo.length][2];
		
		for(int i = 0 ; i < mf.MemberInfo.length ; i++){
			Rent[i][0] = mf.MemberInfo[i][3];
			Rent[i][1] = mf.MemberInfo[i][mf.culum_no];
		}
			
		aryList2.clear();
	    tableModel2.setRowCount(0);
		
		//ArrayListに配列 会員情報のデータをコピー
	    for(int i = 0 ; i < mf.MemberInfo.length ; i++){
	    	aryList2.add(Rent[i]);//参照渡し.
	    }
		
		for(int i = 0 ; i <  aryList2.size() ; i++){
	        tableModel2.addRow(aryList2.get(i));
	      }
		
		mf.ChangePanel(mf.PanelNames[0], mf.PanelNames[4]);
	}
}
