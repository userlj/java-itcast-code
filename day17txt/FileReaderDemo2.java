/*
��һ�ֶ�ȡ��ʽ��
����������read������

*/
import java.io.*;
class  FileReaderDemo2
{
	public static void main(String[] args) 
	{

		FileReader fr = null;
		try
		{
			fr = new FileReader("text.txt");
			
			int ch = 0;

			while((ch=fr.read())!=-1)
			{
				System.out.print((char)ch);
			}

			/*
			// ʹ��read������һ�ζ�һ���ַ����÷������ص��ǣ��������Ǹ��ַ���
			int ch = fr.read();
			System.out.println((char)ch);
			int ch1 = fr.read();
			System.out.println((char)ch1);
			*/
		}
		catch (IOException e)
		{

			System.out.println(e.toString());
		}
		finally
		{
			if(fr!=null)
				try
				{
					fr.close();
				}
				catch (IOException e)
				{
					System.out.println("close:"+e.toString());
				}
		}
	}
}
