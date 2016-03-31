import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JMenu;

public class MainFrame extends JFrame {

	//ファイルから読み込んだ会員情報
	//マジックナンバーとして会員を100人、データを16個として想定
	String MemberInfo[][] = new String[100][16];
	
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
	private final JMenuItem menuItem_1 = new JMenuItem("検索");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					//黄金比
					frame.setSize(712, 440);
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
		setTitle("富士見サロン会員管理システム");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100, 400, 400);
		
		
		//各パネルをMainFrameに追加
		TopPanel.setSize(712, 440);
		getContentPane().add(TopPanel);
		TopPanel.setVisible(true);
        
		getContentPane().add(PersonalPanel);
        PersonalPanel.setVisible(false);
        this.setBounds(100, 100, 712, 440);

        getContentPane().add(RegisterPanel);
        RegisterPanel.setVisible(false);
        this.setBounds(100, 100, 400, 200);

        getContentPane().add(ResultPanel);
        ResultPanel.setVisible(false);
        this.setBounds(100, 100, 400, 200);

        getContentPane().add(SearchPanel);
        SearchPanel.setVisible(false);
        this.setBounds(100, 100, 400, 200);
        
        setJMenuBar(menuBar);
        
        menuBar.add(menu);
        
        menu.add(menuItem);
        
        menuBar.add(menu_1);
        
        menu_1.add(menuItem_1);

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
		//現在のパネルを非表示にする
        if(old == PanelNames[0])
        {
            TopPanel.setVisible(false);
        }
        else if(old == PanelNames[1])
        {
            PersonalPanel.setVisible(false);
        }
        else if(old == PanelNames[2])
        {
            RegisterPanel.setVisible(false);
        }
        else if(old == PanelNames[3])
        {
            ResultPanel.setVisible(false);
        }
        else if(old == PanelNames[4])
        {
            SearchPanel.setVisible(false);
        }
        
        //次のパネルを表示する
        if(next == PanelNames[0])
        {
            TopPanel.setVisible(false);
        }
        else if(next == PanelNames[1])
        {
            PersonalPanel.setVisible(false);
        }
        else if(next == PanelNames[2])
        {
            RegisterPanel.setVisible(false);
        }
        else if(next == PanelNames[3])
        {
            ResultPanel.setVisible(false);
        }
        else if(next == PanelNames[4])
        {
            SearchPanel.setVisible(false);
        }
	}
}
