import java.io.*;
/*
��ʾFileInputStream
*/
class  FileInputStreamDemo
{
	public static void main(String[] args) throws IOException
	{

		FileInputStream fis = new FileInputStream("fos.txt");

		//System.out.println(fis.available());
		/*
		//���ַ�ʽò�ƺ�ˬ��������ѭ���������ļ��������ʱ���ᵼ�´����ֽ����飬�ڴ������
		//Ҫ���á�
		byte[] buf = new byte[fis.available()];

		fis.read(buf);

		System.out.println(new String(buf));
		*/
		
		byte[] buf =new  byte[1024];
		int len = 0;

		while((len=fis.read(buf))!=-1)
		{
			System.out.println(new String(buf,0,len));
		}
		/**/
		fis.close();
	}
}
