/*
��ʾFileOutputStream��
*/
import java.io.*;
class  FileOutputStreamDemo
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("fos.txt");

		fos.write("abcede".getBytes());//����ֱ��д��Ŀ�ĵ��С�

		fos.close();//ֻ���ڹر���Դ��
		
	}
}
