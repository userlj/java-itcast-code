/*
����д�����ݵ�һЩϸ�ڣ�
1��new FileWriter("a.txt");�ڴ���д��������ʱ������ָ��Ŀ¼�´����ļ���������ļ��Ѿ����ڣ��ᱻ���ǡ�

2����Ҫ�����е��ļ��������ݵ���д��ô���أ�
	����ʹ��FileWriter����һ����boolean�Ͳ����Ĺ��캯����

3����Ҫ��������д�뻻�С�
	ʹ��\n��ͨ�����±��鿴��ʱ�������С�ڿ�
	��ô����Ϊwindow�еĻس�����ʵ�������ַ�����ɵġ�\r\n

4��Ŀ�ĵ��ļ����������·����Ҳ�����Ǿ���·������ôд·���ָ�����ʱ��
	�����з�ʽ��\\   /
*/
import java.io.*;
class  FileWriterDemo3
{
	public static void main(String[] args) 
	{
		FileWriter fw = null;
		
		try
		{
			fw  = new FileWriter("c:/a.txt",true);
			fw.write("hello\r\nworld");
			
		}
		catch (IOException e)
		{
			System.out.println("io nono "+e.toString());
		}
		finally
		{
			if(fw!=null)//���������û�н����ɹ��ǲ�Ҫ�رյģ�����Ҫ����һ�½�׳�Ե��жϡ�
				try
				{
					fw.close();
				}
				catch (IOException e)
				{
					System.out.println("close:"+e.toString());
				}
			
		}
	}
}
/*

1����ָ���ַ������ݴ洢��һ���ļ��С���

2���Ը��ļ��������ݵ���д��

Ҫ��ʹ�ñ�׼�쳣������ʽ��

*/