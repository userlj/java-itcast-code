import java.net.*;

class  URLDemo
{
	public static void main(String[] args)throws Exception 
	{

		String str = "http://192.168.1.253/myweb/1.html?name=zhangsan";
		URL url = new URL(str);
		/*
		 String getFile() :��ȡ�� URL ���ļ����� �����ݱ�getPath��һ��Query�����û��Query���������ݺ�getPathһ�¡�
		 String getHost():  ��ȡ�� URL ����������������ã��� 
		 String getPath() :��ȡ�� URL ��·�����֡� 
		 int getPort() :��ȡ�� URL �Ķ˿ںš� 
		 String getProtocol() :��ȡ�� URL ��Э�����ơ� 
		 String getQuery() :��ȡ�� URL �Ĳ�ѯ���֡�
		*/

		System.out.println("getProtocol:"+url.getProtocol());
		System.out.println("getPort:"+url.getPort());
		System.out.println("getHost:"+url.getHost());
		System.out.println("getFile:"+url.getFile());
		System.out.println("getPath:"+url.getPath());
		System.out.println("getQuery:"+url.getQuery());

		URLConnection conn = url.openConnection();

		System.out.println(conn);


	}
}


/*
int port = url.getPort();

if(port==-1)
	port = 80;




*/