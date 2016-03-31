import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

	//各パネルのインスタンスを生成
	public String[] PanelNames = {"TopPanel", "PersonalPanel", "RegisterPanel", "ResultPanel", "SearchPanel"};
    TopPanel TopPanel = new TopPanel(this, PanelNames[0]);
    PersonalPanel PersonalPanel = new PersonalPanel(this, PanelNames[1]);
	RegisterPanel RegisterPanel = new RegisterPanel(this, PanelNames[2]);
	ResultPanel ResultPanel = new ResultPanel(this, PanelNames[3]);
	SearchPanel SearchPanel = new SearchPanel(this, PanelNames[4]);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		//各パネルをMainFrameに追加
		TopPanel.setSize(400, 180);
		this.add(TopPanel);
		TopPanel.setVisible(true);
        
		this.add(PersonalPanel);
        PersonalPanel.setVisible(false);
        this.setBounds(100, 100, 400, 200);

        this.add(RegisterPanel);
        RegisterPanel.setVisible(false);
        this.setBounds(100, 100, 400, 200);

        this.add(ResultPanel);
        ResultPanel.setVisible(false);
        this.setBounds(100, 100, 400, 200);

        this.add(SearchPanel);
        SearchPanel.setVisible(false);
        this.setBounds(100, 100, 400, 200);

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