/*
�ϴ��ı��ļ���

ԭ��
��ʵ���ǽ����ص��ļ�����ͨ��socket�������͵��˷���ˡ�����˶���Щ���ݽ����ļ��洢


*/

import java.io.*;
import java.net.*;
class  UploadClient
{
	public static void main(String[] args)throws Exception 
	{
		Socket s =new Socket("192.168.1.253",9005);

		//��ȡҪ�ϴ��ı����ı��ļ���Ϊ�����Ч�ʣ�ʹ���˻�������
		BufferedReader bufr = new BufferedReader(new FileReader("UdpDemo.java"));

		PrintWriter out = new PrintWriter(s.getOutputStream(),true);

		String line = null;

		while((line=bufr.readLine())!=null)
		{
			out.println(line.toUpperCase());
		}

		//out.println("");
			
		s.shutdownOutput();

		//��ȡ����˷��ӵ��ϴ��ɹ���Ϣ��
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String info = bufIn.readLine();
		System.out.println(info);

		bufr.close();

		s.close();


	}
}
class  UploadServer
{
	public static void main(String[] args) throws Exception
	{

		ServerSocket ss = new ServerSocket(9005);

		Socket s = ss.accept();
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"....connected");

		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

		PrintWriter pw = new PrintWriter(new FileWriter("server.txt"),true);

		String line = null;

		while((line=bufIn.readLine())!=null)
		{
			//if("over".equals(line))
				//break;
			pw.println(line);
		}

		PrintWriter out =new PrintWriter(s.getOutputStream(),true);
		out.println("�ϴ��ɹ�---");

		pw.close();

		s.close();

		ss.close();
	}
}
