import java.awt.*;
import java.awt.event.*;

/*
��ʾһ�����ͼ��̼�����	
*/
class  AwtDemo2
{
	private Frame f;
	private Button but;

	private TextField tf;//�ı���
	
	AwtDemo2()
	{
		init();
	}

	public void init()
	{
		f = new Frame("my frame");

		f.setBounds(300,200,500,400);

		f.setLayout(new FlowLayout());


		tf = new TextField(30);
		but = new Button("my button");

		
		f.add(tf);
		f.add(but);

		myEvent();

		f.setVisible(true);


	}

	public void myEvent()
	{
		
		tf.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				/*
				if(e.getKeyCode()==KeyEvent.VK_A)
				{
					System.out.println("����A����");
					e.consume();
				}
				*/
				int code = e.getKeyCode();

				if(!(code>=KeyEvent.VK_0&& code<=KeyEvent.VK_9))
				{
					System.out.println("������Ƿ��ַ�");
					e.consume();
				}
			}


		});



		but.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				//System.out.println(KeyEvent.getKeyText(e.getKeyCode())+"::"+e.getKeyCode());
				
				if(e.isControlDown() && e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					System.out.println("ctrl+enter ��������");
				}
				
				/*
				if(e.getKeyCode()==KeyEvent.VK_ESCAPE)
				{
					System.out.println("�����˳�");
					System.exit(0);
				}
				*/

			}
		});

		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		//��ʱ��ť�Ļ������ֻҪ��ť��������ִ�У���ť�����������������1���������2�����̡�
		but.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("action run");
			}
		});

		but.addMouseListener(new MouseAdapter()
		{
			private int count = 1;
			
			public void mouseEntered(MouseEvent e)
			{
				System.out.println("enter "+count++);
			}

			public void mouseClicked(MouseEvent e)
			{
				if(e.getClickCount()==2)
					System.out.println("mouse double click"+count++);
			}
		});

	}

	public static void main(String[] args) 
	{
		new AwtDemo2();
	}
}
