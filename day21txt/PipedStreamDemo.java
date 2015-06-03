/*
�ܵ�����
�ص㣺
	1���ܵ��������͹ܵ���������Խ������ӡ�
	2����Ҫ���߳̽��зֱ������

�����������ӷ�ʽ��
	1��ͨ�����캯������ʽ��
	2��ͨ��connect������


ʾ����
һ���̶߳���һ���߳�д��



*/
import java.io.*;
class Read implements Runnable
{

	private PipedInputStream pis;
	Read(PipedInputStream pis)
	{

		this.pis = pis;
	}
	public void run()
	{
		byte[] buf = new byte[1024];
		try
		{
			int len  = pis.read(buf);//����ʽ������

			String str = new String(buf,0,len);
			System.out.println(str);
			pis.close();
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		
		
	}
}

class Write implements Runnable
{
	private PipedOutputStream pos ;
	Write(PipedOutputStream pos)
	{
		this.pos = pos;
	}
	public void run()
	{
		try
		{


			Thread.sleep(5000);
			pos.write("hello piped lai le ".getBytes());



			pos.close();
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
	}
}

class  PipedStreamDemo
{
	public static void main(String[] args) throws IOException
	{
		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream();

		pis.connect(pos);

		new Thread(new Read(pis)).start();
		new Thread(new Write(pos)).start();


	}
}
