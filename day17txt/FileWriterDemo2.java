/*
��ʾio�쳣��try����ʽ��
*/
import java.io.*;
class FileWriterDemo2 
{
	public static void main(String[] args) 
	{
		FileWriter fw = null;
		
		try
		{
			fw  = new FileWriter("k:\\a.txt");
			fw.write("aaa");
			
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
