/*
tcpЭ�飺
1���������ӡ�
2��ͨ����������������ӡ�
3���ǿɿ���Э�顣
4�����udp������


Ҳ�������˵㣺
1���ͻ��ˡ�Socket��
2������ˡ�ServerSocket��



*/
import java.net.*;
import java.io.*;
class ClientDemo 
{
	public static void main(String[] args) throws Exception
	{
		//1,����tcp�Ŀͻ���socket�����ڽ�������ʱ����Ҫָ��Ҫ���ӵ�Ŀ�ĵ�ַ�Ͷ˿ڡ�
		Socket s  = new Socket("192.168.1.253",9003);

		//2,ͨ��������socket�����ȡsocket�е������������getOutputStream������

		OutputStream out = s.getOutputStream();

		out.write("gemen,tcp lai la!".getBytes());

		s.close();
		
	}
}


class  ServerDemo
{
	public static void main(String[] args) throws Exception
	{

		//1,��������˵�tcp socket���񡣱���Ҫ����һ���˿ڡ�
		ServerSocket ss = new ServerSocket(9003);

		//2,ͨ������˵�socket�����accept������ȡ�����ϵĿͻ��˶���
		//��ΪҪʹ�û�ȡ���Ŀͻ��˶����socket���Ϳͻ��˽���ͨѶ��
		Socket s = ss.accept();
		
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+".....connected");


		//��ȡ�ͻ��˶���Ķ�ȡ������ȡ���ݡ�
		InputStream in = s.getInputStream();
		byte[] buf = new byte[1024];
		int len = in.read(buf);

		String str = new String(buf,0,len);
		
		
		System.out.println(str);

		s.close();
		ss.close();
	}
}
