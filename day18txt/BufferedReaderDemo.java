/*
��ʾ��ȡ������BufferedReader��

1,�����ַ���ȡ�������Դ�����������
2��Ϊ�����Ч�ʣ�������ȡ�����������󣬽���ȡ��������Ϊ�������ݸ��������Ĺ��캯����
3������ʹ�û�������readLine������һ�ζ�ȡһ�У�����ȡ�ı���Ч����ߡ�
4���رջ���������ʵ�����ڹر�����
*/
import java.io.*;
class  BufferedReaderDemo
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("buf.txt");

		BufferedReader bufr = new BufferedReader(fr);

		//BufferedReader bufr = new BufferedReader(new FileReader("buf.txt"));

		String line = null;

		while((line=bufr.readLine())!=null)
		{
			System.out.println(line);
		}
		bufr.close();
	}
}
