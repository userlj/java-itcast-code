package mywin;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
class  MyWindow2
{

	private Frame f;
	private TextField tf;
	private Button but,okBut;
	private TextArea ta;
	private Dialog d;

	private Label lab;

	MyWindow2()
	{
		init();
	}
	public void init()
	{
		f = new Frame("my window");

		f.setBounds(300,100,600,500);

		f.setLayout(new FlowLayout());

		tf = new TextField(60);

		but = new Button("ת  ��");

		ta = new TextArea(24,70);


		d = new Dialog(f,"������ʾ",false);
		d.setBounds(400,200,200,150);
		d.setLayout(new FlowLayout());

		d.setResizable(false);


		lab = new Label();
		okBut = new Button("ȷ  ��");

		d.add(lab);
		d.add(okBut);

		f.add(tf);
		f.add(but);
		f.add(ta);

		myEvent();

		f.setVisible(true);

	}

	public void myEvent()
	{


		//���Ի�����ӹرն�����
		d.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				d.setVisible(false);
			}
		});

		okBut.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				d.setVisible(false);

			}
		});


		tf.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{

				if(e.getKeyCode()==KeyEvent.VK_ENTER)
					showDir();
			}
		});

		but.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				showDir();

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


	public void showDir()
	{
		
		ta.setText("");

		//1.��ȡ�ı����е�Ŀ¼������װ��file����
		String str_dir = tf.getText();
		File dir = new File(str_dir);

		if(dir.exists() && dir.isDirectory())
		{
			String[] names = dir.list();

			for(String name : names)
			{
				ta.append(name+"\r\n");
			}
		}
		else
		{

			String str = "�Ҳ���"+str_dir+",��ȷ��·���Ƿ���ȷ";
			lab.setText(str);
			d.setVisible(true);
		}

	}
	public static void main(String[] args) 
	{
		new MyWindow2();
	}
}
/*


1,����jar�����������Ϣ������һ���ļ���
	���ļ��������ݣ�
	Main-Class:�ո����.�����س�

	���û��д�ո񣺻��ڴ�jar��ʱ������IOException��
	���û���ڽ�β���س������ò���д�������ļ��С�


2����jar����
	jar -cvfm haha.jar �����ļ��� Ҫ�洢jar�����ļ�����


3����֤��
	ͨ��winrar�鿴һ�°�jar�е������ļ����Ƿ����Զ������Ϣ��

4�����߲˵�--�ļ���ѡ��---�ļ�����---��jar��չ�����ļ�ָ����������Ϊ jdk\bin\javaw.exe  -jar

5��˫������ִ�С�



*/