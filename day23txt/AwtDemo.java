import java.awt.*;
import java.awt.event.*;
class  AwtDemo
{
	private Frame f;
	private Button but,but1;
	
	AwtDemo()
	{
		init();
	}

	public void init()
	{
		f = new Frame("my frame");

		f.setBounds(300,200,100,200);

		f.setLayout(new FlowLayout());

		but = new Button("my button");
		but1 = new Button("��ѶQQ");

		f.add(but);
		f.add(but1);

		myEvent();

		f.setVisible(true);


	}

	public void myEvent()
	{
		//ʵ��һ���˳�����Ķ�����
		//Ҳ����ɴ��� �� ��ť�Ķ�������

		/*
		1����ȷ�¼�Դ��
		2����ȷ����������������ע�ᵽ�¼�Դ�ϣ���ͨ���¼�Դ��addXXXListener();
		3����ȷҪ����ľ��嶯����
		4�������嶯�����붨�嵽���嶯�������С�
		*/

		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		//����ť���һ��������,����ť�ʱ�����ڴ����д���һ���µİ�ť��
		but.addActionListener(new ActionListener()
		{
			int count = 1;
			public void actionPerformed(ActionEvent e)
			{
//				System.out.println("new Button--"+count++);

				//f.add(new Button("new Button--"+count++));

//				f.setVisible(true);

				//ͨ���¼����󣬻�ȡ�¼�Դ��
//				System.out.println(e.getSource());
				Button b = (Button)e.getSource();

//				System.out.println(b.getParent());

				Frame f1 = (Frame)b.getParent();

				f1.add(new Button("new Button--"+count++));

				f.validate();



			}
		});
		

		but1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					Runtime r  = Runtime.getRuntime();
					r.exec("C:\\Program Files\\Tencent\\QQ2009\\Bin\\QQ.exe");

				}
				catch (Exception ex)
				{
					System.out.println(ex.toString());
				}
				

			}
		});

	}

	public static void main(String[] args) 
	{
		new AwtDemo();
	}
}
