/*
���󣺶�ȡһ��Ӳ�������е�һ���ı��ļ���

read():���Զ����¶�ȡ�ַ���

*/
import java.io.*;
class  FileReaderDemo
{
	public static void main(String[] args) throws IOException
	{
		//1������FileReader��ȡ�������ڹ�����Ҫָ��Ҫ��ȡ���ı��ļ���
		//��ʵ������һ���������������ļ��������
		FileReader fr = new FileReader("text.txt");

		//2,ʹ��Reader���е�read��ȡ���������ļ��е��ַ����ݶ���һ���ַ������С�
		char[] buf = new char[1024];//ͨ����������黺��ʱ������Ϊ1024����������

		
		int len = 0;

		while((len=fr.read(buf))!=-1)
		{
			System.out.println(new String(buf,0,len));
		}

	
		
		fr.close();

		/*
		//read�����ķ���ֵ����ʵ���صľ�����������װ���ַ�������
		int num = fr.read(buf);
		System.out.println(num+"::"+new String(buf));
		int num1 = fr.read(buf);
		System.out.println(num1+"::"+new String(buf,0,num1));
		
		int num2 = fr.read(buf);
		System.out.println(num2);
		*/
		/*
		//��ʾ����read���Զ����¶�ȡ��
		fr.read(buf);//�������������ַ�����һ��һ�������������С�

		System.out.println(new String(buf)+"..");//ab
		fr.read(buf);//�������������ַ�����һ��һ�������������С�

		System.out.println(new String(buf)+"..");

		*/
	}
}
