import java.awt.*;
import java.awt.event.*;
import java.io.*;
class  MyWindow
{

	private Frame f;
	private TextField tf;
	private Button but ;
	private TextArea ta;

	MyWindow()
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

		f.add(tf);
		f.add(but);
		f.add(ta);

		myEvent();

		f.setVisible(true);

	}

	public void myEvent()
	{

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
		
		/*
		ͨ�������ť����ȡ�ı����е�Ŀ¼��
		������Ŀ¼�µ��ļ������ļ���������ʾ�ı������С�
		*/
		
		//������ı������е����ݡ�
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
			ta.setText("����·���ǷǷ���");



		/*
		//1,��ȡ���ı����е��ı���
		String text = tf.getText();
		//2,����ȡ�����ı���ӵ��ı������С�				
		ta.append(text+"\r\n");

		//3,���ı����������ա�
		tf.setText("");
		*/

	}
	public static void main(String[] args) 
	{
		new MyWindow();
	}
}
