/*
awt:
*/
import java.awt.*;

import java.awt.event.*;

class  AwtDemo
{
	public static void main(String[] args) 
	{
		//1�����崰�塣
		final Frame f = new Frame("my frame");
		
		//f.setSize(500,400);
		//f.setLocation(300,200);
		//2,�Դ���������á�
		f.setBounds(300,200,500,400);

		f.setLayout(new FlowLayout());


		//3������һЩ�����ڲ������
		//���������һ����ť��
		Button but = new Button("my button");


		//4������Щ���ͨ��add��������ӵ������С�
		f.add(but);

		//�����������һ���ر��¼���
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.out.println("adapter closing������"+e);
				System.exit(0);
			}
		});
		

		//����ť���һ���¼���
		but.addActionListener(new ActionListener()
		{
			private int count = 1;
			public void actionPerformed(ActionEvent e)
			{
				//System.out.println("��ť:"+e);

				f.add(new Button("new Button-"+count++));
				
				//f.setVisible(true);
				f.validate();
			}
		});



		//5,�ô�����ʾ��
		f.setVisible(true);


		

	}
}

/*

class My extends MyWindow
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}




class MyWindow implements WindowListener
{
	public void windowActivated(WindowEvent e) 
	{
//		System.out.println("windowActivated");
	}
//          �� Window ����Ϊ� Window ʱ���á� 
 public void windowClosed(WindowEvent e) 
	 {
//		System.out.println("windowClosed");
		
	}
//          ��Դ��ڵ��� dispose ������ر�ʱ���á� 
public  void windowClosing(WindowEvent e)
	{
//		System.out.println("windowClosing");
//		System.exit(0);
	}
//          �û���ͼ�Ӵ��ڵ�ϵͳ�˵��йرմ���ʱ���á� 
 public void windowDeactivated(WindowEvent e) 
	 {
//		System.out.println("windowDeactivated");
	}
//          �� Window �����ǻ Window ʱ���á� 
 public void windowDeiconified(WindowEvent e)
	 {
//		System.out.println("windowDeiconified");
	}
//          ���ڴ���С��״̬��Ϊ����״̬ʱ���á� 
 public void windowIconified(WindowEvent e) 
	 {
//		System.out.println("windowIconified");
	}
//          ���ڴ�����״̬��Ϊ��С��״̬ʱ���á� 
 public void windowOpened(WindowEvent e) 
	 {
//		System.out.println("windowOpened");
	}
//          �����״α�Ϊ�ɼ�ʱ���á� 

}
*/