import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
class  MyBrowseGUI
{

	private Frame f;
	private TextField tf;
	private Button but ;
	private TextArea ta;

	MyBrowseGUI()
	{
		init();
	}
	public void init()
	{
		f = new Frame("my browser");

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
		try
		{
			ta.setText("");

			String str_url = tf.getText();
			//���ı����е��ַ�����װ��url����
			URL url = new URL(str_url);
			
			//ͨ��url�����ȡurl���Ӷ���
			URLConnection conn = url.openConnection();

			//ͨ�����Ӷ����ȡ��ȡ����
			BufferedReader bufIn = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String line = null;

			while((line=bufIn.readLine())!=null)
			{
				ta.append(line+"\r\n");
			}



		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) 
	{
		new MyBrowseGUI();
	}
}
