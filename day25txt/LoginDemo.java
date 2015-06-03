/*
����
ͨ���ͻ��˼���¼���û�����ʵ�ֵ�¼��
����˶Կͻ��˵ķ��͹������û�������У�顣
������û����ڣ��������ʾ�û���¼�����������ͻ��˻�ӭ���١�
������û������ڣ��������ʾ�û����Ե�¼�����������ͻ��ˣ����û������ڡ�

���⣬�ͻ������ֻ�ܳ��Ե�¼���Ρ�
�����Ҳһ�������޶���


˼·��
�ͻ��ˣ�
1������socket����
2����ȡ����¼�롣
3����¼���һ���û�������ͨ��socket�����������������ˡ�
4��������Ҫ��ȡ����˻�������Ϣ��
5���жϸ���Ϣ������л�ӭ������ʾ��¼�ɹ����û������������
��Ϊ���������ı������Կ���ʹ���ַ����������ϻ������Ч�ʡ�



*/
import java.net.*;
import java.io.*;

class  LoginClient
{
	public static void main(String[] args)throws Exception 
	{
		Socket s = new Socket("192.168.0.5",9007);
		//��ȡ����¼�룬��ȡ�û�����
		BufferedReader bufr = 
			new BufferedReader(new InputStreamReader(System.in));


		//��socket��������д�ӡ����¼����û������͸�����ˡ�
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);

		//��socket�������е����ݽ��л�ȡ����ʵ�����ڻ�ȡ����˵Ļ�����Ϣ��
		BufferedReader bufIn = 
				new BufferedReader(new InputStreamReader(s.getInputStream()));

		//�ͻ���ֵ����¼�����Ρ�
		for(int x=0; x<3; x++)
		{
			//�Ӽ��̶�ȡһ�С�
			String username = bufr.readLine();
			

			if(username==null)
			{
				//s.shutdownOutput();
				break;
			}
			//���������ݴ�ӡ��socket�������
			out.println(username);

			//��ȡ����˷�����Ϣ��
			String info = bufIn.readLine();
			System.out.println(info);
			if(info.contains("��ӭ"))
				break;
		}

		bufr.close();
		s.close();

	}
}

/*
����ˣ�
1������socket����
2�����ϻ�ȡ�ͻ��˶���
3�����ͻ��˶����װ���������߳��С�
4���޶��жϴ�����
5����ȡ�����û��ļ��б��Ի�ȡ���û�������У�顣
6������У����������Ӧ��Ϣ��
*/
class UserThread implements Runnable
{

	private Socket s;
	UserThread(Socket s)
	{
		this.s = s;
	}
	public void run()
	{
		try
		{
			for(int x=0; x<3; x++)
			{
				BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

				String name = bufIn.readLine();
				if(name==null)
				{
					System.out.println("������� ");
					break;
				}

				BufferedReader bufr = new BufferedReader(new FileReader("user.txt"));

				String line = null;

				PrintWriter out = new PrintWriter(s.getOutputStream(),true);
				boolean b = false;
				while((line=bufr.readLine())!=null)
				{
					if(line.equals(name))
					{
						b = true;
						break;
					}				
				}

				if(b)
				{
					System.out.println(name+"�ѵ�¼");
					out.println(name+"����ӭ����");
				}
				else
				{
					System.out.println(name+"���Ե�¼");
					out.println(name+"���û�������");
				}

			}
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			try
			{
				if(s!=null)
					s.close();
			}
			catch (Exception e)
			{
				System.out.println("close:"+e.toString());
			}
			
		}

	}
}

class  LoginServer
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(9007);

		while(true)
		{
			Socket s = ss.accept();
			System.out.println(s.getInetAddress().getHostAddress()+".....connected");
			new Thread(new UserThread(s)).start();
		}
	}
}