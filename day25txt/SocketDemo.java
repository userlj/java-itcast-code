/*
InetAddress:��ip�����������ж���ķ�װ��
InetSocketAddress����ip+�˿ڻ�������+�˿ڽ��ж���ķ�װ��





socket�е��쳣��
1,SocketTimeoutException:�ͻ�������ʱ������ָ������ʱ�䣬�����ú���ʱ�䣬�ͻᷢ�����쳣��

2��ConnectException�����������Ͷ˿�ʧ�ܡ�



IOException
	|--MalformedURLException��url�޷�����ʱ��
	|--UnknownHostException��ip��ַ���󣬻����������ƴ���
	|--SocketException
		|--ConnectException
		|--BindException���˿ڱ����Ӧ�ó�����ʹ��ʱ��




*/
import java.net.*;
class  SocketDemo
{
	public static void main(String[] args) throws Exception
	{

		//Socket s = new Socket();

		
		//��ʾ��ʱ��
//		InetSocketAddress ias = new InetSocketAddress("192.168.0.253",9008);
//		s.connect(ias,3000);

		//Socket s1 = new Socket("192.168.1.253",9008);
//		System.out.println("Hello World!");


		//��ʾ���Ӹ�����
		Socket s1 = new Socket("192.168.1.253",9009);
		System.out.println(s1);
		Socket s2 = new Socket("192.168.1.253",9009);
		System.out.println(s2);
		Socket s3 = new Socket("192.168.1.253",9009);
		System.out.println(s3);

	}
}
