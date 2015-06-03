import java.awt.*;
import java.awt.event.*;

/*
��ʾһ�²˵����Լ��Ӳ˵�.
*/
class  MyMenu
{

	private Frame f;
	private MenuBar mb;
	private Menu fileMenu;
	private MenuItem closeItem;

	private Menu subMenu;

	private MenuItem it1,it2;

	MyMenu()
	{
		init();
	}

	public void init()
	{
		f = new Frame("my window");

		f.setBounds(300,100,600,500);

		mb = new MenuBar();

		fileMenu = new Menu("�ļ�");

		closeItem = new MenuItem("�˳�");


		subMenu = new Menu("�Ӳ˵�");

		it1 = new MenuItem("����1");
		it2 = new MenuItem("����2");

		subMenu.add(it1);
		subMenu.add(it2);

		fileMenu.add(subMenu);


		fileMenu.add(closeItem);
		mb.add(fileMenu);

		f.setMenuBar(mb);

		myEvent();

		f.setVisible(true);


	}

	public void myEvent()
	{

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
	}

	public static void main(String[] args) 
	{
		new MyMenu();
	}
}
