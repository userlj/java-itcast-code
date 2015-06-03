import java.awt.*;
import java.awt.event.*;

/*
��ʾһ�²˵����Լ��Ӳ˵�.
*/
class  Menu2
{

	private Frame f;
	private MenuBar mb;
	private Menu fileMenu;
	private MenuItem openItem,saveItem,closeItem;

	private TextArea ta;

	private FileDialog openDia;

	Menu2()
	{
		init();
	}

	public void init()
	{
		f = new Frame("my window");

		f.setBounds(300,100,600,500);

		mb = new MenuBar();

		fileMenu = new Menu("�ļ�");
		openItem = new MenuItem("��");
		saveItem = new MenuItem("����");
		closeItem = new MenuItem("�˳�");

		
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(closeItem);
		mb.add(fileMenu);

		f.setMenuBar(mb);

		ta = new TextArea();
		f.add(ta);

		openDia = new FileDialog(f,"�ҵĴ򿪶Ի���");

		myEvent();

		f.setVisible(true);


	}

	public void myEvent()
	{
		openItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				openDia.setVisible(true);
			}
		});

		closeItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		
		//�رմ��塣��������
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		openItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}	
		
		})

	public static void main(String[] args) 
	{
		new Menu2();
	}
}
