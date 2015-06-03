import java.awt.*;
import java.awt.event.*;
import java.io.*;

class  MyMenu2
{

	private Frame f;
	private MenuBar mb;
	private Menu fileMenu;
	private MenuItem openItem,saveItem,closeItem;

	private TextArea ta;

	private FileDialog openDia,saveDia;
	private File file;

	MyMenu2()
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

		openDia = new FileDialog(f,"�ҵĴ򿪶Ի���",FileDialog.LOAD);
		saveDia = new FileDialog(f,"�ҵı���Ի���",FileDialog.SAVE);

		myEvent();

		f.setVisible(true);


	}

	public void myEvent()
	{
		saveItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

				if(file==null)
				{
					saveDia.setVisible(true);
					
					String str_dir = saveDia.getDirectory();
					String str_file = saveDia.getFile();
					if(str_dir==null || str_file==null)
						return;

					file = new File(str_dir,str_file);
				}

				try
				{
					BufferedWriter bufw = new BufferedWriter(new FileWriter(file));

					bufw.write(ta.getText());

					bufw.close();
					
				}
				catch (IOException ex)
				{
					System.out.println(ex.toString());
				}

			}
		});
		

		openItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				openDia.setVisible(true);


				
				//1,��ȡ���ļ�ѡ��Ի����б�ѡ���ļ���

				String str_dir = openDia.getDirectory();
				String str_file = openDia.getFile();
				if(str_dir==null || str_file==null)
					return;

//				System.out.println(str_dir+"...."+str_file);
				ta.setText("");
				file = new File(str_dir,str_file);
				

				BufferedReader bufr  = null;
				try
				{
					bufr = new BufferedReader(new FileReader(file));
					String line = null;

					while((line=bufr.readLine())!=null)
					{
						ta.append(line+"\r\n");
					}
				}
				catch (IOException ex)
				{
					System.out.println(ex.toString());
				}
				finally
				{
					if(bufr!=null)
						try
						{
							bufr.close();
						}
						catch( IOException ex)
						{
							System.out.println(ex.toString());
						}
				}
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
	}

	public static void main(String[] args) 
	{
		new MyMenu2();
	}
}
