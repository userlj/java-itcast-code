
/*
�漰�����������������ת������

ת������Ĭ������ǣ�GBK.
*/
import java.io.*;
class  CharSetDemo
{
	public static void main(String[] args) throws IOException
	{
		//write();
		read();
	}

	public static void read()throws IOException
	{
		InputStreamReader isr = new InputStreamReader(new FileInputStream("UTF-8.txt"),"utf-8");
		char[] buf = new char[8];
		int len = isr.read(buf);

		String str = new String(buf,0,len);
		System.out.println(str);
	}

	public static void write()throws IOException
	{
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("UTF-8.txt"),"UTF-8");

		osw.write("���");
		osw.close();
	}
}
