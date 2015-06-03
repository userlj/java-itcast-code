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
class TranseClient 
{
	public static void main(String[] args) throws Exception
	{

		Socket s = new Socket("192.168.1.253",9004);
		//1,��ȡ����¼�롣
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

		//2,�����������������ˡ�
		OutputStream out = s.getOutputStream();

		BufferedWriter bufOut = new BufferedWriter(new OutputStreamWriter(out));


		//��ȡ����˷��ص����ݣ���socket��InputStream���а�װ��
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

		String line = null;



		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;

			bufOut.write(line);
			bufOut.newLine();
			bufOut.flush();

			String str = bufIn.readLine();
			System.out.println("server:"+str);
		}


		bufr.close();
		s.close();

	}
}
class TranseServer
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(9004);

		Socket s = ss.accept();

		InputStream in = s.getInputStream();

		BufferedReader bufIn = new BufferedReader(new InputStreamReader(in));

		String line = null;


		BufferedWriter bufOut = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		while((line=bufIn.readLine())!=null)
		{
			System.out.println("client:"+line);
			bufOut.write(line.toUpperCase());
			bufOut.newLine();
			bufOut.flush();
		}

		s.close();
		ss.close();
	}
}
