import java.io.*;

/*
readLine����ԭ��
һ�ζ�һ�С�
����Ҫ�ж�һ���н�����ǡ�����windows �б����\r\n.

�÷������ص���һ�����ݵ��������س�����


ԭ��
��ʵ�õĻ����������һ�ζ�һ���ַ�������
��������ÿһ���ַ����������������ʱ�洢��
�������س���ʱ�������жϣ��������洢�س�����

�����������е��ַ����ݱ���ַ������ء�



*/
class  BufferedReaderDemo2
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("buf.txt");

		BufferedReader bufr = new BufferedReader(fr);

		//BufferedReader bufr = new BufferedReader(new FileReader("buf.txt"));

		String line = null;

		while((line=bufr.readLine())!=null)
		{
			System.out.print(line);
		}
		bufr.close();
	}
}
