/*

�ͻ���ͨ������¼�����ݣ����͵�����ˣ�
����˽��յ����ݺ�ת���ɴ�д�ڷ��ظ��ͻ��ˡ�

���ַ���˻��߿ͻ��˵ȴ��������

ԭ��
��Ϊ�ͻ��˺ͷ�����еĶ�������ʽ������
read�� readLine, accept��


*/
import java.net.*;
import java.io.*;
class TranseClient2 
{
	public static void main(String[] args) throws Exception
	{

		Socket s = new Socket("192.168.1.253",9004);
		//1,��ȡ����¼�롣
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

		//2,�����������������ˡ�

		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		//��ȡ����˷��ص����ݣ���socket��InputStream���а�װ��
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

		String line = null;



		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;

			out.println(line);

			String str = bufIn.readLine();
			System.out.println("server:"+str);
		}


		bufr.close();
		s.close();

	}
}
class TranseServer2
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(9004);

		Socket s = ss.accept();

		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"....connected");

		InputStream in = s.getInputStream();

		BufferedReader bufIn = new BufferedReader(new InputStreamReader(in));

		String line = null;


		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		while((line=bufIn.readLine())!=null)
		{
			System.out.println("client:"+line);

			out.println(line.toUpperCase());
		}

		s.close();
		ss.close();
	}
}
