/*
�����ı��ļ���
copyԭ��
�ȶ�ȡԴ���ݣ��ý�����������д�뵽Ŀ�ĵ��С�

���ʹ������������ɣ�
1���ַ���ȡ������
2���ַ�д��������


ʹ�����ַ����黺������







*/
import  java.io.*;
class  CopyTextFile
{
	public static void main(String[] args) 
	{
		FileReader fr = null;
		FileWriter fw = null;
		try
		{
			fr = new FileReader("IO��.txt");
			fw = new FileWriter("copyio.txt");

			char[] buf = new char[1024];

			int len = 0;

			while((len=fr.read(buf))!=-1)
			{
				fw.write(buf,0,len);
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			if(fw!=null)
				try
				{
					fw.close();
				}
				catch (IOException e)
				{
					System.out.println(e.toString());
				}
			if(fr!=null)
				try
				{
					fr.close();
				}
				catch (IOException e)
				{
					System.out.println(e.toString());
				}
		}
		/*
		finally
		{
			try
			{
				if(fw!=null)
					fw.close();
			}
			catch ()
			{
			}
			finally
			{
				try
				{
					if(fr!=null)
						fr.close();
				}
				catch ()
				{
				}
			}
		}
		*/
	}
}
