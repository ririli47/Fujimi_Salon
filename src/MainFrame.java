import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//ファイルから読み込んだ会員情報
	//マジックナンバーとして会員を100人、データを14個として想定
	String MemberInfo[][] = new String[100][14];
	String PersonalMemberInfo[] = new String[14];
	int Global;
	int culum_no;
	
	//各パネルのインスタンスを生成
	public String[] PanelNames = {"TopPanel", "PersonalPanel", "RegisterPanel", "ResultPanel", "SearchPanel"};
    TopPanel TopPanel = new TopPanel(this, PanelNames[0]);
    PersonalPanel PersonalPanel = new PersonalPanel(this, PanelNames[1]);
	RegisterPanel RegisterPanel = new RegisterPanel(this, PanelNames[2]);
	ResultPanel ResultPanel = new ResultPanel(this, PanelNames[3]);
	SearchPanel SearchPanel = new SearchPanel(this, PanelNames[4]);
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu menu = new JMenu("新規登録");
	private final JMenu menu_1 = new JMenu("検索");
	private final JMenuItem menuItem = new JMenuItem("新規登録");
	private final JMenuItem mntmId = new JMenuItem("ID");
	private final JMenuItem mntmNewMenuItem = new JMenuItem("住所");
	private final JMenuItem menuItem_1 = new JMenuItem("会社名");
	private final JMenuItem menuItem_2 = new JMenuItem("役職");
	private final JMenuItem menuItem_3 = new JMenuItem("メールアドレス");
	private final JMenuItem menuItem_4 = new JMenuItem("電話番号");
	private final JMenuItem menuItem_5 = new JMenuItem("誕生日");
	private final JMenuItem menuItem_6 = new JMenuItem("ボトルキープ");
	private final JMenuItem menuItem_7 = new JMenuItem("グラスキープ");
	private final JMenuItem menuItem_8 = new JMenuItem("会費情報");
	private final JMenuItem menuItem_9 = new JMenuItem("備考");
	private final JMenuItem menuItem_10 = new JMenuItem("来店回数");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					//黄金比
					frame.setSize(712, 480);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		
		for(int i = 0;  i < 100;  i++)
		{
			for(int j = 0; j < 14; j++)
			{
				MemberInfo[i][j] = "";
			}
		}
		
		setTitle("富士見サロン会員管理システム");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		
		
		//各パネルをMainFrameに追加
		TopPanel.setSize(712, 440);
		getContentPane().add(TopPanel);
		TopPanel.setVisible(true);
        
		PersonalPanel.setSize(712, 440);
		getContentPane().add(PersonalPanel);
        PersonalPanel.setVisible(false);

		RegisterPanel.setSize(712, 440);
        getContentPane().add(RegisterPanel);
        RegisterPanel.setVisible(false);

		ResultPanel.setSize(712, 440);
        getContentPane().add(ResultPanel);
        ResultPanel.setVisible(false);

		SearchPanel.setSize(712, 440);
        getContentPane().add(SearchPanel);
        SearchPanel.setVisible(false);
        
        setJMenuBar(menuBar);
        
        menuBar.add(menu);
        menuItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		for(int i = 0;  i < 100;  i++)
        		{
        			if(MemberInfo[i][1] == "")
        			{
        				TopPanel.cp(MemberInfo[i][0]);
        				break;
        			}
        		}
        	}
        });
        
        menu.add(menuItem);
        
        menuBar.add(menu_1);
        mntmId.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		culum_no = 1;
        		SearchPanel.cp();
        	}
        });
        
        menu_1.add(mntmId);
        mntmNewMenuItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		culum_no = 3;
        		SearchPanel.cp();
        	}
        });
        
        menu_1.add(mntmNewMenuItem);
        menuItem_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		culum_no = 4;
        		SearchPanel.cp();
        	}
        });
        
        menu_1.add(menuItem_1);
        menuItem_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		culum_no = 5;
        		SearchPanel.cp();
        	}
        });
        
        menu_1.add(menuItem_2);
        menuItem_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		culum_no = 6;
        		SearchPanel.cp();
        	}
        });
        
        menu_1.add(menuItem_3);
        menuItem_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		culum_no = 7;
        		SearchPanel.cp();
        	}
        });
        
        menu_1.add(menuItem_4);
        menuItem_5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		culum_no = 8;
        		SearchPanel.cp();
        	}
        });
        
        menu_1.add(menuItem_5);
        menuItem_6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		culum_no = 9;
        		SearchPanel.cp();
        	}
        });
        menuItem_10.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		culum_no = 10;
        		SearchPanel.cp();
        	}
        });
        
        menu_1.add(menuItem_10);
        
        menu_1.add(menuItem_6);
        menuItem_7.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		culum_no = 11;
        		SearchPanel.cp();
        	}
        });
        
        menu_1.add(menuItem_7);
        menuItem_8.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		culum_no = 12;
        		SearchPanel.cp();
        	}
        });
        
        menu_1.add(menuItem_8);
        menuItem_9.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		culum_no = 13;
        		SearchPanel.cp();
        	}
        });
        
        menu_1.add(menuItem_9);

        try {
            //ファイルを読み込む
            FileReader fr = new FileReader("/Users/Naoya/mine/helper-caravan/富士見サロン会員情報.csv");
            BufferedReader br = new BufferedReader(fr);

            //読み込んだファイルを１行ずつ処理する
            String line;
            StringTokenizer token = null;
            int i = 0;
            int j = 0;
            while ((line = br.readLine()) != null) {
                //区切り文字","で分割する
                token = new StringTokenizer(line, ",");
                while(token.hasMoreTokens())
                {
                	MemberInfo[i][j] = token.nextToken();
            		//System.out.println(MemberInfo[i][j]);          	
                	j++;
                }
                j = 0;
                i++;
            }
            br.close();
        }
        catch(IOException ex) {
            //例外発生時処理
            ex.printStackTrace();        	
        }
	}

	//表示するパネルを変更する
	public void ChangePanel(String old, String next)
	{
		old = next;
		//現在のパネルを非表示にする
        if(old != PanelNames[0])
        {
            TopPanel.setVisible(false);
        }
        if(old != PanelNames[1])
        {
            PersonalPanel.setVisible(false);
        }
        if(old != PanelNames[2])
        {
            RegisterPanel.setVisible(false);
        }
        if(old != PanelNames[3])
        {
            ResultPanel.setVisible(false);
        }
        if(old != PanelNames[4])
        {
            SearchPanel.setVisible(false);
        }
        
        //次のパネルを表示する
        if(next == PanelNames[0])
        {
            TopPanel.setVisible(true);
        }
        else if(next == PanelNames[1])
        {
            PersonalPanel.setVisible(true);
        }
        else if(next == PanelNames[2])
        {
            RegisterPanel.setVisible(true);
        }
        else if(next == PanelNames[3])
        {
            ResultPanel.setVisible(true);
        }
        else if(next == PanelNames[4])
        {
            SearchPanel.setVisible(true);
        }
	}
	
	//一覧を読み込み直す
	public void Reload()
	{
		TopPanel.Re();
	}
	
	//PersonalPanelに情報を吐き出す
	public void Output()
	{
		PersonalPanel.SetInfo();
	}
}
